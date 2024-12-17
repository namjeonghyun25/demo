package com.example.demo.controller;

import com.example.demo.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class Controller {

    @Autowired
    private MessageUtil messageUtil;

    @GetMapping(value = "/api")
    public String api(){
        return messageUtil.getMessage("common.success");
    }
}
