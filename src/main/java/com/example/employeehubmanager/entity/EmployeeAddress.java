package com.example.employeehubmanager.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.apache.poi.ss.usermodel.Row;

@Entity
public class EmployeeAddress {

	@Id
	private String id;
	private String addressLine1;
	@Basic(optional=true)
	private String addressLine2;
	private String town;
	private String postcode;
	private String country;
	private boolean isCurrent;
	
	@ManyToOne
	private Employee employee;
	
	public EmployeeAddress(String addressLine1, String addressLine2, 
			String town, String postcode, String country, boolean isCurrent) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.town = town;
		this.postcode = postcode;
		this.country = country;
		this.isCurrent = isCurrent;
	}
	
	public EmployeeAddress(Row row) {
		this.addressLine1 = row.getCell(9).toString();
		this.addressLine2 = getOptionalField(row, 10);
		this.town = row.getCell(11).toString();
		this.postcode = row.getCell(12).toString();
		this.country = row.getCell(13).toString();
		this.isCurrent = row.getCell(14).toString().equals("YES");
	}

	public EmployeeAddress(){}
	
	private String getOptionalField(Row row, int index) {
		if (row.getCell(10) == null)
			return null;
		else
			return row.getCell(10).toString();
	}
	
	public String getId() {
		return id;
	}
	public void setGeneratedId() {
		this.id = employee.getEmployeeCode() + postcode + addressLine1;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean getIsCurrent() {
		return isCurrent;
	}
	public void setIsCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
		setGeneratedId();
	}
	public Employee getEmployee() {
		return employee;
	}
	
}