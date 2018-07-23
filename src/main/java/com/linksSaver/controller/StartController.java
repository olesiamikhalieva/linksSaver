package com.linksSaver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class StartController {

    @RequestMapping(method = RequestMethod.GET)
    public String getMain(Model model) {
        model.addAttribute("start", "hello");
        return "start";
    }

    @RequestMapping(value = "1",method = RequestMethod.GET)
    public String getSign(Model model) {
        model.addAttribute("start", "hello");
        return "sign";
    }

    @RequestMapping(value = "2",method = RequestMethod.GET)
    public String getTest(Model model) {
        model.addAttribute("start", "hello");
        return "tes";
    }



}
