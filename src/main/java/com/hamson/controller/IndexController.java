package com.hamson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 获取首页的控制器
 *
 * @author Hamson
 * @date 2018/12/28
 *
 */
@Controller
public class IndexController {


    @RequestMapping(value = "/app/index", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

}
