package com.luv2code.springbootCRUDDemo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.luv2code.springbootCRUDDemo.dao.EmployeeRepository;
import com.luv2code.springbootCRUDDemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theemployeeRepository) {
		employeeRepository = theemployeeRepository;
	}

	@Override
	public List<Employee> findAll() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theid) {

		Optional<Employee> result = employeeRepository.findById(theid);
		
		Employee emp=null;
		if(result.isPresent())
		{
			emp=result.get();
		}
		else
		{
			throw new RuntimeException("Did not find value for id: "+theid);
		}
		return emp;
	}

	@Override
	public void save(Employee theemployee) {
		employeeRepository.save(theemployee);

	}

	@Override
	public void deleteById(int theid) {
		employeeRepository.deleteById(theid);

	}

}
