package com.employee.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.EmployeeEntity;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@Api(value = ".EmployeeController , Rest APIs that deal with Customer DTO" )
@RequestMapping("/myapp")
public class EmployeeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	

	
	
	@Autowired
	private EmployeeService emp;
	
	@PostMapping("/addEmployee")
	@ApiOperation(value = "Add Employees to EmpData ", response =  EmployeeEntity.class , tags = "addEmployees")
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Added the Employee Successfully"),
			@ApiResponse(code = 404 , message = "Employee could not be added")
	})
	public String addEmployee(@RequestBody EmployeeEntity employeeE)
	{
		emp.addEmployees(employeeE);
		return "Employee with name " + employeeE.getFullName() + "added successfully";
	}
	
	
	@GetMapping("/showEmployee")
	@ApiOperation(value = "Show All Employees" , response = EmployeeEntity.class , tags = "showEmployees")
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "All the Employees are viewed"),
			@ApiResponse(code = 404 , message = "Employee data could not retrived")
	})
	public Iterable<Employee> showEmployee(){
		return emp.showEmployees();
	}
	
	@DeleteMapping("/deleteEmployee")
	@ApiOperation(value = "Delete Employee record", response = EmployeeEntity.class , tags = "deleteEmployeesByID" )
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Employee deleted successfull"),
			@ApiResponse(code = 404 , message = "Employee data could not retrived")
	})
	public String removeEmployee(@RequestBody EmployeeEntity employeeE)
	{
		emp.removeEmployee(employeeE.getId());
		return "Employee with id"+ employeeE.getId() + "removed successfully";
	}
	
	@GetMapping("showEmployee/{id}")
	@ApiOperation(value = "Show Employee by ID", response = EmployeeEntity.class , tags = "showEmployeebyID" )
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Employee by Id are viewed"),
			@ApiResponse(code = 404 , message = "Employee data could not retrived")
	})
	public ResponseEntity<Employee> findbyId(@PathVariable int id)
	{
		return ResponseEntity.ok().body(emp.findbyId(id));
		
	}
	
	@PutMapping("updateEmployee")
	@ApiOperation(value = "Update Employee By city", response = EmployeeEntity.class , tags = "updateEmployeebyCity" )
	@ApiResponses(value = {@ApiResponse(code = 200 , message = "Employee Updated by City"),
			@ApiResponse(code = 404 , message = "Employee data could not retrived")
	})
	public String updateEmployee(@RequestBody EmployeeEntity employeeE)
	{
		String city = employeeE.getCity();
		int id = employeeE.getId();
		emp.cityUpdate(city, id);
		return "Employee with id " + employeeE.getId() + "has been updated with city " + employeeE.getCity();
	}
	
    @GetMapping("/training")
    public List<Object> getTraining(){
    	String url="http://localhost:1019/training";
    	Object[] objects= restTemplate.getForObject(url, Object[].class);
    	
    	return Arrays.asList(objects);
    }


}
