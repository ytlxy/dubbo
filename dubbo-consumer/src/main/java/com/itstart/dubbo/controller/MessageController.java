package com.itstart.dubbo.controller;

import com.itstart.dubbo.service.IMessagesService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
    @Reference
    private IMessagesService iMessagesService;

    @RequestMapping
    public String helloMessage(String message){
        return iMessagesService.helloMessage(message);
    }
}
