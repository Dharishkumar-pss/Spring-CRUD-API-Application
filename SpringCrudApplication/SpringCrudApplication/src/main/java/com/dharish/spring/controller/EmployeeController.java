package com.dharish.spring.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dharish.spring.model.EmployeeDetails;
import com.dharish.spring.service.EmployeeService;


@RestController
public class EmployeeController
{
	List <EmployeeDetails> empdetails = new ArrayList<EmployeeDetails>();
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/employeeget")
	public List<EmployeeDetails> getEmployee()
	{
		return empservice.getAllEmp();
	}
	
	@GetMapping("/employeegetbyid/{empid}")
	public EmployeeDetails empbyid(@PathVariable("empid") int empid)
	{
		return empservice.getEmployeeById(empid);
	}
	
	@PostMapping("/employeepost")
	public EmployeeDetails insertemp(@RequestBody EmployeeDetails empodet)
	{
		empservice.saveorUpdate(empodet);
		return empodet;
		
	}
	
	@PutMapping("/employeeput")
	public EmployeeDetails updateEmployee(@RequestBody EmployeeDetails emdet)
	{
		empservice.saveorUpdate(emdet);
		return emdet;	
	}
	
	@DeleteMapping("/employeedelete/{empid}")
	public void deleteEmployee(@PathVariable ("empid") int empid)
	{
		empservice.deleteempl(empid);
		
	}

}

