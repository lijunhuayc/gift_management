package com.ljh.cash.gift_management.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * Description: 自定义配置属性读取
 * Author: herily
 * Date: 10:15 2019/11/1
 */
@Component
class NeoProperties {
    @Value("\${com.neo.title}")
    private var title: String? = null
    @Value("\${com.neo.description}")
    private var description: String? = null

}