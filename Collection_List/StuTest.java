package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StuTest {

	
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
		Student s1=new Student();
		s1.setRollno(10);
		s1.setName("Anil");
		s1.setAddress("Pune");
		s1.setMono(9970994046l);
		s1.setBranch("Information Tchnology");
		
		Student s2=new Student();
		s2.setRollno(20);
		s2.setName("Priti");
		s2.setAddress("Nagar");
		s2.setMono(7030170308l);
		s2.setBranch("Computer Sci");
		
		list.add(s1);
		list.add(s2);
		
		Iterator<Student> itr=list.iterator();
		System.out.println("Iterate by using while loop");
		
	while(itr.hasNext())
	{
		Student stu=itr.next();
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
		System.out.println(stu.getMono());
		System.out.println(stu.getBranch());
		System.out.println("-----------------");
	}
	System.out.println("*******************");
	System.out.println();
	
	System.out.println("Iterate by using For each loop");
	for(Student stu1:list)
	{
		System.out.println(stu1.getRollno());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAddress());
		System.out.println(stu1.getMono());
		System.out.println(stu1.getBranch());
		System.out.println("-----------------");
	}
}
}
