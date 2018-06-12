package com.airtel.demo1;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DemoService {

        // try the method 9 times with 2 seconds delay.
        @Retryable(maxAttempts=9,value=Exception.class,backoff=@Backoff(delay = 500))
        public int springReTryTest() throws Exception {

            System.out.println("try!");
         double ran=Math.random();
            System.out.println(ran);
            if(ran%7!=0)
            {throw new Exception(); }
        return 24;
        }


}
