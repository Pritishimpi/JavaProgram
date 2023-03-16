package Collection_Lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class India_SetList {
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
		
		System.out.println("Using HashSet:-");
		Set<List<String>> india=new HashSet<>();
		india.add(rj);
		india.add(up);
		System.out.println(india);
		System.out.println();
		
		
		india.forEach(state->{
			                  System.out.println("State name is:-\n"+state);
			                  System.out.println();
			                  state.forEach(city->{
			                  System.out.println("City name is:-\n"+city);
			                  System.out.println();
			                  });
		});
	}

}
