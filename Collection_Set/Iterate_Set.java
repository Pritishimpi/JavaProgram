package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterate_Set {
	
	public static void main(String[] args) {
		
		
		Set<Integer> s=new HashSet<>();
		s.add(25);
		s.add(20);
		s.add(1);
		s.add(5);
		s.add(25);
		
		System.out.println("List is:-"+s);
		
		Iterator<Integer> itr=s.iterator();
		
		System.out.println("Iterate by using while loop");
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println(i);
		}
		System.out.println("============================");
		System.out.println("Iterate by using while loop");
		for(int i:s)
		{
			System.out.println(i);
		}
		
		
		
	}

}
