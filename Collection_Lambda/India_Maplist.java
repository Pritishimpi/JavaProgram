package Collection_Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class India_Maplist {
	
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
		
		india.forEach((state,city)->{
            System.out.println("State name is:-\n"+state);
            System.out.println();
           
            city.forEach(city1->{
            	 System.out.println("City name is:-\n"+city1);
            });
            System.out.println("----------------------");
              });

	}

}
