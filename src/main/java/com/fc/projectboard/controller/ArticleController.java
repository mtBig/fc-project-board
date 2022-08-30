package com.fc.projectboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/articles")
@Controller
public class ArticleController {

    @GetMapping
    String articles(ModelMap map) {
        map.addAttribute("articles", List.of());
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    String article(ModelMap map, @PathVariable Long articleId) {
        map.addAttribute("article", "article"); // TODO: 구현 시에 실제 데이터 연동
        map.addAttribute("articleComments", List.of());

        return "articles/detail";
    }
}
