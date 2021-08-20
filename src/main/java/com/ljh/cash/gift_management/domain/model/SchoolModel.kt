package com.ljh.cash.gift_management.domain.model

import lombok.Data
import org.apache.ibatis.type.Alias

/**
 * Description:
 * Author: herily
 * Date: 15:22 2019/10/10
 */
@Alias("SchoolModel2")
//@Data
class SchoolModel(
    var id: Long?,
    var s_name: String?,
    var s_address: String?,
    var province: String?,
    var city: String?
) {


    override fun toString(): String {
        return "SchoolModel(id=$id, s_name=$s_name, s_address=$s_address, province=$province, city=$city)"
    }
}
