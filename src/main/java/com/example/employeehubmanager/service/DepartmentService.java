package com.example.employeehubmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeehubmanager.entity.Department;
import com.example.employeehubmanager.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
    private DepartmentRepository departmentRepository;
	
	
	public void add(Department department) {
		departmentRepository.save(department);
    }
	
	public void saveList(Iterable<Department> departments) {
		departmentRepository.saveAll(departments);
    }
	
	public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }
	
}
