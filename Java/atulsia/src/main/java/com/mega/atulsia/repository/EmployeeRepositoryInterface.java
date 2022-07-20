package com.mega.atulsia.repository;

import java.util.List;

import com.mega.atulsia.pojo.Employee;

public interface EmployeeRepositoryInterface {

	
	public Employee addNewEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public boolean deleteEmployee(int employeeId);
	
	public Employee getEmployee(int employeeId);
	
	public List<Employee> getAllEmployee();
	
	public Employee archiveEmployee(Employee employee);
	
	public List<Employee> getallArchiveemployee();
	
	
}
