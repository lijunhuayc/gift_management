package com.ljh.cash.gift_management.domain.mapper

import com.ljh.cash.gift_management.domain.model.UserModel
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper

/**
 * Description:
 * Author: herily
 * Date: 15:58 2019/11/7
 */
@Mapper
interface UserMapper {
    @Insert("insert into gift_management.user(name, age, sex, email, address, school_id) values(#{name},#{age},#{sex},#{email},#{address},#{school_id})")
    fun insert(userModel: UserModel): Int

}