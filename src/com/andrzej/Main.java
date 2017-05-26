package com.andrzej;

import java.util.Set;

public class Main {


	//pesel SET - na podstawie tego co jest zrobione u Mateusza w repo, ćwiczenie polega na dodaniu do setu numery Pesel,
	//metoda get all pesel numbers
	//metoda size
	//metoda add pesel
	//metoda check sum control if correct - sum control /length /


	public static void main(String[] args) {

		Pesel person6Pesel = new Pesel("94031704035");
		Pesel person1Pesel = new Pesel("87111716392");
		Pesel person2Pesel = new Pesel("90090515836");
		Pesel person3Pesel = new Pesel("88211716392");
		Pesel person4Pesel = new Pesel("81100216357");
		Pesel person5Pesel = new Pesel("80072909146");
		Pesel person7Pesel = new Pesel("87072909146");



		PeselSet listOfMyPesels = new PeselSet();



		listOfMyPesels.addPeselToSet(person6Pesel);
		listOfMyPesels.addPeselToSet(person1Pesel);
		listOfMyPesels.addPeselToSet(person2Pesel);
		listOfMyPesels.addPeselToSet(person3Pesel);
		listOfMyPesels.addPeselToSet(person4Pesel);
		listOfMyPesels.addPeselToSet(person5Pesel);
//		listOfMyPesels.addPeselToSet(person7Pesel);


		System.out.println(person6Pesel.getPeselNumber());
		System.out.println(person1Pesel.getPeselNumber());


		System.out.println(listOfMyPesels.getSizeOfTheSet());

		System.out.println("------------------");



//		printAllOfThePesels(listOfMyPesels);
//

	}


}
