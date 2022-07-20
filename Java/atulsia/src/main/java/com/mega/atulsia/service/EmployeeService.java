package com.mega.atulsia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mega.atulsia.pojo.Employee;
import com.mega.atulsia.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	private EmployeeRepositoryInterface employeeRepository;
	
	@Override
	public Employee addNewEmployee(Employee employee) {
		return employeeRepository.addNewEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		return employeeRepository.deleteEmployee(employeeId);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeRepository.getEmployee(employeeId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmployee();
	}
	
	@Override
	public Employee archiveEmployee(Employee employee) {
		return employeeRepository.archiveEmployee(employee);
	}
	
	@Override
	public List<Employee> getallArchiveemployee() {
		return employeeRepository.getallArchiveemployee();
	}
	

}
