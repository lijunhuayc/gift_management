package com.ljh.cash.gift_management.configuration

import net.spy.memcached.MemcachedClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.net.InetSocketAddress

/**
 * Description:
 * Author: herily
 * Date: 16:17 2019/11/6
 */
//@Configuration
@Component
open class SpyMemcachedConfig : CommandLineRunner {
    @Value("\${memcache.ip}")
    var ip: String = ""
    @Value("\${memcache.port}")
    var port: Int = 0
    var client: MemcachedClient? = null

    override fun run(vararg args: String?) {
        println("initialize MemcachedClient...")
        try {
            client = MemcachedClient(InetSocketAddress(ip, port))
        } catch (e: Exception) {
        }
    }

}