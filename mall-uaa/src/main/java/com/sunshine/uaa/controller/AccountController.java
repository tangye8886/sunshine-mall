package com.sunshine.uaa.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (TUser)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-09 23:20:47
 */
@RestController
@RequestMapping("api/account")
public class AccountController extends ApiController {

    @GetMapping("query")
    public String query() {
        return "query";
    }

    @GetMapping("insert")
    public String insert() {
        return "insert";
    }

    @GetMapping("update")
    public String update() {
        return "update";
    }

    @GetMapping("delete")
    public String delete() {
        return "delete";
    }

}