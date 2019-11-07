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
    @Insert("insert into gift_management.school_id(s_name, s_address, province, city) values(#{s_name},#{s_name},#{province},#{city})")
    fun insert(schoolModel: SchoolModel): Int

    @DeleteProvider(type = SchoolProvider::class, method = "deleteSchoolById")
    fun deleteSchoolById(@Param("id") schoolId: Int)

    @Select("select * from gift_management.school_id")
    fun selectSchools2(): List<SchoolModel>

    //    @Select("select * from gift_management.school_id")
    fun selectSchools(): List<SchoolModel>

    fun updateSchool(schoolModel: SchoolModel): Int

    @Update("update gift_management.school_id set s_name=#{s_name}, s_address=#{s_address} where id = #{id}")
    fun updateSchool2(schoolModel: SchoolModel): Int
}
