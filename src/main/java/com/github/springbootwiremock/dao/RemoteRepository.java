package com.github.springbootwiremock.dao;

import com.github.springbootwiremock.pojo.UserDO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

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
@Repository
public class RemoteRepository {

    @Resource
    private RestTemplate restTemplate;

    public UserDO getUserDO(String url) {
        ResponseEntity<UserDO> responseEntity = restTemplate.getForEntity(url, UserDO.class);
        return responseEntity.getBody();
    }

}
