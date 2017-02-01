package ch.bbw.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import ch.bbw.addressbook.Address;
import ch.bbw.addressbook.AdressSort;

//import org.junit.Before;
//import org.junit.Test;

public class TestAddress {

//	@Before
//	public void setup() {
//	}
//
//	@Test
//	public void testConstructor1() {
//	}
//
//	@Test
//	public void testConstructor2() {
//	}


	@Test
	public void testAddressKonschtrucktor() {
		Address aedressss = new Address(0, "Philp", "Fehrli", "07481772203", new Date(), "Winterthurhausen", "n.d.", "fipsi@pfadi.ph", "Pfadi-Anhänger");

		if (!aedressss.getFirstname().equals("Philp")) {
			fail();
		}

		if (!aedressss.getLastname().equals("Fehrli")) {
			fail();
		}

		if (!aedressss.getPhonenumber().equals("07481772203")) {
			fail();
		}

		if (!aedressss.getOrt().equals("Winterthurhausen")) {
			fail();
		}

		if (!aedressss.getGeschlecht().equals("n.d.")) {
			fail();
		}

		if (!aedressss.getKategorie().equals("Pfadi-Anhänger")) {
			fail();
		}

		if (!aedressss.getEmail().equals("fipsi@pfadi.ph")) {
			fail();
		}
	}

	@Test
	public void testSort() {
		Address aedressss = new Address(0, "Philp", "Fehrli", "07481772203", new Date(), "Winterthurhausen", "n.d.", "fipsi@pfadi.ph", "Pfadi-Anhänger");
		Address aedressss1 = new Address(1, "Manu", "Schteiner", "07481772203", new Date(), "Bülachhausen", "m", "fipsi@pfadi.ph", "Suchti");
		Address aedressss2 = new Address(0, "Kastriot", "Canaju", "07481772203", new Date(), "Bülachhausne", "m.", "kastriot@pfadi.ph", "Schippi");
		Address aedressss3 = new Address(0, "Lukas", "Bischof", "07481772203", new Date(), "Glattfeldenhausen", "m", "lukas@pfadi.ph", "Apple-Sektenanhänger");
		ArrayList<Address> list = new ArrayList<>();
		list.add(aedressss3);
		list.add(aedressss2);
		list.add(aedressss1);
		list.add(aedressss);

		AdressSort sort = new AdressSort(list);
		list = sort.nachVorname();
		System.out.println(list);
	}
}
