package org.roon.club.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sample/")
@Controller
public class SampleController {
    @GetMapping("/all")
    public String all(){
        return "sample/all";
    }

    @GetMapping("/member")
    public String member(){
        return "sample/member";
    }

    @GetMapping("/admin")
    public String admin(){
        return "sample/admin";
    }

}
