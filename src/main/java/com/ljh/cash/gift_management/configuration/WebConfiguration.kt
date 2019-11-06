package com.ljh.cash.gift_management.configuration

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Configuration
import javax.servlet.*
import javax.servlet.http.HttpServletRequest

/**
 * Description: 测试Filter, 未生效
 * Author: herily
 * Date: 18:12 2019/10/31
 */
@Configuration
open class WebConfiguration {

    fun <T : Filter> testFilterRegistration(): FilterRegistrationBean<*> {
        val registrationBean = FilterRegistrationBean<T>()
        registrationBean.setFilter(MyFilter() as T)
        registrationBean.addUrlPatterns("/*")
        registrationBean.addInitParameter("paramName", "paramValue")
        registrationBean.setName("MyFilter")
        registrationBean.order = 1
        return registrationBean
    }
}

class MyFilter : Filter {
    override fun init(filterConfig: FilterConfig?) {
        super.init(filterConfig)
    }

    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        chain.doFilter(request, response)
        System.out.println("this is MyFilter, url = " + (request as HttpServletRequest).requestURI)
    }

    override fun destroy() {
        super.destroy()
    }
}