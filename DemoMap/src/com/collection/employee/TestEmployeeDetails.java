package com.collection.employee;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.collection.demo.Employee;

public class TestEmployeeDetails {

	public static void main(String[] args) {
		Map<Integer, Employee> empList = new TreeMap<>();
		empList.put(1, new Employee(101, "Mr mahi", "Finance", 4700));
		empList.put(2, new Employee(102, "ramu", "Sales", 4400));
		empList.put(3, new Employee(103, "anil", "Manager", 4100));
		empList.put(4, new Employee(104, "ganesh", "Businee", 1500));
		empList.put(5, new Employee(105, "Prakash", "Sales", 5500));

		Iterator<Map.Entry<Integer, Employee>> ite = empList.entrySet().iterator();

		while (ite.hasNext()) {
			Map.Entry<Integer, Employee> entry = ite.next();
			System.out.println(entry.getKey() + "  -  " + entry.getValue());
		}

	}

}