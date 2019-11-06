package com.ljh.cash.gift_management.initialize

import org.springframework.boot.CommandLineRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
 * Description:
 * Author: herily
 * Date: 14:49 2019/11/6
 */
@Component
@Order(1)
class OrderRunner1 : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("The OrderRunner1 start to initialize...")
    }
}