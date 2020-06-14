package com.example.employeehubmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.employeehubmanager.entity.EmployeeAddress;
import com.example.employeehubmanager.service.EmployeeAddressService;

@Controller
public class EmployeeController {
	
	@Autowired
    private EmployeeAddressService employeeAddressService;
	
    @GetMapping("/employee")
    public String employee(Model model, @RequestParam(value="employeeCode", required=true) String employeeCode) {
    	List<EmployeeAddress> eployeeAddresses = (List<EmployeeAddress>) employeeAddressService.findAllByEmployeeCode(employeeCode);
    	
    	model.addAttribute("addresses", eployeeAddresses);
    	model.addAttribute("employee", eployeeAddresses.get(0).getEmployee());

        return "employee";
    }
    
}
