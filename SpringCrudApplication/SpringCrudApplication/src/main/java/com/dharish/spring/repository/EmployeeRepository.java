package com.dharish.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.dharish.spring.model.EmployeeDetails;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails,Integer>
{

}
