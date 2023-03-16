package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Even_Odd {
	
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<>();
	System.out.println("Enter the number how much you want add in List:- ");
	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	
	for(int i=0;i<a;i++)
	{
		int listNo=sc.nextInt();
		list.add(listNo);
	}
    System.out.println(list);
    
    System.out.print("Print even number:-"); 
    
     Iterator<Integer> itr=list.iterator();
     while(itr.hasNext())
	    {
    	 int no=itr.next();
          if(no%2 == 0)
            { 
        	  
        	  System.out.println(no);
            } 
          
	    }
        


}
}


