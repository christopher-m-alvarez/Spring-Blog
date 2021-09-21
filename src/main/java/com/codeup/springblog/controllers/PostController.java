package com.codeup.springblog.controllers;

import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String getPosts() {
        return "Posts index page";
    }


    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId(@PathVariable int id) {
        return "invidual posts by "+ id + ".";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewForm() {
        return "View form to create post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a post";
    }
}

