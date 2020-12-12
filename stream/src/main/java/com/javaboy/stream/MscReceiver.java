package com.javaboy.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * MscReceiver
 *
 * @author haijian.li
 * @version 1.0
 * 2020/12/13 1:29
 **/
//绑定Sink消息通道
@EnableBinding(Sink.class)
public class MscReceiver {
    public final static Logger logger = LoggerFactory.getLogger(MscReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        logger.info("Receiver:"+payload);
    }
}
