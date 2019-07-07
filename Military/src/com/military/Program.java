package com.military;

import java.time.LocalDate;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Military> militaryList = Initialiser.initialiseLists();
		//Rather than just getting the file returned, this 
		//WriteFileReturn and ReadFileReturn classes allow us to 
		//get exception information
		
		WriteFileReturn wF;
		ReadFileReturn rF;
		
		System.out.println("Writing initial list to console");

		for (Military military : militaryList) {
			System.out.println(military.toString());
		}

			System.out.println("Writing list to file");
			wF = FileOps.writeToSerialFile(militaryList);

			if (wF.isSuccess()) {
				System.out.println("reading list from file");
				rF = FileOps.readFromSerialFile();
				if (rF.isSuccess()) {
					System.out.println("List read from file");
					
					for (Military myMilitary : rF.militaryList) {
						System.out.println(myMilitary.toString());
					}
				}
			}
			else
			{
				//Print exception message
				System.out.println("Error in file write" + wF.getEx().toString());
			}
			
			rF = FileOps.readFromSerialFile();
			
			System.out.println("Printing Army");
			ArrayList<String> soldiers = ListCRUDOps.getSoldiers(rF);
			for (String soldier : soldiers) {
				System.out.println(soldier);
			}
			
			System.out.println("Printing Navy");
			ArrayList<String> sailors = ListCRUDOps.getSalilors(rF);
			for (String soldier : sailors) {
				System.out.println(sailors);
			}
			
			//Add a person
			Personal myPerson = new Personal(5,"Ringo","Starr");
			LocalDate joinDate = LocalDate.of(2015, 12, 20);
			NavyRank rank = NavyRank.LeadingHand;
			Military myMilitary = new Navy(myPerson, joinDate, 
					"Eithne",rank);
			
			ListCRUDOps.addPerson(rF.militaryList,myMilitary);
			//Updated List
			for (Military updatedMilitary : rF.militaryList) {
				System.out.println(updatedMilitary.toString());
			}
			
			int id = 4;
			//Remove a Person
			rF = ListCRUDOps.removePerson(rF.militaryList,id);
			System.out.println("List with Element Removed");
			
			for (Military updatedMilitary : rF.militaryList) {
				System.out.println(updatedMilitary.toString());
			}
			
			//Update the rank of an exiting person
			rF = ListCRUDOps.updatePerson(rF.militaryList,3, NavyRank.PettyOfficer);
			
			//Updating military rank
			System.out.println("List with Element Updated");
			for (Military updatedMilitary : rF.militaryList) {
				System.out.println(updatedMilitary.toString());
			}
		}

	}


