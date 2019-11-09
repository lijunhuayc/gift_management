package com.ljh.cash.gift_management.domain.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.ljh.cash.gift_management.domain.model.UserModel
import org.apache.ibatis.annotations.Mapper

/**
 * Description:
 * Author: herily
 * Date: 15:58 2019/11/7
 */
@Mapper
interface UserMapper : BaseMapper<UserModel> {
}