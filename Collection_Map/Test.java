package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {
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
		
		System.out.println("State of India is:-\n"+india);
		System.out.println("-------------------------------------------------");
		
		Set<String> keys=india.keySet();
		System.out.println("Iterate by using while loop:-\n");
		
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext())
		{
			String statename = itr.next();
			System.out.println("State name is:-"+statename);
			
			Map<Integer,String> state=india.get(statename);
			
			Set<Integer> keyset=state.keySet();
			
			Iterator<Integer> itr1 = keyset.iterator();
			while(itr1.hasNext())
			{
				Integer key = itr1.next();
				String city = state.get(key);
				System.out.println("Pincode:-  "+key+"   City name:-"+city);
			
			
		}
			System.out.println("===========================");	
	}
		
		System.out.println("Iterate by using inhance for loop:-\n");
		for(String key:keys)
		{
			System.out.println("State name is:-"+key);
			
			Map<Integer,String> state=india.get(key);
			
			Set<Integer> keyset=state.keySet();
			for(Integer key1:keyset)
			{
				String city = state.get(key1);
				System.out.println("Pincode:-  "+key1+"   City name:-"+city);
			}
			System.out.println("===========================");	
			
		}
	

	}

}
