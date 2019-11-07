package com.ljh.cash.gift_management.controller

import com.ljh.cash.gift_management.domain.model.SchoolModel
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Description:
 * Author: herily
 * Date: 15:44 2019/10/9
 */
@Controller
class HelloWorldController {

    @RequestMapping("/hello.html", method = [RequestMethod.GET])
    @ResponseBody
    fun say(): SchoolModel {
        println("test hello.html")
        return SchoolModel(3, "四川省大英中学3", "四川省遂宁市大英县3", null, null)
    }

    @RequestMapping("/hello2.html") //默认 GET & POST
    fun say2(): String {
        return "test-web"
    }

}
