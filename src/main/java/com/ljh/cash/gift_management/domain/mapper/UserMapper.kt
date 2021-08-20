package com.ljh.cash.gift_management.domain.mapper

import com.ljh.cash.gift_management.domain.model.UserModel
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update
import org.springframework.stereotype.Repository

/**
 * Description:
 * Author: herily
 * Date: 15:58 2019/11/7
 */
//@Mapper   //添加 @MapperScan 批量扫描则可以不用再每个Mapper接口添加 @Mapper 注解
@Repository //避免 Autowired注解变量处飘红色
interface UserMapper {
    @Insert("insert into gift_management.user(name, age, sex, email, address, school_id) values(#{name},#{age},#{sex},#{email},#{address},#{school_id})")
    fun insertUser(user: UserModel): Int

    @Select("select * from gift_management.user")
    fun selectUserList(): List<UserModel>

    fun selectUserById(id: Long): UserModel

    fun updateUser(user: UserModel): Int
}