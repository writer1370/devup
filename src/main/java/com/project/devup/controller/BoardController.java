package com.project.devup.controller;

import com.project.devup.entity.Board;
import com.project.devup.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/{menuUrl}")
    public String init(@PathVariable("menuUrl") String menuUrl, Model model) {
        List<Board> result = boardService.findAllByMenuUrl(menuUrl);
        model.addAttribute("contentList", result);
        return "page/"+menuUrl;
    }

    @GetMapping("/{menuUrl}/{category}")
    public String initCategory(@PathVariable("menuUrl") String menuUrl,
                       @PathVariable("category") String category,
                       Model model) {
        List<Board> result = boardService.findAllByCategory(menuUrl, category);
        model.addAttribute("contentList", result);
        return "page/"+menuUrl;
    }
}
