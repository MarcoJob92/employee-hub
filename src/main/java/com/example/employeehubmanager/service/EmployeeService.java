package com.example.employeehubmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeehubmanager.entity.Employee;
import com.example.employeehubmanager.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	
	public void add(Employee employee) {
    	employeeRepository.save(employee);
    }
	
	public void saveList(Iterable<Employee> employees) {
    	employeeRepository.saveAll(employees);
    }
	
	public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
	
}
