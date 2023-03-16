package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class India {

	
	public static void main(String[] args) {
		
		
		List<String> up=new ArrayList<>();
		
		up.add("Patana");
		up.add("Bihar");
		up.add("Agra");
		
		
		List<String> rj=new ArrayList<>();
		
		rj.add("Jaipur");
		rj.add("Kota");
		rj.add("Ajmer");
		
		
		List<List<String>> india=new ArrayList<>();
		
		india.add(rj);
		india.add(up);
		
		
		
		Iterator<List<String>> itr=india.iterator();
		
		while(itr.hasNext())
		{
			List<String> state=itr.next();
			
			Iterator<String> itr1=state.iterator();
			
			while(itr1.hasNext())
			{
				String city=itr1.next();
				System.out.println(city);
			}
			System.out.println("----------------------------------");
		}
		
		for(List<String> state:india)
		{
			for(String city:state)
			{
				System.out.println(city);
			}
			System.out.println("**************************");
		}
		
	}
}
