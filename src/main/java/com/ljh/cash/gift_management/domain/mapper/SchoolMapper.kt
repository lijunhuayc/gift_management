package com.ljh.cash.gift_management.domain.mapper

import com.ljh.cash.gift_management.domain.mapper.provider.SchoolProvider
import com.ljh.cash.gift_management.domain.model.SchoolModel
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository

/**
 * Description:
 * Author: herily
 * Date: 15:24 2019/10/10
 */
//@Mapper   //添加 @MapperScan 批量扫描则可以不用再每个Mapper接口添加 @Mapper 注解
@Repository //避免 Autowired注解变量处飘红色
interface SchoolMapper {
    @Insert("insert into gift_management.school(s_name, s_address, province, city) values(#{s_name},#{s_name},#{province},#{city})")
    fun insert(schoolModel: SchoolModel): Int

    @DeleteProvider(type = SchoolProvider::class, method = "deleteSchoolById")
    fun deleteSchoolById(@Param("id") schoolId: Int)

    @Select("select * from gift_management.school")
    fun selectSchools2(): List<SchoolModel>

    //    @Select("select * from gift_management.school")
    fun selectSchools(): List<SchoolModel>

    fun updateSchool(schoolModel: SchoolModel): Int

    @Update("update gift_management.school set s_name=#{s_name}, s_address=#{s_address} where id = #{id}")
    fun updateSchool2(schoolModel: SchoolModel): Int
}
