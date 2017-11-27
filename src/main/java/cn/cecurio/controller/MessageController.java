package cn.cecurio.controller;

import cn.cecurio.bo.R;
import cn.cecurio.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Cecurio
 * @create: 2017-11-24 19:34
 **/
@Controller
public class MessageController {
    @Autowired
    public MessageService messageService;

    @RequestMapping(value = "/message/all",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public R select() {
        return messageService.selectAll();
    }
}
