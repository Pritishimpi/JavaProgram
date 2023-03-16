package Collection_Lambda;

import java.util.HashMap;
import java.util.Map;

public class MapI {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(10,"JAVA");
		m.put(20,"Python");
		
		m.forEach((k,v)->{
			             System.out.println(k);
			             System.out.println(v);
		});
		
	}


}
