package com.red.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Niu Qianghong on 2017-09-05 0005.
 */
@Controller
public class TestController {

    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/test")
    public String test(){
        return "life/expense_add";
    }

    @RequestMapping("/index")
    public String index(){
        return "basic";
    }
}
