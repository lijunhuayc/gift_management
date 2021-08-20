package com.ljh.cash.gift_management.configuration

import org.springframework.boot.CommandLineRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service

/**
 * Description:
 * Author: herily
 * Date: 14:49 2019/11/6
 */
@Component
@Service
@Controller
@Order(1)   //未指定 @Order 优先级或优先级相同, 则按名称顺序加载
class OrderRunner1 : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("The OrderRunner1 start to initialize...")
    }
}