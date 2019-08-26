package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseAttrInfo;
import com.atguigu.gmall.service.AttrService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zkd
 * @Date: 2019/8/3 13:39
 */
@RestController
public class AttrController {

    @Reference
    AttrService attrService;


    @RequestMapping("saveAttr")
    public String saveAttr(BaseAttrInfo baseAttrInfo) {
        attrService.saveAttr(baseAttrInfo);

        return "success";
    }

    @RequestMapping("getAttrList")
    public List<BaseAttrInfo> getAttrList(String catalog3Id) {
        List<BaseAttrInfo> baseAttrInfos = attrService.getAttrList(catalog3Id);

        return baseAttrInfos;
    }
}
