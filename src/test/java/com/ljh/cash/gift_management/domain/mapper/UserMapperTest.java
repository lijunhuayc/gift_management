package com.ljh.cash.gift_management.domain.mapper;

import com.ljh.cash.gift_management.domain.model.SchoolModel;
import com.ljh.cash.gift_management.domain.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description:
 * Author: herily
 * Date: 16:18 2019/10/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        UserModel userModel = new UserModel();
        userModel.setName("黄晓明");
        userModel.setAge(34);
        userModel.setSex(1);
        userModel.setAddress("大巴上萧红市阆中区24号");
        userModel.setSchool_id(2L);
        userModel.setEmail("huangxiaoming@meb.com");
//        userModel.setId(1L);


        int result = 0;
        List<SchoolModel> list = null;
        try {
            result = userMapper.insert(userModel);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("result = " + result);
        UserModel userModel2 = userMapper.selectById(1L);
        System.out.println("userModel2 = " + userModel2);
        System.out.println("list = " + list);
    }

}
