package com.exilant.Dao;

import java.util.List;

import com.exilant.Entity.EmployeeEntity;

public interface EmployeeDao {
	


	    public void addEmployee(EmployeeEntity employee);
	    public List<EmployeeEntity> getAllEmployees();
	    public void deleteEmployee(Integer employeeId);
	

}
