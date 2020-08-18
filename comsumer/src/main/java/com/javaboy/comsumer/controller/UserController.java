package com.javaboy.comsumer.controller;

import com.javaboy.comsumer.service.RpcCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    RpcCartService rpcCartService;
    @GetMapping("carts")
    public String getCarts(@RequestParam Integer id){
        return rpcCartService.getCarts(id);
    }
}
