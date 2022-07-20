package com.mega.atulsia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mega.atulsia.pojo.Employee;
import com.mega.atulsia.service.EmployeeServiceInterface;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("employeeapi")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeService;

	
	@RequestMapping(value = "employees/addemployee", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addNewEmployee(employee);
	}
	
	
	@RequestMapping(value = "employees/updateemployee", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value = "employees/{employeeId}", method = RequestMethod.GET)
	public Employee getEmployeeByEmployeeId(@PathVariable int employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	
	@RequestMapping(value = "employees/getallemployee", method = RequestMethod.GET)
	public List<Employee> allEmployees() {
		List<Employee> allEmployees = employeeService.getAllEmployee();
		return allEmployees;
	}
	
	@RequestMapping(value = "employees/deleteemployee/{employeeId}", method = RequestMethod.DELETE)
	public boolean deleteEmployee(@PathVariable int employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}
	
	@RequestMapping(value = "employees/archive", method = RequestMethod.PUT)
	public Employee archiveEmployee(@RequestBody Employee employee) {
		return employeeService.archiveEmployee(employee);
	}
	
	@RequestMapping(value = "employees/getallArchiveemployee", method = RequestMethod.GET)
	public List<Employee> getallArchiveemployee() {
		List<Employee> allEmployees = employeeService.getallArchiveemployee();
		return allEmployees;
	}

}
