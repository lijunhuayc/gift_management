package com.ljh.cash.gift_management.domain.mapper

import com.ljh.cash.gift_management.domain.mapper.provider.SchoolProvider
import com.ljh.cash.gift_management.domain.model.SchoolModel
import org.apache.ibatis.annotations.*

/**
 * Description:
 * Author: herily
 * Date: 15:24 2019/10/10
 */
@Mapper
interface SchoolMapper {
    @Insert("insert into gift_management.school(school_name, school_address, province, city) values(#{school_name},#{school_name},#{province},#{city})")
    fun insert(schoolModel: SchoolModel): Int

    @DeleteProvider(type = SchoolProvider::class, method = "deleteSchoolById")
    fun deleteSchoolById(@Param("id") schoolId: Int)

    @Select("select * from gift_management.school")
    fun selectSchools2(): List<SchoolModel>

    //    @Select("select * from gift_management.school")
    fun selectSchools(): List<SchoolModel>

    fun updateSchool(schoolModel: SchoolModel): Int

    @Update("update gift_management.school set school_name=#{school_name}, school_address=#{school_address} where id = #{id}")
    fun updateSchool2(schoolModel: SchoolModel): Int
}
