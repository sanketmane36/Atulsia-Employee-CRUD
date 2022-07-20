package com.mega.atulsia.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mega.atulsia.pojo.Employee;

@Repository
public class EmployeeRepository implements EmployeeRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	private static final String INSERT_NEW_EMPLOYEE="insert into employee_details(employee_name,contact_number,email,address,employee_status,archive_status) values (?,?,?,?,?,?)";
	private static final String UPDATE_EMPLOYEE="update employee_details set employee_name=?,contact_number=?,email=?,address=?,employee_status=? where employee_id=?";
	private static final String SELECT_ALL_EMPLOYEE="select * from employee_details where archive_status=0";
	private static final String SELECT_ONE_EMPLOYEE="select * from employee_details where employee_id=?";
	private static final String DELETE_EMPLOYEE="delete from employee_details where employee_id=?";
	private static final String ARCHIVE_EMPLOYEE="update employee_details set archive_status=? where employee_id=?";
	private static final String SELECT_ALL_ARCHIVE_EMPLOYEE="select * from employee_details where archive_status=1";

	
	@Override
	public Employee addNewEmployee(Employee employee) {
		Object[] args= {
				employee.getEmployeeName(),
				employee.getContactNumber(),
				employee.getEmail(),
				employee.getAddress(),
				employee.getEmployeeStatus(),
				employee.getArchiveStatus()
		};
		
		int count=jdbcTemplate.update(INSERT_NEW_EMPLOYEE, args);
		if(count>0)
		{
			return employee;
		}else
		{
			return null;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Object[] args= {
				employee.getEmployeeName(),
				employee.getContactNumber(),
				employee.getEmail(),
				employee.getAddress(),
				employee.getEmployeeStatus(),
				employee.getEmployeeId()
		};
		
		int count=jdbcTemplate.update(UPDATE_EMPLOYEE, args);
		
		if(count>0)
		{
			return employee;
		}else
		{
			return null;
		}
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		int count=jdbcTemplate.update(DELETE_EMPLOYEE, employeeId);
		
		if(count>0)
		{
			return true;
		}else
		{
			return false;
		}
	}

	@Override
	public Employee getEmployee(int employeeId) {
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		
		Employee employee = jdbcTemplate.queryForObject(SELECT_ONE_EMPLOYEE, employeeRowMapper, employeeId);
		
		if(employee!=null)
		{
			return employee;
		}
		return null;
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		
		List<Employee> allEmployees = jdbcTemplate.query(SELECT_ALL_EMPLOYEE, employeeRowMapper);

		return allEmployees;
	
	}
	
	


	@Override
	public Employee archiveEmployee(Employee employee) {
		Object[] args= {
				employee.getArchiveStatus(),
				employee.getEmployeeId()
		};
		
		int count=jdbcTemplate.update(ARCHIVE_EMPLOYEE, args);
		
		if(count>0)
		{
			return employee;
		}else
		{
			return null;
		}
	}
	
	
	@Override
	public List<Employee> getallArchiveemployee() {
		
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		
		List<Employee> allEmployees = jdbcTemplate.query(SELECT_ALL_ARCHIVE_EMPLOYEE, employeeRowMapper);

		return allEmployees;
	
	}
	
	
	

	
	
	

}
