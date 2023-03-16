package Collection_Lambda;

import java.util.ArrayList;
import java.util.List;

public class A {
	
	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		
		l.forEach((nm)->System.out.println(nm));
		
		//l.forEach(System.out::println);
	}

}
