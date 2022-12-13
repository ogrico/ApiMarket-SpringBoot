package com.geovany.apimarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {

    java.util.Date date = new Date();

    @GetMapping("/message")
    public Object service(){
        return "Hola desde spring " + date;
    }

}