package com.ljh.cash.gift_management.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * Author: herily
 * Date: 17:24 2019/11/7
 */
@Configuration  //@Configuration 和 @Component
//@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*"})
//@MapperScan("com.ljh.cash.gift_management.domain")
// #@MapperScan 批量扫描, 可以不用再每个Mapper接口添加 @Mapper 注解
public class MyBatisTestConfig {
    public MyBatisTestConfig() {
        System.out.println("MyBatisTestConfig.init...");
    }

    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Autowired
//    @Qualifier("dataSourceOne")
    private DataSource dataSourceOne;

    @Bean
    public PropertiesFactoryBean configProperties() throws Exception {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        propertiesFactoryBean.setLocations(resolver.getResources("classpath*:application.properties"));
        return propertiesFactoryBean;
    }

    @Bean(name = "dataSourceOne1")
    public HikariDataSource dataSourceOne() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaximumPoolSize(30);
        dataSource.setMinimumIdle(10);
        dataSource.setConnectionTestQuery("SELECT 1");
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("dataSourceOne1") DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSourceOne);
        /**
         * 参数通过 @Qualifier 注入的 bean 和 @Autowired 注入的 bean 是同一个对象（Spring 管理）
         */
        return dataSourceTransactionManager;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(@Qualifier("dataSourceOne1") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSourceOne());
        sqlSessionFactoryBean.setDataSource(dataSource);
        /**
         * PS：@Configuration 和 @Component 注解的一些区别
         * @Configuration 中包含 @Component
         * @Configuration 注解时调用 dataSourceOne()方法获取的 bean 同 @Qualifier（或者其他获取Spring容器bean的方式）获取到的bean是同一个对象（单例）
         * @Component 注解时调用 dataSourceOne()方法就是普通的java调用方法没，每次均返回一个新的bean
         *
         */
        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);

        List<String> mapperLocations = new ArrayList<>();
        mapperLocations.add("classpath:mapper/*.xml");
        mapperLocations.add("classpath*:com/gitee/sunchenbin/mybatis/actable/mapping/*/*.xml");
        List<Resource> resources = new ArrayList<>();
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        for (String mapperLocation : mapperLocations) {
            try {
                Resource[] mappers = resolver.getResources(mapperLocation);
                resources.addAll(Arrays.asList(mappers));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        sqlSessionFactoryBean.setMapperLocations(resources.toArray(new Resource[0]));
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.ljh.cash.gift_management.domain.model");
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource("mybatis-config.xml"));
        return sqlSessionFactoryBean;
    }

}
