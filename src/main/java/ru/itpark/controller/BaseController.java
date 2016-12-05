package ru.itpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ramil on 05.12.2016.
 */

@Controller
public class BaseController {

    @RequestMapping(value = "/")
    public String indexPage(Model model) {

        return "index";
    }

}
