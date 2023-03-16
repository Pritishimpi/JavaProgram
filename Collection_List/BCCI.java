package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BCCI {

	public static void main(String[] args) {
		
		//List<List<String>> womenList=new ArrayList<>();
		//List<List<String>> menList=new ArrayList<>();
		List<String> womenPlayer=new ArrayList<>();
		
		
		
		womenPlayer.add("Smriti Mandhana");
		womenPlayer.add("Shafali Verma");
		womenPlayer.add("Jemimah Rodrigues");
		womenPlayer.add("Devika Vaidya");
		womenPlayer.add("Harmanpreet Kaur");
		womenPlayer.add("Harleen Deol");
		womenPlayer.add("Deepti Sharma");
		womenPlayer.add("Pooja Vastrakar");
		womenPlayer.add("Shikha Pandey");
		womenPlayer.add("Richa Ghosh");
		womenPlayer.add("Anjali Sarwani");
		
		System.out.println("Women player list is:-");
		System.out.println();
		System.out.println(womenPlayer);
		System.out.println();
		
		List<String> menPlayer=new ArrayList<>();
		
		
		menPlayer.add("MS Dhoni");
		menPlayer.add("Virat Kohli");
		menPlayer.add("Rohit Sharma");
		menPlayer.add("Ravindra Jadeja");
		menPlayer.add("KL Rahul");
		menPlayer.add("Mayank Agarwal");
		menPlayer.add("Shreyas Iyer");
		menPlayer.add("Hardik Pandya");
		menPlayer.add("Kudeep Yadav");
		menPlayer.add("Shardul Thakur");
		menPlayer.add("Shubham Gill");
	
		System.out.println("Men player list is:-");
		System.out.println();
		System.out.println(menPlayer);
		
		List<List<String>> BCCList=new ArrayList<>();
		
		System.out.println();
		
		BCCList.add(menPlayer);
		
		BCCList.add(womenPlayer);
		
		
		Iterator<List<String>> itr=BCCList.iterator();
		System.out.println();
		System.out.println("Iterate by using while loop");
		System.out.println();
		while(itr.hasNext())
		{
			List<String> list=itr.next();
			
			Iterator<String> itr1=list.iterator();
			
				while(itr1.hasNext())
				{
					String playername=itr1.next();
				    System.out.println(playername);
			}
			
			System.out.println("----------------------------------");
		}
		System.out.println("Iterate by using for loop");
		System.out.println();
		
		for(List<String> list:BCCList)
		{
			for(String playername:list)
			{
				System.out.println(playername);
			}
			System.out.println("**************************");
		}
		
	}
}
		
	


