package com.ljh.cash.gift_management.domain.mapper.provider

/**
 * Description:
 * Author: herily
 * Date: 17:13 2019/10/10
 */
class SchoolProvider {
    fun deleteSchoolById(id: Int): String {
        return "delete from gift_management.school_id where id = $id"
    }
}