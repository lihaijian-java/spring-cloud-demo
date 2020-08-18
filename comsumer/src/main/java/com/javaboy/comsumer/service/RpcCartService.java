package com.javaboy.comsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface RpcCartService {

    @RequestMapping(value = "cart/selectCart", method = RequestMethod.GET, consumes = "application/json")
    String getCarts(@RequestParam("uid") Integer id);
}
