package com.rays.collection.comaparable;

public class Employee implements Comparable<Employee> {

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
	public int compareTo(Employee o) {
		if (this.id == o.id) {
			return this.name.compareTo(o.name);
		}
		return this.id - o.id;
	}

}
