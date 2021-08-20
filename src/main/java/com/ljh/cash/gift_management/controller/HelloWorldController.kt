package com.ljh.cash.gift_management.controller

import com.ljh.cash.gift_management.domain.model.SchoolModel
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Description:
 * Author: herily
 * Date: 15:44 2019/10/9
 */
/**
 * @Controller @Service @Repository 均同 @Component，前三者注解各个业务层，而@Component泛化
 *
 * Spring 2.5 在 @Repository的基础上增加了功能类似的额外三个
 * 注解：@Component、@Service、@Constroller，它们分别用于软件系统的不同层次：
@Component 是一个泛化的概念，仅仅表示一个组件 (Bean) ，可以作用在任何层次。
@Service 通常作用在业务层，但是目前该功能与 @Component 相同。
@Constroller 通常作用在控制层，但是目前该功能与 @Component 相同。
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
