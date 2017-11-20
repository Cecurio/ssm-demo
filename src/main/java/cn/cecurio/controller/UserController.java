package cn.cecurio.controller;

import cn.cecurio.bo.R;
import cn.cecurio.entity.UserEntity;
import cn.cecurio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Cecurio
 * @create: 2017-11-20 21:17
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/get/all")
    @ResponseBody
    public R getAll() {
        return userService.selectAll();
    }
}
