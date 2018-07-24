package com.airtel.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class ApplicationController {

    @Autowired
    DemoService demoService;
    @RequestMapping(name = "/index",method = RequestMethod.GET)
    public String index() throws Exception{

        System.out.println("Index Action called in controller at"+(new Date()).toString());
//        demoService.springReTryTest();
        return "Index called From Application One";
    }
}
