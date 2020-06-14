package com.example.employeehubmanager.utility;

import java.io.File;  
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeehubmanager.entity.Department;
import com.example.employeehubmanager.entity.Employee;
import com.example.employeehubmanager.entity.EmployeeAddress;
import com.example.employeehubmanager.service.DepartmentService;
import com.example.employeehubmanager.service.EmployeeAddressService;
import com.example.employeehubmanager.service.EmployeeService;

@Service
public class XlsxReader {
	
	@Autowired
    private EmployeeService employeeService;
	@Autowired
    private DepartmentService departmentService;
	@Autowired
    private EmployeeAddressService employeeAddressService;
	
	private String filePath = "src/main/resources/employeeHubImport.xlsx";
	
	/*
	 * Apache POI is used to read from XLSX Files
	 */
	public List<Employee> readDataFromXlsx() {
		List<Employee> employees = new ArrayList<Employee>();
		List<Department> departments = new ArrayList<Department>();
		List<EmployeeAddress> employeeAddresses = new ArrayList<EmployeeAddress>();
		try {  
			File file = new File(filePath);
			FileInputStream stream = new FileInputStream(file);    
			XSSFSheet sheet = new XSSFWorkbook(stream).getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			itr.next();
			while (itr.hasNext()) {
				Row row = itr.next();
				assignData(row, employees, departments, employeeAddresses);
			}
		}  
		catch(Exception e) {  
			e.printStackTrace();
		}
		storeIntoDb(employees, departments, employeeAddresses);
		return employees;
	}
	
	private void assignData(Row row, 
			List<Employee> employees, List<Department> departments, List<EmployeeAddress> employeeAddresses) {
		Employee employee = new Employee(row);
		EmployeeAddress address = new EmployeeAddress(row);
		Department department = new Department(row);
		
		employee.setDepartment(department);
		address.setEmployee(employee);
		
		employees.add(employee);
		departments.add(department);
		employeeAddresses.add(address);
	}
	
	private void storeIntoDb(List<Employee> employees, List<Department> departments, List<EmployeeAddress> employeeAddresses) {
		departmentService.saveList(departments);
		employeeService.saveList(employees);
		employeeAddressService.saveList(employeeAddresses);
	}
	
}
