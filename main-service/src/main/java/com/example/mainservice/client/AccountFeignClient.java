package com.example.mainservice.client;

import com.example.userapi.controller.AccountApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "AccountClient", url = "http://localhost:8080")
public interface AccountFeignClient extends AccountApi {

}
