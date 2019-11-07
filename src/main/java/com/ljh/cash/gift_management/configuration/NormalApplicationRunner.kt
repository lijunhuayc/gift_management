package com.ljh.cash.gift_management.configuration

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.CommandLineRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
 * Description:
 * Author: herily
 * Date: 14:49 2019/11/6
 */
@Component
class NormalApplicationRunner : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("The NormalApplicationRunner start to initialize...")
    }
}