package Genric;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<>();
		
		
		a.add(10);
		a.add(20);
		a.add(30);
		//a.add("aaa");
		a.add(40);
		
		System.out.println(a);
		
		Integer i=a.get(3);
		
		System.out.println(i);
		
	}
}
