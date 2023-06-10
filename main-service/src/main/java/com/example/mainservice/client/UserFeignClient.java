package com.example.mainservice.client;

import com.example.userapi.controller.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "UserClient", url = "http://localhost:8080")
public interface UserFeignClient extends UserApi {

}
