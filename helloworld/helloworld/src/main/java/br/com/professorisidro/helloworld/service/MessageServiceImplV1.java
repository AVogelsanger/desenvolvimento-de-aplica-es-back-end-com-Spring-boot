package br.com.professorisidro.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImplV1 implements IMessageService{

    @Override
    public String sayCustomMessage(String original) {
        return original.toUpperCase();
    }
}
