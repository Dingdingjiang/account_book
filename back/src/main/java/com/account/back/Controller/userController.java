package com.account.back.Controller;

import com.account.back.Service.UserService;
import com.account.back.Util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping("user/{userId}") //通过userId获取用户信息
    @ResponseBody
    public ServerResponse getById(@PathVariable("userId") Integer userId) {
        System.out.println("controler getbyid...");
        return this.userService.getById(userId);
    }
}
