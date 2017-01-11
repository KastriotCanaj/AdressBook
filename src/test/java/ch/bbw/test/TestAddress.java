package ch.bbw.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.bbw.addressbook.Address;

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
		Address aedressss = new Address(0, "Philp", "Fehrli", "123456789");

		if (!aedressss.getFirstname().equals("Philp")) {
			fail();
		}

		if (!aedressss.getLastname().equals("Fehrli")) {
			fail();
		}

		if (!aedressss.getPhonenumber().equals("123456789")) {
			fail();
		}
	}
}
