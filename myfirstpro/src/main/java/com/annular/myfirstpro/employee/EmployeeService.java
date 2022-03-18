package com.annular.myfirstpro.employee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getEmployee() {
		System.out.println("service=========");
		return employeeRepository.findAll();
		// return List.of(new Employee(1,"Ganesh test", "dd-mm-yyyy", "Software
		// Developer"));
	}

	public void saveEmployee(Employee employee) {
		System.out.println("\n\n emplyeeee    servieeeeeeee  :  " + employee);
		employeeRepository.saveAndFlush(employee);
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		Employee employee2= employeeRepository.getById(employee.getEmployeeId());
		employee2.setEmployeeDesignation(employee.getEmployeeDesignation());
		employee2.setEmployeeDOB(employee.getEmployeeDOB());
		employee2.setEmployeeName(employee.getEmployeeName());
	}

}
