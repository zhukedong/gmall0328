package com.atguigu.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zkd
 * @Date: 2019/8/1 18:27
 */

@Controller
public class IndexController {

    @RequestMapping("attrListPage")
    public String attrListPage() {
        return "attrListPage";
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
