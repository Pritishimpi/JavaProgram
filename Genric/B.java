package Genric;

import java.util.ArrayList;
import java.util.List;

public class B {
	
	public static void main(String[] args) {
		
		List l=new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add("aaa");
		l.add(30);
		
		Object i=l.get(2);
		
		System.out.println(i);
		
		
		
	}

}
