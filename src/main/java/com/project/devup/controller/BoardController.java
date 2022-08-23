package com.project.devup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("boards")
public class BoardController {

    @GetMapping("/hot")
    public String initHot() {
        return "page/hot";
    }

    @GetMapping("/info")
    public String initInfo() {
        return "page/info";
    }

    @GetMapping("/square")
    public String initSquare() {
        return "page/square";
    }

    @GetMapping("/school")
    public String initSchool() {
        return "page/school";
    }

    @GetMapping("/company")
    public String initCompany() {
        return "page/company";
    }

    @GetMapping("/notice")
    public String initNotice() {
        return "page/notice";
    }

}
