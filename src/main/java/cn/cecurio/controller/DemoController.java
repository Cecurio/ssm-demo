package cn.cecurio.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller Demo
 *
 * @author: Cecurio
 **/
@Controller
public class DemoController {
    @RequestMapping(value = "/demo",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> demoController() {
        Map<String, Object> map = new HashMap<>();
        map.put("desc", "this is a demo");
        map.put("component", Arrays.asList("Spring", "SpringMVC", "MyBatis"));
        return map;
    }
}
