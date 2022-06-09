package com.hroac.springbootdi.controller;

import com.hroac.springbootdi.model.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private IServicio servicio;

    @GetMapping({"","/","/index"})
    public String index(Model model) {

        model.addAttribute("objeto", servicio.operacion());

        return "index";
    }
}
