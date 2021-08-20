package com.ljh.cash.gift_management.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.ljh.cash.gift_management.domain.mapper.SchoolMapper
import com.ljh.cash.gift_management.domain.mapper.UserMapper
import com.ljh.cash.gift_management.domain.model.UserModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @Desc: 说明
 * @Author: Junhua.Li
 * @CreateDate: 2021/7/26 5:26 下午
 */
@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    private val userMapper: UserMapper? = null

    @Autowired
    private val schoolMapper: SchoolMapper? = null

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") id: Long): UserModel? {
        return userMapper?.selectUserById(id)
    }

    @GetMapping("/")
    fun getUserList(): List<UserModel>? {
        return userMapper?.selectUserList()
    }

    @PostMapping("/")
    fun postUser(@RequestBody user: UserModel): String {
        println("user: ${user.toJson()}")
        val result = if (user.id == null) {
            userMapper?.insertUser(user)
        } else {
            userMapper?.updateUser(user)
        }
        return if (result ?: -1 > 0) {
            "success"
        } else {
            "failure"
        }
        return ""
    }

    private fun UserModel.toJson(): String {
        return ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this)
    }
}
