package com.rays.collection.eh;

public class Employee {

	private int id;

	private String name;

	private int salary;

	public Employee() {
	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;
		return str;
	}

	@Override
	public int hashCode() {

		String str = id + " " + name + " " + salary;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		Employee employee = (Employee) obj;
		boolean flag = this.id == employee.id && this.name == employee.name && this.salary == employee.salary;
		return flag;
	}

}
