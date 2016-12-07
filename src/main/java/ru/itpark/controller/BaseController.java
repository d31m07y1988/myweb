package ru.itpark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itpark.model.Item;
import ru.itpark.service.ItemService;
import ru.itpark.service.PageService;

import java.util.Collections;
import java.util.List;

/**
 * Created by Ramil on 05.12.2016.
 */

@Controller
public class BaseController {

    @Autowired
    PageService pageService;

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/")
    public String indexPage(Model model) {
        model.addAttribute("page",pageService.get(0));
        return "index";
    }

    @RequestMapping(value = "about.html")
    public String about(Model model) {
        model.addAttribute("page",pageService.get(1));
        return "index";
    }

    @RequestMapping(value = "catalog.html")
    public String catalog(Model model) {
        model.addAttribute("page",pageService.get(2));
        model.addAttribute("catalog",itemService.fetchAll());
        return "index";
    }

}
