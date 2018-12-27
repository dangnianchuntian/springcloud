package com.feign.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GetNumController {

    @RequestMapping(value = "/getNum", method = RequestMethod.GET)
    public int getRandomInt() {
        Random random = new Random();
        Integer num = random.nextInt(100);
        return num;
    }
}
