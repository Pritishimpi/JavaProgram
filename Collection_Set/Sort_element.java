package Collection_Set;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sort_element {
	
	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<>();
		
		a.add(11);
		a.add(2);
		a.add(20);
		a.add(12);
		a.add(11);
		a.add(23);
		a.add(12);
		a.add(4);
		a.add(2);
		
		System.out.println("ArrayList is:-\n"+a);
		System.out.println();
		
		Set<Integer> s=new TreeSet<>(a);
		System.out.println("Sorting elements by using TreeSet with avaiding duplicate elements:-");
		System.out.println("TreeSet is:-\n"+s);
		System.out.println();
		
		Collections.sort(a);
		System.out.println("Sorting elements by using sort method without avaiding duplicate elements:-");
		System.out.println("Sorting list is:-\n"+a);
	}

}
