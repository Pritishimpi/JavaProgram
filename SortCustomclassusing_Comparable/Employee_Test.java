package SortCustomclassusing_Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Employee_Test {
	
	public static void main(String[] args) {
		
     Set<Employee> e=new TreeSet<>();
		
     Employee e1=new Employee();
		e1.setEid(20);
		e1.setName("Ram");
		e1.setAge(15);
		e1.setSalary(20000l);
		e1.setMono(9970994046l);
		
		
		Employee e2=new Employee();
		e2.setEid(30);
		e2.setName("Abhijit");
		e2.setAge(21);
		e2.setSalary(30000l);
		e2.setMono(9080994345l);
		
		Employee e3=new Employee();
		
		e3.setEid(10);
		e3.setName("Sachin");
		e3.setAge(23);
		e3.setSalary(40000l);
		e3.setMono(9080994345l);
		

	    e.add(e1);
		e.add(e2);
		e.add(e3);
		
	
		e.forEach(employee->{
			System.out.println("Employee ID:-"+employee.getEid());
			System.out.println("Employee Name:-"+employee.getName());
			System.out.println("Employee Age:-"+employee.getAge());
			System.out.println("Employee Salary:-"+employee.getSalary());
			System.out.println("Employee Mobile Number:-"+employee.getMono());
		});
		
			
	}

	}


