package com.dharish.spring.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dharish.spring.model.EmployeeDetails;
import com.dharish.spring.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	List<EmployeeDetails> empdet = new  ArrayList<EmployeeDetails>();
	
	@Autowired
	EmployeeRepository emprepo;
	
	public  List<EmployeeDetails> getAllEmp() 
	{
		emprepo.findAll().forEach(empdet1->empdet.add(empdet1));
		System.out.println(empdet);
		return empdet;
	}
	
	public EmployeeDetails getEmployeeById(int empid) 
	{
		return emprepo.findById(empid).get();
	}
	

	public void saveorUpdate(EmployeeDetails empodet) 
	{
		emprepo.save(empodet);	
		System.out.println(empodet);
	}
	public void update(EmployeeDetails emdet,int empid) 
	{
		emprepo.save(emdet);
		
	}

	public List<EmployeeDetails> deleteempl(int empid) 
	{
		emprepo.deleteById(empid);
		return empdet;
		
	}	

}
