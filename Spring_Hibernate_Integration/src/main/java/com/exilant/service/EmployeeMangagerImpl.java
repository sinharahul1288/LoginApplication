package com.exilant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exilant.Dao.EmployeeDao;
import com.exilant.Entity.EmployeeEntity;
@Service
public class EmployeeMangagerImpl implements EmployeeManager {
	@Autowired
	EmployeeDao employeedao;

	@Override
	public void addEmployee(EmployeeEntity employee) {
		
		employeedao.addEmployee(employee);	
	}
	@Override
	public List<EmployeeEntity> getAllEmployees() {
	
		return employeedao.getAllEmployees();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		employeedao.deleteEmployee(employeeId);
		
	}
	
	public void setEmloyeeid(EmployeeDao employeedao) {
		
		this.employeedao = employeedao;
	}

}
