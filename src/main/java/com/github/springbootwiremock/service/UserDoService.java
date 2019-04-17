package com.github.springbootwiremock.service;

import com.github.springbootwiremock.dao.RemoteRepository;
import com.github.springbootwiremock.pojo.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 16:37 2019-04-17
 * 项目名称 spring-boot-wiremock
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Service
public class UserDoService {

    @Resource
    private RemoteRepository repository;

    public UserDO getUserDO() {
        return repository.getUserDO("http://127.0.0.1:8081/hello");
    }

}
