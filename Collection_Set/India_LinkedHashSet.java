package Collection_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class India_LinkedHashSet {
	
	public static void main(String[] args) {
		
		
		System.out.println("ArrayList is:-");
		List<String> up=new ArrayList<>();
		
		up.add("Patana");
		up.add("Bihar");
		up.add("Agra");
		System.out.println(up);
		System.out.println();
		
		
		List<String> rj=new ArrayList<>();
		
		rj.add("Jaipur");
		rj.add("Kota");
		rj.add("Ajmer");
		System.out.println(rj);
		System.out.println();
	
	
	System.out.println("Using LinkedHashSet:-");
	Set<List<String>> india=new LinkedHashSet<>();
	india.add(rj);
	india.add(up);
	System.out.println(india);
	System.out.println();
	
	
	
	System.out.println("Iterate of LinkedHashSet by using inhance for loop:-");
	for(List<String> s:india)
	{
		System.out.println( s);
		
	}
	System.out.println("----------------------------------------");
	
	
	System.out.println("Iterate of LinkedHashSet by using while loop:-");
	Iterator<List<String>> itr=india.iterator();
	while(itr.hasNext())
	{
		List<String> s=itr.next();
		System.out.println(s);
	}
	
	
	
	
}

}
