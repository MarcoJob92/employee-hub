package com.example.employeehubmanager.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.apache.poi.ss.usermodel.Row;

@Entity
public class Employee {
	
	@Id
	private String employeeCode;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dob;
	private String email;
	private String contactNumber;
	
	@ManyToOne
	private Department department;
	
	public void setDepartment(Department department) {
        this.department = department;
    }
	public Department getDepartment() {
        return department;
    }
	
	public Employee(String employeeCode, String firstName, String lastName, 
			String gender, Date dob, String email, String contactNumber /* , String departmentCode */) {
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	
	public Employee(Row row) {
		this.employeeCode = row.getCell(0).toString();
		this.firstName = row.getCell(1).toString();
		this.lastName = row.getCell(2).toString();
		this.gender = row.getCell(3).toString();
		this.dob = row.getCell(4).getDateCellValue();
		this.contactNumber = row.getCell(5).toString();
		this.email = row.getCell(6).toString();
	}

	public Employee(){}
	
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}