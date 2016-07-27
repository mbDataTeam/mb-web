package com.mb.web.controller;

import com.mb.web.domain.Mytest;
import com.mb.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/7/18.
 */

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test/index", method = RequestMethod.GET)
    public Mytest Index(){
       return testService.getMytest();
    }
}
