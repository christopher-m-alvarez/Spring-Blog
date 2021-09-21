package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{number}/and/{numbertwo}")
    @ResponseBody
    public int addingStuff(@PathVariable int number,
    @PathVariable int numbertwo) {
        return (number + numbertwo);
    }

    @GetMapping("/subtract/{number}/from/{numbertwo}")
    @ResponseBody
    public int subtractingStuff(@PathVariable int number,
                           @PathVariable int numbertwo) {
        return (number - numbertwo);
    }

    @GetMapping("/multiply/{number}/and/{numbertwo}")
    @ResponseBody
    public int multiplyStuff(@PathVariable int number,
                           @PathVariable int numbertwo) {
        return (number * numbertwo);
    }

    @GetMapping("/divide/{number}/by/{numbertwo}")
    @ResponseBody
    public int divideStuff(@PathVariable int number,
                           @PathVariable int numbertwo) {
        return (number / numbertwo);
    }

}


