package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeEntity;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empr;
	
	
	public void addEmployees(EmployeeEntity emp) {
		Employee e = new Employee();
		e.setId(emp.getId());
		String name[]= emp.getFullName().split(" ");
		if (name.length==1) {
			e.setFirstName(name[0]);
		}
		else if (name.length==2) {
			e.setFirstName(name[0]);
			e.setLastName(name[1]);
		}
		else if (name.length==3) {
			e.setFirstName(name[0]);
			e.setMiddleName(name[1]);
			e.setLastName(name[2]);
		}
		
		e.setDob(emp.getDob());
		e.setCity(emp.getCity());
		e.setContactNumber(emp.getContactNumber());
		empr.saveAndFlush(e);
	}
	
	
	public Iterable<Employee> showEmployees(){
		return empr.findAll();
	}
	
	
	public void removeEmployee(int id)
	{
		Employee e = new Employee();
		empr.deleteById(id);
		empr.save(e);
	}
	
	public Employee findbyId(int id)
	{
		Optional<Employee> optional = this.empr.findById(id);
		return optional.get();
	
		
	}
	
	public void cityUpdate(String city , int id)
	{
		empr.cityUpdate(city , id);
	}
	
	public String createEmployee(EmployeeEntity empt)
	{
		return EmployeeRepository.createEmployee(empt);
	}
}
