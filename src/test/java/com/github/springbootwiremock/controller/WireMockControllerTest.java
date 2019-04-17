package com.github.springbootwiremock.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.PrintingResultHandler;
import wiremock.org.apache.commons.lang3.RandomUtils;
import wiremock.org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * <p>
 * 创建时间为 16:39 2019-04-17
 * 项目名称 spring-boot-wiremock
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@AutoConfigureMockMvc
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@AutoConfigureWireMock(stubs = "classpath:/mock", port = 8081)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WireMockControllerTest {

    @Resource
    private MockMvc mvc;

    @Test
    public void getUserDO() throws Exception {
        String result = this.mvc.perform(MockMvcRequestBuilders.get("/get"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();
        Assert.assertTrue("预期不一致", StringUtils.equals(result,"{\"name\":\"TestName\",\"pass\":\"TestPass\"}"));
    }

}