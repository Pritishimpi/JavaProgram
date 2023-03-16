package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
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
		
        
		List<List<String>> india=new ArrayList<>();
		
		india.add(uttarPradesh);
		india.add(rajstan);
		
		System.out.println("India state city name is:-"+india);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		List<List<String>> usa=new ArrayList<>();

		usa.add(california);
		usa.add(texas);
		
		System.out.println("USA state city name is:-"+usa);
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println();
		
		List<List<List<String>>> world=new ArrayList<>();
		
		
		world.add(india);
		world.add(usa);
		
		System.out.println("World country state city name is:-"+world);
		
		System.out.println("************************************************************************************************************************************************");
		System.out.println();
		Iterator<List<List<String>>> itr=world.iterator();
		
		
		
		System.out.println("Iterate by using while loop:-");
		System.out.println();
		while(itr.hasNext())
		{
			List<List<String>> country=itr.next();
			
			Iterator<List<String>> itr1=country.iterator();
			
			while(itr1.hasNext())
			{
				List<String> state=itr1.next();
				Iterator<String> itr2=state.iterator();
				
				while(itr2.hasNext())
				{
 				String city=itr2.next();
				System.out.println(city);
			}
			System.out.println("----------------------------------");
		}
		}
		
		System.out.println("Iterate by using for loop:-");
		System.out.println();
		
		System.out.println("City name is:-");
		for(List<List<String>> country:world)
		{
			for(List<String> state:country)
			{
				for(String city:state)
				{
			
				System.out.println(city);
			}
			System.out.println("**************************");
		}
		
	}
		
	}
}
	


