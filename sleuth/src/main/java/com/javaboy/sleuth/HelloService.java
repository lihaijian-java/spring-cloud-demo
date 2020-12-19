package com.javaboy.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.ws.Response;

/**
 * HelloService
 *
 * @author haijian.li
 * @version 1.0
 * 2020/12/14 10:21
 **/
@Service
public class HelloService {
    public final static Logger logger = LoggerFactory.getLogger(HelloService.class);

    @Async
    public String backgroudFun(){
        logger.info("backgroudFun");
        return "backgroudFun";
    }

//    @Scheduled(cron = "0/10 * * * * *")
//    public void Scheduling(){
//        logger.info("job start");
//        backgroudFun();
//        logger.info("job end");
//    }


}
