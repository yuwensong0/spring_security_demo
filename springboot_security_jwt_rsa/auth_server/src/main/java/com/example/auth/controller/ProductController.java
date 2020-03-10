package com.example.auth.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 这里写多个角色是或的关系
// 这里的权限跟.antMatchers("/product/**").hasAnyRole("USER", "PRODUCT")构成且的关系
@Secured({"ROLE_PRODUCT", "ROLE_USER"})
@RequestMapping("/product")
public class ProductController {

//    @Secured("ROLE_PRODUCT")
    @RequestMapping("/findAll")
    public String findAll(){
        return "产品列表查询成功！";
    }

}
