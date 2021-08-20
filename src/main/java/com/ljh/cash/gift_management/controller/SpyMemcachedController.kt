package com.ljh.cash.gift_management.controller

import com.ljh.cash.gift_management.configuration.SpyMemcachedConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Description:
 * Author: herily
 * Date: 16:25 2019/11/6
 */
@RestController
class SpyMemcachedController {
    //    @Resource   //默认按名称装备,当找不到名称匹配时再按类型匹配,可指定name属性则只按名称匹配
    @Autowired    //默认按类型装配, 可与@Qualifier("xxBeanName")组合按名称装备
    var spyMemcachedConfig: SpyMemcachedConfig? = null

    @RequestMapping("/spyMemcachedIndex", method = [RequestMethod.GET, RequestMethod.POST])
    fun spyMemcachedIne(): String {
        spyMemcachedConfig?.apply {
            client?.apply {
                set("test_key", 2, "周星星你是谁")    //exp参数为缓存过期时间(秒)
                println("spyMemcached: 缓存 test_key = " + this["test_key"])
                Thread.sleep(1000)
                println("spyMemcached: 1秒后缓存 test_key = " + this["test_key"])
            }
        }
        return "test sypMemcached cache value!"
    }

}