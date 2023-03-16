package Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class B {

	public static void main(String[] args) {
        System.out.println("ArrayList is:-");
        System.out.println();
		List l = new ArrayList<>();
		

		l.add(10);
		l.add(20.101f);
		l.add("aaa");
		l.add(1234.9506d);
		l.add('S');
		l.add(99089975467l);
		l.add(false);
		
	

		System.out.println(l);
		System.out.println();
		System.out.println("ArrayList is:- Iterate using for each loop");
        System.out.println();
		for (Object ob : l) 
		{
			
			if (ob instanceof Integer)
			{
				System.out.println(ob);
			}
			
			if (ob instanceof Float) 
			{
				System.out.println(ob);
				
			}
		
			 if (ob instanceof String)
			 { 
				 System.out.println(ob); 
				 
		      } 
			 
			 if(ob instanceof Double) 
			 { 
				 System.out.println(ob);
				 
		     }
			 if(ob instanceof Character)  
			 { 
				 System.out.println(ob); 
				
		     }
			 if(ob instanceof Long)  
			 { 
				 System.out.println(ob); 
				
		     }
			 if(ob instanceof Boolean)  
			 { 
				 System.out.println(ob); 
				
		     }
			
			
		}
		 System.out.println("**************");
		
		
		 Iterator<Object> itr=l.iterator();
		 System.out.println("ArrayList is:- Iterate using while loop");
		 System.out.println();
		 while(itr.hasNext()) 
		 { 
			 Object ob=itr.next();
			
			 if (ob instanceof Integer)
				{
					System.out.println(ob);
				}
				
				if (ob instanceof Float) 
				{
					System.out.println(ob);
					
				}
			
				 if (ob instanceof String)
				 { 
					 System.out.println(ob); 
					 
			      } 
				 
				 if(ob instanceof Double) 
				 { 
					 System.out.println(ob);
					 
			     }
				 if(ob instanceof Character)  
				 { 
					 System.out.println(ob); 
					
			     }
				 if(ob instanceof Long)  
				 { 
					 System.out.println(ob); 
					
			     }
				 if(ob instanceof Boolean)  
				 { 
					 System.out.println(ob); 
					
			     }
		   
		 }
		 

	}

}


