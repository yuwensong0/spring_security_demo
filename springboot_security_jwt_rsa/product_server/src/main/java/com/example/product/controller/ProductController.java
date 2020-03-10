package com.example.product.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Secured("ROLE_PRODUCT")
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/findAll")
    public String findAll(){
        return "产品列表查询成功！";
    }

}
