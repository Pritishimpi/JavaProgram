package Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SequenceWise {
	
	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<>();
		
		m.put("aaa", 5);
		m.put("bbb", 15);
		m.put("ccc", 25);
		m.put("eee", 35);
		m.put("ddd", 45);
		System.out.println("MapList is:-");
		System.out.println(m);
		
		int a=m.get("ddd");
		System.out.println("ddd is:-"+a);
		
		Set<String> keys=m.keySet();
		System.out.println(keys);
		System.out.println("Iterate the elements by using inhance for loop:-");
		for(String k:keys)
		{
			System.out.println(k);
			Integer x = m.get(k);
			System.out.println(x);
		}
		
	}

}
