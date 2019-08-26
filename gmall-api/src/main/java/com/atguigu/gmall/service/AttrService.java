package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseAttrInfo;

import java.util.List;

/**
 * @Author: zkd
 * @Date: 2019/8/3 13:43
 */
public interface AttrService {

    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);
}
