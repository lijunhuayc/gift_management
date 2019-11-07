package com.ljh.cash.gift_management.web;

import com.ljh.cash.gift_management.GiftManagementApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Description:
 * Author: herily
 * Date: 10:57 2019/11/7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@WebAppConfiguration
@SpringBootTest(classes = GiftManagementApplication.class)
public class HelloWorldControllerTests {
    private MockMvc mvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws Exception {
        //独立测试方式, 未成功
//        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldControllerTests()).build();
        //集成web环境方式 成功
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getHello() throws Exception {
        MvcResult mvcResult = mvc.perform(
                MockMvcRequestBuilders.get("/hello2.html"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        System.out.println("result: " + mvcResult.getResponse());
    }

}
