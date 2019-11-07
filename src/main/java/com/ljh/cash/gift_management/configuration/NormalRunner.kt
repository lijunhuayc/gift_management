package com.ljh.cash.gift_management.configuration

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

/**
 * Description: SpringApplication.run 时初始化资源
 * Order注解相同的情况下 CommandLineRunner 优先于 ApplicationRun 执行
 * @Component 和 @Configuration 的区别是注入bean时是否会每次独立创建新的对象
 * Author: herily
 * Date: 14:49 2019/11/6
 */
@Configuration
//@Component
open class NormalRunner : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("The NormalRunner start to initialize...")
    }
}