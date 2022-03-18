package com.annular.myfirstpro.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
	private int employeeId;
	private String employeeName;
	private String employeeDOB;
	private String employeeDesignation;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, String employeeDOB, String employeeDesignation) {
		System.out.println("inside the entity-===========================");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDOB = employeeDOB;
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDOB=" + employeeDOB
				+ ", employeeDesignation=" + employeeDesignation + "]";
	}

}
