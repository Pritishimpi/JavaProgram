package Collection_Lambda;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class World_List {
	public static void main(String[] args) {
		
	
	List<String> uttarPradesh=new ArrayList<>();
    
    
    uttarPradesh.add("Patana");
    uttarPradesh.add("Bihar");
    uttarPradesh.add("Agra");
    System.out.println("UttarPradesh state city name is:-"+uttarPradesh);
    System.out.println("==========================================================");
   
	
	
	List<String> rajstan=new ArrayList<>();
	
	rajstan.add("Jaipur");
	rajstan.add("Kota");
	rajstan.add("Ajmer");
	System.out.println("Rajstan state city name is:-"+rajstan);
	System.out.println("============================================================");
	
	List<List<String>> india=new ArrayList<>();
	
	india.add(uttarPradesh);
	india.add(rajstan);
	
	System.out.println("India List is:- ");
	System.out.println(india);
	System.out.println("------------------------------------------------");
	 
     List<String> california=new ArrayList<>();
	
     california.add("San Francisco");
     california.add("San Jose");
     california.add("Fresno");
     System.out.println("California state city name is:-"+california);
     System.out.println("=============================================================");
	
    List<String> texas=new ArrayList<>();
	
    texas.add("Houston");
    texas.add("San Antonio");
    texas.add("Dallas");
    System.out.println("Texas state city name is:-"+texas);
    System.out.println("===============================================================");
    System.out.println();
	
    List<List<String>> usa=new ArrayList<>();
	
    usa.add(california);
    usa.add(texas);
	
	System.out.println("USA List is:- ");
	System.out.println(usa);
	System.out.println("------------------------------------------------");
	
	List<List<List<String>>> world=new ArrayList<>();
	
	world.add(usa);
	world.add(india);
	
	System.out.println("");
	
	
	
	world.forEach(country->{
		System.out.println("Country name is:-\n"+country);
        System.out.println("*******************");
        country.forEach(state->{
        System.out.println("State name is:-\n"+state);
        System.out.println("-------------------------");
        state.forEach(city->{
        System.out.println("City name is:-\n"+city);
        System.out.println("===============================");
        });
        });
});
System.out.println(".........................................");

}
}
