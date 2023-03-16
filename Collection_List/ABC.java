package Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ABC {
	
	public static void main(String[] args) {
		
	
	List<Integer> l=new ArrayList<>();
	
	l.add(10);
	l.add(40);
	l.add(30);
	l.add(60);
	l.add(97);
	l.add(20);
	l.add(86);
	l.add(34);
	l.add(2);
	
	System.out.println("List is:-"+l);
	System.out.println("--------------------------------------------");
	
	Object a=l.get(2);
	System.out.println("Secand index valus is:-"+a);
	System.out.println("--------------------------------------------");
	
	System.out.println("Index size of list:-"+l.size());
	System.out.println("--------------------------------------------");
	
	l.add(0, 22);
	System.out.println("New zero index value:-"+l);
	System.out.println("--------------------------------------------");
	
	l.set(2, 50);
	System.out.println("Replace secand index value:-"+l);
	System.out.println("--------------------------------------------");
	
	Object max=Collections.max(l);
	System.out.println("Find maximum value from list:-"+max);
	System.out.println("--------------------------------------------");
	
	System.out.println("Find mainimum value from list:-");
	System.out.println(Collections.min(l));
	System.out.println("--------------------------------------------");
	
	System.out.println("Check the list is empty or not:-"+l.isEmpty());
	System.out.println("--------------------------------------------");
	
	System.out.println("Check the value is available or not in list:- "+l.contains(2));
	System.out.println("--------------------------------------------");
	
	
	
	Collections.sort(l);
	System.out.println("Sorted list is:-");
	System.out.println(l);
	System.out.println("--------------------------------------------");
	
	Collections.reverse(l);
	System.out.println("Reverse list is:-");
	System.out.println(l);
	System.out.println("--------------------------------------------");
	
	l.remove(5);
	System.out.println("Remove fifth index value from list is:-");
	System.out.println(l);
	System.out.println("--------------------------------------------");
	
	l.clear();
	System.out.println("Cleared all value from list:-");
	System.out.println(l);
	System.out.println("--------------------------------------------");
	
	
	
	
	
	
	
	
	
}

}
