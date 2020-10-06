package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.EmployeeEntity;
import com.employee.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	   @Transactional
	   @Modifying
	   @Query(value = "update  Employee set city = ? " + " where id = ?", nativeQuery = true)
	   void cityUpdate(String city,int id);

	   
public static String createEmployee(EmployeeEntity empt) {
	List<EmployeeEntity> employee=null;
	employee.add(empt);
	return "emplyee with" + empt.getId() + "created successfully";
	
}

}
