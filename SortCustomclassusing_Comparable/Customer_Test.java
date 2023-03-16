package SortCustomclassusing_Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Customer_Test {
	
	public static void main(String[] args) {
		
	     Set<Customer> cust=new TreeSet<>();
			
	     Customer c1=new Customer();
			c1.setCno(10023);
			c1.setCname("Ram");
			c1.setAddress("Nagar");
			c1.setMono(9970994046l);
			
			
			 Customer c2=new Customer();
				c2.setCno(10020);
				c2.setCname("Prem");
				c2.setAddress("Pune");
				c2.setMono(7030489785l);
			
				 Customer c3=new Customer();
					c3.setCno(10022);
					c3.setCname("Anuj");
					c3.setAddress("Mumbai");
					c3.setMono(79398928597l);
			

					cust.add(c1);
					cust.add(c2);
					cust.add(c3);
			
		
					cust.forEach(customer->{
				     System.out.println("Customer number:-"+customer.getCno());
				     System.out.println("Customer Name:-"+customer.getCname());
				     System.out.println("Customer Address:-"+customer.getAddress());
				     System.out.println("Customer Mobile Number:-"+customer.getMono());
				     System.out.println("----------------------------------");
			});
			
				
		}

		}


