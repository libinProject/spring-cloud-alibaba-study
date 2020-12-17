package com.itbin.study.streamprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/27 16:41
 * @description:
 * @modified By:
 */
@RestController
public class SendController {

    @Autowired
    MySource mySource;

    @GetMapping("stream/send")
    public String streamSend(String msg){
        mySource.output1().send(MessageBuilder.withPayload(msg).build());
        return "ok";
    }
}
