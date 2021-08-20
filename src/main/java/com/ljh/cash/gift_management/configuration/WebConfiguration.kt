package com.ljh.cash.gift_management.configuration

import com.ljh.cash.gift_management.configuration.filter.UserFilter
import org.apache.catalina.filters.RemoteIpFilter
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @Desc: 说明
 * @Author: Junhua.Li
 * @CreateDate: 2021/8/19 4:57 下午
 */
@Configuration
open class WebConfiguration {

    @Bean
    open fun remoteIpFilter(): RemoteIpFilter {
        println("remoteIpFilter")
        return RemoteIpFilter()
    }

    @Bean
    open fun testFilterRegistration(): FilterRegistrationBean<*> {
        println("testFilterRegistration")
        return FilterRegistrationBean<UserFilter>().apply {
            filter = UserFilter()
            addUrlPatterns("/*")
            addInitParameter("paramName", "paramValue")
            setName("UserFilter")
            order = 1
        }
    }
}