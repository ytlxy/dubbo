package com.itstart.dubbo.service.impl;

import com.itstart.dubbo.service.IMessagesService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceimpl implements IMessagesService {

    @Override
    public String helloMessage(String messages) {
        return "[MESSAGE]"+messages;
    }
}
