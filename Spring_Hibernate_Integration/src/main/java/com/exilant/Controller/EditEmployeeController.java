package com.exilant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exilant.Entity.EmployeeEntity;
import com.exilant.service.EmployeeManager;

public class EditEmployeeController {
	
	@Autowired
	private EmployeeManager employeemanager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String listEmployees(ModelMap map) {
		
		map.addAttribute("employee", new EmployeeEntity());
		map.addAttribute("employeeList", employeemanager.getAllEmployees());
		
		return "editEmployeeList";	
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute(value="employee") EmployeeEntity employee, BindingResult result)
    {
        employeemanager.addEmployee(employee);
        return "redirect:/";
    }
	
	
	@RequestMapping("/delete/{employeeId}")
    public String deleteEmplyee(@PathVariable("employeeId") Integer employeeId)
    {
        employeemanager.deleteEmployee(employeeId);
        return "redirect:/";
    }
	
	
	
    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeemanager = employeeManager;
    }
	

}
