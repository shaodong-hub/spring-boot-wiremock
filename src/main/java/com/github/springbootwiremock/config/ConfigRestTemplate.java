package com.github.springbootwiremock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 创建时间为 16:27 2019-04-17
 * 项目名称 spring-boot-wiremock
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Configuration
public class ConfigRestTemplate {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
