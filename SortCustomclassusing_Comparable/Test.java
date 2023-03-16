package SortCustomclassusing_Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		Set<Student> s=new TreeSet<>();
		
		Student s1=new Student();
		s1.setRollno(4);
		s1.setName("BBB");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("AAA");
		
		Student s3=new Student();
		
		s3.setRollno(3);
		s3.setName("CCC");
		
		
	    s.add(s1);
		s.add(s2);
		s.add(s3);
		
		System.out.println(s);
		
		s.forEach(stu->System.out.println(stu.getRollno()+"   "+stu.getName()));
		
		
		
		
	}

}
