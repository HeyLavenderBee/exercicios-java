package pilarespoo.company.domain;

import java.io.Console;

public sealed abstract class Employee permits Salesman, Manager{
	protected String code;
	protected String name;
	protected double salary;

	public Employee() {}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract double getFullSalary();
}
