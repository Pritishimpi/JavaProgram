package Collection_Lambda;

import java.util.ArrayList;
import java.util.List;

public class India_List {
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
	
	System.out.println(india);
	System.out.println("=============================");
	
	india.forEach(state->{
		                   System.out.println("State name is:-\n"+state);
		                   System.out.println();
		                   state.forEach(city->{
		                   System.out.println("City name is:-\n"+city);
		                   System.out.println("----------------------");
	});
	
	
	
});
	}
}
