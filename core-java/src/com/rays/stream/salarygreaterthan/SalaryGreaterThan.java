package com.rays.stream.salarygreaterthan;

import java.util.ArrayList;
import java.util.List;

public class SalaryGreaterThan {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Ram", 25000));
		employees.add(new Employee("Shyam", 18000));
		employees.add(new Employee("Jai", 30000));
		employees.add(new Employee("Vijay", 22000));

		employees.stream().filter(employee -> employee.getSalary() > 20000)
				.forEach(e -> System.out.println(e.getName() + " - Salary: " + e.getSalary()));
	}
}