package com.ljh.cash.gift_management

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
open class GiftManagementApplication : SpringBootServletInitializer() {
    override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
        return builder.sources(GiftManagementApplication::class.java)
    }
}

fun main(vararg args: String) {
    println("The service to start")
    SpringApplication.run(GiftManagementApplication::class.java, *args)
    println("The service has started")
}
