package Collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_Elements {
	
	public static void main(String[] args) {
		
		List<Integer> a1=new ArrayList<>();
		
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(3);
		a1.add(8);
		a1.add(20);
		
		System.out.println("ArrayList is:-"+a1);
		System.out.println();
		
		Set<Integer> s=new HashSet<>(a1);
		System.out.println("Remove duplicate elements by using HashSet with order change:-\n");
		System.out.println("HashSet is:"+s);
		System.out.println();
		
		Set<Integer> s1=new LinkedHashSet<>(a1);
		System.out.println("Remove duplicate elements by using LinkedHashSet without order change:-\n");
		System.out.println("LinkedHashSet is"+s1);
		
		
		
		
	}

}
