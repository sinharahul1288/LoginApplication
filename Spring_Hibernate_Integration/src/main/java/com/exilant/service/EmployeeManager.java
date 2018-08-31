package com.exilant.service;

import java.util.List;

import com.exilant.Entity.EmployeeEntity;

public interface EmployeeManager {
	
	public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);

}
