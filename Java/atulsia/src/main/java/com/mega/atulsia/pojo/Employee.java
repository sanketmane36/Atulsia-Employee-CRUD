package com.mega.atulsia.pojo;

public class Employee {
	public int employeeId;
	public String employeeName;
	public String contactNumber;
	public String email;
	public String address;
	public int employeeStatus;
	public int archiveStatus;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String contactNumber, String email, String address,
			int employeeStatus, int archiveStatus) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.employeeStatus = employeeStatus;
		this.archiveStatus = archiveStatus;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(int employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public int getArchiveStatus() {
		return archiveStatus;
	}

	public void setArchiveStatus(int archiveStatus) {
		this.archiveStatus = archiveStatus;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", contactNumber="
				+ contactNumber + ", email=" + email + ", address=" + address + ", employeeStatus=" + employeeStatus
				+ ", archiveStatus=" + archiveStatus + "]";
	}

	
	
	

	
	
}
