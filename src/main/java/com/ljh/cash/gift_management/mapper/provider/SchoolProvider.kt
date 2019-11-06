package com.ljh.cash.gift_management.mapper.provider

/**
 * Description:
 * Author: herily
 * Date: 17:13 2019/10/10
 */
class SchoolProvider {
    fun deleteSchoolById(id: Int): String {
        return "delete from gift_management.school where id = $id"
    }
}