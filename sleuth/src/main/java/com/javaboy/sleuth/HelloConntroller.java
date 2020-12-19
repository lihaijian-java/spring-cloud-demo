package com.javaboy.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * HelloConntroller
 *
 * @author haijian.li
 * @version 1.0
 * 2020/12/14 10:09
 **/
@RestController
public class HelloConntroller {

  public final static Logger logger = LoggerFactory.getLogger(HelloConntroller.class);

  @Autowired
    RestTemplate restTemplate;
    @GetMapping("/hello")
    public String hello(){
        logger.info("hello spring cloud sleuth");
        return "hello spring cloud sleuth";
    }

    @GetMapping("/hello2")
    public void  hello2() throws InterruptedException {
         logger.info("hello2");
         Thread.sleep(1000);
        String forObject = restTemplate.getForObject("http://localhost:8080/hello3",String.class);
        System.out.println(forObject);
    }



    @GetMapping("/hello3")
    public String  hello3() throws InterruptedException {
        logger.info("hello3");
        Thread.sleep(1000);
        return "hello3";
    }

    @Autowired
    HelloService helloService;
    @GetMapping("hello4")
    public String hello4(){
        logger.info("hello4");
        return helloService.backgroudFun();
    }

    @PostMapping("/test")
    public ResultBean test(@RequestBody User user){
        logger.info("test服务");
        return new ResultBean(true,200,"成功",user);
    }
}
