package Collection_Lambda;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class World_Maplist {
	
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
		
		System.out.println("Country name is:-"+world);
		
		world.forEach((country,a)->{
			System.out.println("Country name is:-\n"+country);
            System.out.println("*******************");
            a.forEach((state,b)->{
            System.out.println("State name is:-\n"+state);
            System.out.println("-------------------------");
            b.forEach((pincode,city)->{
            System.out.println("City name is:-  "+city+"  PinCode is:-"+pincode);
            System.out.println("===============================");
            });
            });
});
System.out.println(".........................................");

			                                 
	
		
		

}
}
