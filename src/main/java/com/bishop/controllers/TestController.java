package com.bishop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 09.10.12
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "home")
public class TestController {
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String home(){
        return "home/index";
    }
}
