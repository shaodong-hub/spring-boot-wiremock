package com.github.springbootwiremock.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 创建时间为 16:28 2019-04-17
 * 项目名称 spring-boot-wiremock
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Getter
@Setter
public class UserDO {

    private String name;

    private String pass;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
