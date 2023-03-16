package Collection_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class India {
	
	public static void main(String[] args) {
		

	List<String> up=new ArrayList<>();
    
    
	up.add("Patana");
	up.add("Bihar");
	up.add("Agra");
    System.out.println("UttarPradesh state city name is:-"+up);
    System.out.println("==========================================================");
   
	
	
	List<String> rj=new ArrayList<>();
	
	rj.add("Jaipur");
	rj.add("Kota");
	rj.add("Ajmer");
	System.out.println("Rajstan state city name is:-"+rj);
	System.out.println("============================================================");
	
	Map<String, List<String>> india=new HashMap<>();
	
	india.put("UttarPradesh",up );
	india.put("Rajstan",rj);
	System.out.println();
	
	
	System.out.println("Iterate the elements by using inhance for loop:-\n");
	Set<String> keys=india.keySet();
	
	for(String k:keys)
	{
		System.out.println(k);
		List<String> l=india.get(k);
		for(String city:l)
		{
			System.out.println(city);
		}
	}
	
	}
	}

	
	

