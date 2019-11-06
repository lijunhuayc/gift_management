package com.ljh.cash.gift_management.initialize

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * Description: Order注解相同的情况下 CommandLineRunner 优先于 ApplicationRun 执行
 * Author: herily
 * Date: 14:49 2019/11/6
 */
@Component
class NormalRunner : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("The NormalRunner start to initialize...")
    }
}