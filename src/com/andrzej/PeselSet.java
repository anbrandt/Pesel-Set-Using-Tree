package com.andrzej;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrzej on 26.05.17.
 */
public class PeselSet {

	private ArrayList<Pesel> setOfPesels = new ArrayList<Pesel>();


	//the first method of adding the pesel to set. we are returning boolean, because we have to check if the pesel is correct while adding!
	public boolean addPeselToSet(Pesel pesel) {
		Pesel temp = new Pesel(pesel.getPeselNumber());
		if (isPeselNumberCorrect(temp)) {
			return setOfPesels.add(temp);
		}
		throw new RuntimeException("Incorrect Pesel Number");

	}

	//method for printing the size of the set of pesels
	public int getSizeOfTheSet() {
		return setOfPesels.size();
	}


	//crucial method that evaluates if the pesel is correct (by standards from wikipedia)

	public boolean isPeselNumberCorrect(Pesel pesel) {
		if (pesel.getPeselNumber().length() != 11) return false;

		char[] peselArray = pesel.getPeselNumber().toCharArray();

		int[] converted = new int[11];

		for (int i = 0; i < converted.length; i++) {
			converted[i] = Character.getNumericValue(peselArray[i]);
		}
		int controlSum = 9 * converted[0] + 7 * converted[1] + 3 * converted[2] +
				converted[3] + 9 * converted[4] + 7 * converted[5] + 3 * converted[6] +
				converted[7] + 9 * converted[8] + 7 * converted[9];

		return controlSum % 10 == converted[10];
	}


}
