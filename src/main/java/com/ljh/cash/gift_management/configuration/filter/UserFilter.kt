package com.ljh.cash.gift_management.configuration.filter

import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @Desc: 说明
 * @Author: Junhua.Li
 * @CreateDate: 2021/8/19 4:49 下午
 */
open class UserFilter : Filter {
    override fun destroy() {
        println("UserFilter.destroy...")
        super.destroy()
    }

    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        println("UserFilter.doFilter...")
        (request as HttpServletRequest).apply {
            println("UserFilter: requestURI = $requestURI")
            println("UserFilter: requestURL = $requestURL")
        }
        (response as HttpServletResponse).apply {
            println("UserFilter: response.status = ${this.status}")

        }

        chain.doFilter(request, response)
    }

    override fun init(filterConfig: FilterConfig) {
        super.init(filterConfig)
        println("UserFilter.init...")
    }
}
