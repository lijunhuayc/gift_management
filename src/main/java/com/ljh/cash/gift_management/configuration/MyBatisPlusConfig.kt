package com.ljh.cash.gift_management.configuration

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
import org.mybatis.spring.annotation.MapperScan
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Description:
 * Author: herily
 * Date: 11:46 2019/11/9
 */
@Configuration
@MapperScan("com.ljh.cash.gift_management.domain.mapper")
open class MyBatisPlusConfig {
    private val logger = LoggerFactory.getLogger(MyBatisPlusConfig::class.java)

    @Bean
    open fun paginationInterceptor(): PaginationInterceptor {
        logger.debug("注册分页插件")
        return PaginationInterceptor()
    }
}