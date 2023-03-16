package Collection_Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ICC_Map {
	
	public static void main(String[] args) {

		List<String> jrwomenI = new ArrayList<>();

		jrwomenI.add("Shweta Sehrawat");
		jrwomenI.add("Shabnam Shakil");
		jrwomenI.add("Shikha Shalot");
		jrwomenI.add("Soumya Tiwari");
		jrwomenI.add("Anushka Sharma");

		List<String> jrmenI = new ArrayList<>();

		jrmenI.add("Yash Dhull");
		jrmenI.add("Raj Bawa ");
		jrmenI.add("Vicky Ostwal");
		jrmenI.add("Tom Prest");
		jrmenI.add("Vicky Ostwal");

		Set<List<String>> U19IndiaTeam = new HashSet<>();

		U19IndiaTeam.add(jrwomenI);
		U19IndiaTeam.add(jrmenI);

		System.out.println("U19 player list of India is:-\n\n" + U19IndiaTeam);
		System.out.println();
		System.out.println("--------------------------------------------------");

		List<String> srwomenI = new ArrayList<>();

		srwomenI.add("Smriti Mandhana");
		srwomenI.add("Shafali Verma");
		srwomenI.add("Jemimah Rodrigues");
		srwomenI.add("Devika Vaidya");
		srwomenI.add("Harmanpreet Kaur");

		List<String> srmenI = new ArrayList<>();

		srmenI.add("MS Dhoni");
		srmenI.add("Virat Kohli");
		srmenI.add("Rohit Sharma");
		srmenI.add("Ravindra Jadeja");
		srmenI.add("KL Rahul");

		Set<List<String>> IndiaTeam = new HashSet<>();

		IndiaTeam.add(srwomenI);
		IndiaTeam.add(srmenI);

		System.out.println("Sr Player list of India is:-\n\n" + IndiaTeam);
		System.out.println();
		System.out.println("--------------------------------------------");

		Map<String, Set<List<String>>> BCCIList = new HashMap<>();

		System.out.println();

		BCCIList.put("U19IndiaTeam", U19IndiaTeam);

		BCCIList.put("IndiaTeam", IndiaTeam);

		System.out.println("U19 & Sr player list of India are:-\n\n" + BCCIList);
		System.out.println();

		System.out.println("****************************************************");

		List<String> jrwomenA = new ArrayList<>();

		jrwomenA.add("Jade Allen");
		jrwomenA.add("Charis Bekker");
		jrwomenA.add("Paris Bowdler");
		jrwomenA.add("Ella Hayward");
		jrwomenA.add("Amy Smith");

		List<String> jrmenA = new ArrayList<>();

		jrmenA.add("Aidan Cahill");
		jrmenA.add("William Salzmann");
		jrmenA.add("Jack Nisbet");
		jrmenA.add("Joshua Garner");
		jrmenA.add("Aidan Cahill");

		Set<List<String>> U19AustraliaTeam = new HashSet<>();

		U19AustraliaTeam.add(jrwomenA);
		U19AustraliaTeam.add(jrmenA);

		System.out.println("U19 player list of Australiya is:-\n\n" + U19AustraliaTeam);
		System.out.println();
		System.out.println("-------------------------------------------");

		List<String> srwomenA = new ArrayList<>();

		srwomenA.add("Megan Schutt");
		srwomenA.add("Jess Jonassen");
		srwomenA.add("Elyse Villani");
		srwomenA.add("Alyssa Healy");
		srwomenA.add("Holly Ferling");

		List<String> srmenA = new ArrayList<>();

		srmenA.add("Steve Smith");
		srmenA.add("David Warner");
		srmenA.add("Pat Cummins");
		srmenA.add("Usman Khawaja");
		srmenA.add("Travis Head");

		Set<List<String>> AustraliaTeam = new HashSet<>();

		AustraliaTeam.add(jrmenA);
		AustraliaTeam.add(srwomenA);

		System.out.println("Sr player list of Australia is:-\n\n" + AustraliaTeam);
		System.out.println();
		System.out.println("----------------------------------------");

		Map<String, Set<List<String>>> ACBList = new HashMap<>();

		System.out.println();

		ACBList.put("U19AustraliaTeam", U19AustraliaTeam);

		ACBList.put("AustraliaTeam", AustraliaTeam);

		System.out.println("U19 & Sr player list of Australia are:-\n\n" + ACBList);
		System.out.println();
		System.out.println("*****************************************************");

		Map<String, Map<String, Set<List<String>>>> ICCList = new LinkedHashMap<>();

		ICCList.put("BCCIListIndia", BCCIList);
		ICCList.put("ACBListAustralia", ACBList);

		System.out.println("U19 & Sr Men/Women player team list of India & Australia are:-\n\n" + ICCList);
		System.out.println();
		System.out.println("===============================================================");
		System.out.println();

		System.out.println("Iterate by using Lambda Expression:-");

		ICCList.forEach((board, boardname) -> {
			                           System.out.println("Board name is:-\n" + board);
			                           System.out.println("*******************");
			                           boardname.forEach((team, teamname) -> {
				                       System.out.println("Team name is:-\n" + team);
				                       System.out.println("-------------------------");
				                       teamname.forEach((playerlist)-> {
				                       System.out.println("Player list are:-\n"+playerlist);
					                   System.out.println("=============================");
                                       
					                   playerlist.forEach(playername-> 
					                   System.out.println("Player name is:-"+playername));
						               System.out.println("-------------------------------");
					                    

				                          });
			                             });
		                               });
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		System.out.println("Iterate by using while loop:-");
		Set<String> key=ICCList.keySet();
		
		Iterator<String> itr=key.iterator();
		while(itr.hasNext())
		{
			String boardname=itr.next();
			System.out.println("Board name is:-");
			System.out.println(boardname);
			
			Map<String, Set<List<String>>> board=ICCList.get(boardname);
			Set<String> key1=board.keySet();
			Iterator<String> itr1=key1.iterator();
			while(itr1.hasNext())
			{
				String teamname=itr1.next();
				System.out.println("Team name is:-\n"+teamname);
				
				Set<List<String>> team=board.get(teamname);
				Iterator<List<String>> itr2=team.iterator();
				while(itr2.hasNext())
				{
					List<String> playerlist=itr2.next();
					
					System.out.println("Player list are:-\n"+playerlist);
					Iterator<String> itr3=playerlist.iterator();
					while(itr3.hasNext())
					{
						String playername=itr3.next();
						System.out.println("Player name is:-"+playername);
					}
					System.out.println("-----------------------------------------------------------");
					
				}
			 }
		   }
		System.out.println("==================================================");
			
			
		
		System.out.println("Iterate by using inhance for loop:-");
		System.out.println();
		Set<String> keys=ICCList.keySet();
	
		for(String boardkey:keys)
		{
			System.out.println("Board name is:-\n"+boardkey);
			System.out.println();
			Map<String,Set<List<String>>> boardname=ICCList.get(boardkey);
			Set<String> board=boardname.keySet();
			for(String teamkey:board)
			{
				System.out.println("Team name is:-\n"+teamkey);
				System.out.println();
				Set<List<String>> teamname=boardname.get(teamkey);
				for(List<String> playerlist:teamname)
				{
					System.out.println("Player list are:-\n"+playerlist);
					System.out.println();
					for(String playername:playerlist)
					{
			        System.out.println("Player name is:-\n"+playername);
					System.out.println();
			}
			System.out.println("**************************");
		}
			
		
	}
	}
}
}



