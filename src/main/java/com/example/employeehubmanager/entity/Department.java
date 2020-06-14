package com.example.employeehubmanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.poi.ss.usermodel.Row;

@Entity
public class Department {
	
	@Id
	private String departmentCode;
	private String departmentName;
	
	public Department(String departmentCode, String departmentName) {
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
	}
	
	public Department(Row row) {
		this.departmentCode = row.getCell(7).toString();
		this.departmentName = row.getCell(8).toString();
	}
	
	public Department(){}
	
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}