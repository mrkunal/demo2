package com.airtel.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.UUID;

@RestController
public class ApplicationController {

    @Autowired
    DemoService demoService;
    @RequestMapping(name = "/index",method = RequestMethod.GET)
    public String index() throws Exception{

  Logger logger = LoggerFactory.getLogger(ApplicationController.class);
       UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

         for(int i=0;i<10;i++){
	 
	        logger.info("This is an information message {} {}",randomUUIDString,i);

	        logger.error("this is a error message {} {}",randomUUIDString,i);

	        logger.warn("this is a warning message {} {}",randomUUIDString,i);
             }
        System.out.println("Index Action called in from DOCKER 1 controller at :"+randomUUIDString+(new Date()).toString());
//        demoService.springReTryTest();
        return "Index called From Application DOCKER 1"+randomUUIDString;
    }
}
