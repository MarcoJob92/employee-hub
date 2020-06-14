package com.example.employeehubmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeehubmanager.entity.EmployeeAddress;
import com.example.employeehubmanager.repository.EmployeeAddressRepository;

@Service
public class EmployeeAddressService {
	
	@Autowired
	private EmployeeAddressRepository employeeAddressRepository;
	
	
	public void add(EmployeeAddress employeeAddress) {
		employeeAddressRepository.save(employeeAddress);
	}
	
	public void saveList(Iterable<EmployeeAddress> employeeAddresses) {
		employeeAddressRepository.saveAll(employeeAddresses);
	}
	
	public Iterable<EmployeeAddress> findAll() {
      return employeeAddressRepository.findAll();
	}
	
	public Iterable<EmployeeAddress> findAllByEmployeeCode(String employeeCode) {
      return employeeAddressRepository.findAllByEmployee_EmployeeCode(employeeCode);
	}

}
