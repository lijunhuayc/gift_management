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
        userModel.setName("黄 baby22");
        userModel.setAge(15);
        userModel.setSex(0);
        userModel.setAddress("成都市高新区211号");
        userModel.setSchool_id(121L);
        userModel.setEmail("huangxiaoming@meb22.com");
//        userModel.setId(1L);

        int result = 0;
        List<UserModel> list = null;
//        try {
//            result = userMapper.insertUser(userModel);
//            System.out.println("result = " + result);
//
//            userModel.setId(2L);
//            userModel.setName("秀一改不信a ？");
//            userModel.setAge(48);
//            userModel.setSex(1);
//            result = userMapper.updateUser(userModel);
//            System.out.println("result = " + result);
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        UserModel userModel2 = userMapper.selectUserById(1L);
        System.out.println("userModel2 = " + userModel2);

        list = userMapper.selectUserList();
        System.out.println("list = " + list);
    }

}
