package com.project.devup.controller;

import com.project.devup.entity.Menu;
import com.project.devup.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String init() {
        return "page/home";
    }

    @GetMapping("menu")
    @ResponseBody
    public List<Menu> main(@RequestParam("authId") String authId) {
        List<Menu> topMenu = mainService.getTopMenu(authId);
        return topMenu;
    }
}
