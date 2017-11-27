package cn.cecurio.controller;

import cn.cecurio.bo.R;
import cn.cecurio.entity.UserEntity;
import cn.cecurio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

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

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    @ResponseBody
    public R addUser(@Valid UserEntity userEntity, BindingResult result) {
        if (result.hasErrors()) {
            R r = R.badRequest();
            r.setMsg(extractErrorMessage(result));
            return r;
        }
        userEntity.setCreateTime(new Date());
        userEntity.setActiveStatus(true);
        return userService.addOne(userEntity);
    }

    public static String extractErrorMessage(BindingResult result) {
        List<ObjectError> errorList = result.getAllErrors();
        if (result.hasErrors()) {
            System.out.println(errorList);
            return errorList.get(0).getDefaultMessage();
        }
        return null;
    }

}
