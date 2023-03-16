package Collection_List;

import java.util.ArrayList;
import java.util.*;

public class A {
	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		
		int x=a.get(1);
		System.out.println(x);
		
		for(int y:a)
		{
		System.out.println(y);
		}
		
		System.out.println("------------------------------------");
		
		/*Iterator<Integer> itr=a.iterator();
		while(itr.hasNext())
		{
			int y=itr.next();
			System.out.println(y);
		}*/
		
		List<String> s=new ArrayList<>();
		
		s.add("AA");
		s.add("BB");
		s.add("CC");
		s.add("AA");
		
		System.out.println(s);
		
		for(String b:s)
		{
			System.out.println(b);
		}
		
		/* Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			String y=itr.next();
			System.out.println(y);
		}*/
		
		
		
		
	}

}
