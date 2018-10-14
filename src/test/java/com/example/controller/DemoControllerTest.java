package com.example.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @author yangyang
 * @version 1.0
 * @date 2018/10/14 下午9:24
 * @description mock test Demo
 */
@RunWith(SpringRunner.class)
//SpringBootTest 是springboot 用于测试的注解，可指定启动类或者测试环境等，这里直接默认。
//因为是mock测试，在实际开发过程中，可指定其测试启动时为随机端口，避免了不必要的端口冲突。
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//测试单一接口时 ，也可利用注解@WebMvcTest 进行单一测试
//@WebMvcTest(DemoController.class)
public class DemoControllerTest extends BaseMockTest{

    @Test
    public void testDemo() throws Exception {


        String msg = "this is a mock test 张阳是头猪";
        /* 构建request 发送请求GET请求
          * MockMvcRequestBuilders 中有很多 请求方式。像get、post、put、delete等等
           */
        MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/mock")
                .param("msg",msg)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON)) // 断言返回结果是json
                .andReturn();// 得到返回结果


        MockHttpServletResponse response = mvcResult.getResponse();

        //拿到请求返回码
        int status = response.getStatus();
        //拿到结果
        String contentAsString = response.getContentAsString();

        System.out.println("response content : "+contentAsString);
        //断言 是否和预期相等
        Assert.assertEquals(msg, contentAsString);

    }
}
