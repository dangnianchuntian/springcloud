package com.feign.consumer.controller;

import com.feign.api.GetNumApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private GetNumApi restFulService;


    @RequestMapping(value = "/consumer/getNum", method = RequestMethod.GET)
    public int getRandomInt() {

        return restFulService.getRandomInt();
    }

}
