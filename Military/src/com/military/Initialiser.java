package com.military;

import java.time.LocalDate;
import java.util.ArrayList;
public class Initialiser {
	
	//Initialises a list of perssonnel
	public static ArrayList<Military> initialiseLists() {
		
		ArrayList<Military> Personnel = new ArrayList<Military>();
		
		Personal myPerson1 = new Personal(1,"Paul", 
				"McCartney");
		Personal myPerson2 = new Personal(2,"John", 
				"Lennon");
		Personal myPerson3 = new Personal(3,"George", 
				"Harrison");
		Personal myPerson4 = new Personal(4,"Pete", 
				"Best");
		Personal myPerson5 = new Personal(5,"Ringo", 
				"Starr");
		
		LocalDate joinDate = LocalDate.of(2015, 12, 20);
		ArmyRank rank = ArmyRank.Sergeant;
		Personnel.add(new Army(myPerson1, joinDate, 
				"Connaught",rank));
		
		joinDate = LocalDate.of(2015, 11, 20);
		rank = ArmyRank.Sergeant;
		Personnel.add(new Army(myPerson2, joinDate, 
				"Leinster",rank));
			
		joinDate = LocalDate.of(2014, 11, 20);
		NavyRank nRank  = NavyRank.Marine;
		
		Personnel.add(new Navy(myPerson3, joinDate, 
				"Eithne",nRank));
		
		joinDate = LocalDate.of(2014, 11, 20);
		nRank  = NavyRank.Marine;
		
		Personnel.add(new Navy(myPerson4, joinDate, 
				"Eithne",nRank));
				
		return Personnel;		
		

	}

}
