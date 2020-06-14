package com.example.employeehubmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.employeehubmanager.entity.Employee;
import com.example.employeehubmanager.entity.EmployeeAddress;
import com.example.employeehubmanager.service.EmployeeAddressService;
import com.example.employeehubmanager.service.EmployeeService;
import com.example.employeehubmanager.utility.XlsxReader;

@SpringBootTest
class EmployeeHubManagerApplicationTests {

   @Autowired
   private XlsxReader reader;
	
   @Autowired
   private EmployeeAddressService employeeAddressService;
	
   @Autowired
   private EmployeeService employeeService;
	
   @Test
   void testImportFromXlsx() {
	reader.readDataFromXlsx();

	List<Employee> employees = (List<Employee>) employeeService.findAll();
	assertEquals(50, employees.size());

	List<EmployeeAddress> hiramAddresses =
			(List<EmployeeAddress>) employeeAddressService.findAllByEmployeeCode("170-91-8199");
	assertEquals(2, hiramAddresses.size());
	assertEquals("Hiram", hiramAddresses.get(0).getEmployee().getFirstName());
   }

}
