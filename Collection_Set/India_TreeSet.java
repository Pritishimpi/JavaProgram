package Collection_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class India_TreeSet {
	
	public static void main(String[] args) {
		
		System.out.println("TreeList is:-");
		Set<String> up=new TreeSet<>();
		
		up.add("Patana");
		up.add("Bihar");
		up.add("Agra");
		System.out.println(up);
		System.out.println();
		
		
		Set<String> rj=new TreeSet<>();
		
		rj.add("Jaipur");
		rj.add("Kota");
		rj.add("Ajmer");
		System.out.println(rj);
		System.out.println();
	
	
	System.out.println("Using TreeSet:-");
	Set<Set<String>> india=new TreeSet<Set<String>>();
	india.add(rj);
	india.add(up);
	System.out.println(india);
	System.out.println();
	
	
	
	System.out.println("Iterate of TreeSet by using inhance for loop:-");
	for(Set<String> s:india)
	{
		System.out.println( s);
		
	}
	System.out.println("----------------------------------------");
	
	
	System.out.println("Iterate of TreeSet by using while loop:-");
	Iterator<Set<String>> itr=india.iterator();
	while(itr.hasNext())
	{
		List<String> s=(List<String>) itr.next();
		System.out.println(s);
	}
	
	
	
	
}
	}
	
	

