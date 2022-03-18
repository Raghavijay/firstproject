package com.annular.myfirstpro.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	/*
	 * @GetMapping public List<Employee> getEmployee() {
	 * System.out.println("controller========="); return List.of(new
	 * Employee(1,"Ganesh", "dd-mm-yyyy", "Software Developer")); }
	 */

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
System.out.println("\n\n entered controller successfully>>>>>>>>>>>>>\n\n");
		this.employeeService = employeeService;
	}

	@GetMapping("/employeeList")
	public List<Employee> getEmployee() {
		System.out.println("\n\nin controller class=========");
		return employeeService.getEmployee();
	}

	@PostMapping("/saveEmployee")
	public void registerEmployee(@RequestBody Employee employee) {
		System.out.println("\n\n postmap  : "+employee);
		employeeService.saveEmployee(employee);
	}

	@PutMapping("/updateEmployee")
	public void updateEmployeeDetails(@RequestBody Employee employee)
	{
		employeeService.updateEmployee(employee);
	}
	
}
