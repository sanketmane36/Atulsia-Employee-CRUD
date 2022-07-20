package com.mega.atulsia.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mega.atulsia.pojo.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();

		employee.setEmployeeId(rs.getInt("employee_id"));
		employee.setEmployeeName(rs.getString("employee_name"));
		employee.setContactNumber(rs.getString("contact_number"));
		employee.setEmail(rs.getString("email"));
		employee.setAddress(rs.getString("address"));
		employee.setEmployeeStatus(rs.getInt("employee_status"));
		employee.setArchiveStatus(rs.getInt("archive_status"));

		return employee;
	}

}
