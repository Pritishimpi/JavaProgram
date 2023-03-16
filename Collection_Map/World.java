package Collection_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World {
	
	public static void main(String[] args) {
		
	
	
	Map<Integer,String> mh=new HashMap<>();
	mh.put(411058,"Pune");
	mh.put(400001,"Mumbai");
	
	Map<Integer,String> gj=new HashMap<>();
	gj.put(395003,"Surat");
	gj.put(382002,"Gandhinager");
	
	Map<String,Map<Integer,String>> india=new LinkedHashMap<>();
	india.put("Maharashtra",mh);
	india.put("Gujrat", gj);
	
	System.out.println(india);
	System.out.println("-------------------------------------------------");
	
	
	Map<Integer,String> cal=new HashMap<>();
	cal.put(400192,"San Francisco");
	cal.put(423451,"San Jose");
	
	Map<Integer,String> tex=new HashMap<>();
	tex.put(425637,"Houston");
	tex.put(243567,"Dallas");
	
	Map<String,Map<Integer,String>> usa=new LinkedHashMap<>();
	usa.put("California",cal);
	usa.put("Texas", tex);
	
	System.out.println(usa);
	
	System.out.println("-------------------------------------------------");
	
	Map<String,Map<String,Map<Integer,String>>> world=new LinkedHashMap<>();
	
	world.put("USA", usa);
	world.put("INDIA", india);
	System.out.println("***********WORLD MAP************");
	System.out.println("=============================================================");
	
  
	Set<String> key1=world.keySet();
	
	System.out.println("World country name is:-\n"+key1);
	System.out.println();
	
	System.out.println("Iterate by using while loop:-\n");
	
	Iterator<String> itr = key1.iterator();
	while(itr.hasNext())
	{
		String countryname = itr.next();
		System.out.println("Country name is:-"+countryname);
		System.out.println();
		Map<String, Map<Integer, String>> country=world.get(countryname);
		
		Set<String> key2=country.keySet();
		System.out.println("List of state is:-\n"+key2);
		Iterator<String> itr1 = key2.iterator();
		
		while(itr1.hasNext())
		{
			String statename = itr1.next();
			System.out.println("\nState name is:-"+statename);
			System.out.println();
			Map<Integer, String> state = country.get(statename);
			System.out.println("List of City name with Pincode are below:-\n"+state);
			Set<Integer> key3=state.keySet();
			Iterator<Integer> k = key3.iterator();
			while(k.hasNext())
			{
				
			Integer s=k.next();
			String city=state.get(s);
			System.out.println();
			System.out.println("Pincode:-  "+s+"   City name:-"+city);
			}
		System.out.println("-----------------------------------------------------");	
		}
	}
	
	
	System.out.println("\nIterate by using inhance for loop:-\n");
	
	for(String k1:key1)
	{
		System.out.println("Country name is:-"+k1);
		System.out.println();
		
		Map<String,Map<Integer,String>> country=world.get(k1);
		
		Set<String> key2=country.keySet();
		
		System.out.println("List of state is:-\n"+key2);
		
		for(String key3:key2)
		{
			System.out.println("\nState name is:-"+key3);
			Map<Integer, String> state = country.get(key3);
			System.out.println("List of City name with Pincode are below:-\n"+state);
			System.out.println();
			Set<Integer> keyset=state.keySet();
			for(Integer i:keyset)
			{
				
				String city = state.get(i);
				System.out.println();
			    System.out.println("Pincode:-  "+i+"   City name:-"+city);
		    }
		     System.out.println("---------------------------------------------------------------------");	
		
	}
	}
		}
	}

	








