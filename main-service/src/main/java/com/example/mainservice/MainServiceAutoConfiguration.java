package com.example.mainservice;

import com.example.mainservice.client.AccountFeignClient;
import com.example.mainservice.client.UserFeignClient;
import com.example.mainservice.service.AccountService;
import com.example.mainservice.service.UserService;
import com.example.mainservice.service.impl.AccountServiceImpl;
import com.example.mainservice.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableFeignClients
@Configuration
@Import({AccountFeignClient.class, UserFeignClient.class})
@RequiredArgsConstructor
public class MainServiceAutoConfiguration {

    private final AccountFeignClient accountFeignClient;
    private final UserFeignClient userFeignClient;

    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl(accountFeignClient);
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userFeignClient);
    }
}
