package com.example.employeehubmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImportController {
	
    @GetMapping({"/", "/import"})
    public String init() {
        return "import";
    }
    
}
