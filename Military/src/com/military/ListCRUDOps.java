package com.military;

import java.util.ArrayList;

public class ListCRUDOps {

	/**
	 * @returns soldiers
	 */
	public static ArrayList<String> getSoldiers(ReadFileReturn rF) {
		ArrayList<String> soldiers = new ArrayList<String>();
		for (Military military : rF.militaryList) {
			if (military instanceof Army) {
				soldiers.add(military.toString());
			}
		}
		return soldiers;
	}

	// Returns Sailors
	public static ArrayList<String> getSalilors(ReadFileReturn rF) {
		ArrayList<String> sailors = new ArrayList<String>();
		for (Military military : rF.militaryList) {
			if (military instanceof Navy) {
				sailors.add(military.toString());
			}
		}
		return sailors;
	}

	public static WriteFileReturn addPerson(ArrayList<Military> militaryList, Military myMilitary) {
		militaryList.add(myMilitary);
		WriteFileReturn wFR = FileOps.writeToSerialFile(militaryList);
		return wFR;
	}

	public static ReadFileReturn removePerson(ArrayList<Military> militaryList, int i) {
		int loc = getIdElement(militaryList, i);

		if (loc != -1) {
			militaryList.remove(loc);
		}
		FileOps.writeToSerialFile(militaryList);
		return (FileOps.readFromSerialFile());

	}

	// If element exists, will return element position in collection
	// Otherwise returns -1
	private static int getIdElement(ArrayList<Military> militaryList, int i) {
		// TODO Auto-generated method stub

		for (int j = 0; j < militaryList.size(); j++) {
			if (militaryList.get(j).personalDetails.getMilitaryID() == i) {
				return j;
			}
		}
		return -1;
	}

	//Updates Naval Rank
	public static ReadFileReturn updatePerson(ArrayList<Military> militaryList, int i, NavyRank rank) {
		int loc = getIdElement(militaryList, i);

		if (loc != -1) {
			if(militaryList.get(i) instanceof Navy) {
				((Navy)militaryList.get(loc)).setRank(rank);
			}
				
		}
		FileOps.writeToSerialFile(militaryList);
		return (FileOps.readFromSerialFile());
	}
	
	//Updates Naval Rank
		public static ReadFileReturn updatePerson(ArrayList<Military> militaryList, int i, ArmyRank rank) {
			int loc = getIdElement(militaryList, i);

			if (loc != -1) {
				if(militaryList.get(loc) instanceof Army) {
					((Army)militaryList.get(i)).setRank(rank);
				}
					
			}
			FileOps.writeToSerialFile(militaryList);
			return (FileOps.readFromSerialFile());
		}
}
