package SortCustomclassusing_Comparator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import SortCustomclassusing_Comparable.Student;

public class Test {
	
public static void main(String[] args) {
		
		Set<Student> s=null;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----------Select------------\n"
		                    +"1.Rollno sort\n"
		                    +"2.Namesort\n");
		                    int ch=sc.nextInt();
		                    if(ch==1)
		                    {
		                    	Comparator<Student> crno=(o1,o2)->o1.getRollno()-o2.getRollno();
		                    	s=new TreeSet<>(crno);
		                    }
		                    else if(ch==2)
		                    {
		                    	Comparator<Student> cnm=(o1,o2)->o1.getName().compareTo(o2.getName());
		                    	s=new TreeSet<>(cnm);
		                    }
		
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

