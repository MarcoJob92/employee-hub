package com.example.employeehubmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.employeehubmanager.entity.Employee;
import com.example.employeehubmanager.utility.XlsxReader;

@Controller
public class EmployeeListController {
	
	@Autowired
	private XlsxReader reader;
	
    @GetMapping("/list")
    public String hello(Model model) {
    	List<Employee> employees = reader.readDataFromXlsx();
    	model.addAttribute("employees", employees);
    	
        return "list";
    }
    
}
