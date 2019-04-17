package com.github.springbootwiremock.controller;

import com.github.springbootwiremock.dao.RemoteRepository;
import com.github.springbootwiremock.pojo.UserDO;
import com.github.springbootwiremock.service.UserDoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 16:26 2019-04-17
 * 项目名称 spring-boot-wiremock
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class WireMockController {

    @Resource
    private UserDoService service;

    @GetMapping("get")
    public UserDO getUserDO() {
        return service.getUserDO();
    }

}
