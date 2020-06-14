package com.example.employeehubmanager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employeehubmanager.entity.EmployeeAddress;

@Repository
public interface EmployeeAddressRepository extends CrudRepository<EmployeeAddress, Long> {
	
	public List<EmployeeAddress> findAllByEmployee_EmployeeCode(String employeeCode);
	
}