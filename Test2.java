package com.jlcindia.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Employee emp1=new Employee("pankaj",2000);
		Employee emp2=new Employee("Kamesh",4000);
		Employee emp3=new Employee("pankaj",2000);
		
		  Map map=new HashMap();
		    map.put(emp1,emp1);
		    map.put(emp2,emp2);
		    map.put(emp3,emp3);
		    printMap(map);
	        Employee key = new Employee("Banana", 20);
	        System.out.println("Does key available? "+map.containsKey(key));
	}

	private static void printMap(Map map) {
		Set<Employee> keys = map.keySet();
        for(Employee p:keys){
            System.out.println(p+"==>"+map.get(p));

	}   
	
	}	
	}
     
class Employee{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	
	}

	
	
