package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		
		Student1 stu=new Student1();
		stu.setSrollno(100);
		stu.setSname("Ram");
		stu.setSadd("Pune");
		
		Student1 stu1=new Student1();
		stu1.setSrollno(101);
		stu1.setSname("Raj");
		stu1.setSadd("Mumbai");
		
		Student1 stu2=new Student1();
		stu2.setSrollno(102);
		stu2.setSname("Anil");
		stu2.setSadd("Nashik");
		
		List<Student1> stulist=new ArrayList<>();
		stulist.add(stu);
		stulist.add(stu1);
		stulist.add(stu2);
		
		
		Employee emp=new Employee();
		emp.setEid(1000);
		emp.setEname("Anuj");
		emp.setEadd("Amravati");
		
		Employee emp1=new Employee();
		emp1.setEid(101);
		emp1.setEname("Sagar");
		emp1.setEadd("Nagpur");
		
		Employee emp2=new Employee();
		emp2.setEid(102);
		emp2.setEname("Gaurav");
		emp2.setEadd("Wardha");
		
		List<Employee> emplist=new ArrayList<>();
		emplist.add(emp);
		emplist.add(emp1);
		emplist.add(emp);
		
		
		List<Object> list=new ArrayList<>();
		
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		
//		System.out.println(list);
//		
//		list.add(emplist);
//		list.add(stulist);
		
		Iterator<Object> itr=list.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			if(obj instanceof Student1)
			{
				Student1 s=(Student1) obj;
				System.out.println("Student details:-");
				System.out.println(s.getSrollno());
				System.out.println(s.getSname());
				System.out.println(s.getSadd());
				
			}
			if(obj instanceof Employee)
			{
				Employee s=(Employee) obj;
				System.out.println("Employee details:-");
				System.out.println(s.getEid());
				System.out.println(s.getEname());
				System.out.println(s.getEadd());
				
			}
			System.out.println("------------------------");
		}
		
				
	}
}
