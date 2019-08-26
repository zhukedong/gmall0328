package com.atguigu.gmall.user.cotroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zkd
 * @date 2019/7/23 19:28
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("userInfoList")
    public ResponseEntity<List<UserInfo>>userInfoList() {

        List<UserInfo> userInfoList = userService.userInfoList();

        return ResponseEntity.ok(userInfoList);
    }
}
