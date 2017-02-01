package ch.bbw.addressbook;

import java.util.ArrayList;

public class AdressSort {
	private ArrayList<Address> adresses;

	public AdressSort(ArrayList<Address> adresses){
		this.adresses = adresses;
	}

	public ArrayList<Address> nachVorname(){
		adresses.sort((Address a1, Address a2) -> {
			return a1.compareTo(a2);
		});
		return adresses;
	}

}