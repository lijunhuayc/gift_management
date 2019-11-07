package com.ljh.cash.gift_management.web

import com.ljh.cash.gift_management.controller.HelloWorldController
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.reactive.server.WebTestClient

/**
 * Description: failed 失败
 * Author: herily
 * Date: 15:23 2019/11/7
 */
@RunWith(SpringRunner::class)
@WebFluxTest(controllers = [HelloWorldController::class])
open class WebFluxHelloTest {
    @Autowired
    var webTestClient: WebTestClient? = null

    @Test
    fun getHello() {
        webTestClient?.apply {
            get().uri("/test_webflux").exchange().expectStatus().isOk
        }
    }

}
