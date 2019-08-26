package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseCatalog1;

import com.atguigu.gmall.bean.BaseCatalog2;
import com.atguigu.gmall.bean.BaseCatalog3;
import com.atguigu.gmall.service.CatalogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zkd
 * @Date: 2019/8/2 19:32
 */
@RestController
    public class CatalogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1() {
       List<BaseCatalog1> baseCatalog1s = catalogService.getCatalog1();
       return baseCatalog1s;
    }

    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id) {
        List<BaseCatalog2> baseCatalog2s = catalogService.getCatalog2(catalog1Id);
        return baseCatalog2s;
    }

    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id) {
        List<BaseCatalog3> baseCatalog3s = catalogService.getCatalog3(catalog2Id);
        return baseCatalog3s;
    }

}
