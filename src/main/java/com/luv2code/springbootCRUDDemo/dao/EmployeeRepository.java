package com.luv2code.springbootCRUDDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springbootCRUDDemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//no need to write any code
}
