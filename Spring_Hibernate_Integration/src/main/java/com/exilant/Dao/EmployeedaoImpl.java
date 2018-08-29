package com.exilant.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.exilant.Entity.EmployeeEntity;

public class EmployeedaoImpl implements EmployeeDao {
	
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public void addEmployee(EmployeeEntity employee) {
		this.sessionfactory.getCurrentSession().save(employee);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeEntity> getAllEmployees() {
		
		return this.sessionfactory.getCurrentSession().createQuery("from EmployeeEntity").list();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		
		EmployeeEntity employee = (EmployeeEntity) sessionfactory.getCurrentSession().load(EmployeeEntity.class,employeeId);
		
		
	}

	

}
