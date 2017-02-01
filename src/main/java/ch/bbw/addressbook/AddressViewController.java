package ch.bbw.addressbook;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AddressViewController {

	@Inject
	private AddressService addressService;

    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String ort;
    private String geschlecht;
    private String email;
    private String kategorie;
    private Address addressToBearbeit;
    private int addressID;

    private String message;

    public AddressViewController() {
    	message = "";
	}

    private void clearFields() {
        firstname = "";
        lastname = "";
        phoneNumber = "";
        ort = "";
        geschlecht = "";
        email = "";
        kategorie = "";
    }
    public void saveAddress() {
        Address address = new Address(0, firstname, lastname, phoneNumber, ort, geschlecht, email, kategorie);
        addressService.registerAddress(address);
        message = "The address was saved successfully.";
        clearFields();
    }

    public void pearbeitAddress() {
    	Address address = new Address(addressID, firstname, lastname, phoneNumber, ort, geschlecht, email, kategorie);
    	addressService.update(address);
    	message = "Wurde bearpeitet!";
    	clearFields();
    }

    public String tuDerBearbeiten(Address address) {
    	this.addressToBearbeit = address;

    	this.firstname = address.getFirstname();
    	this.lastname = address.getLastname();
    	this.phoneNumber = address.getPhonenumber();
    	this.ort = address.getOrt();
    	this.geschlecht = address.getGeschlecht();
    	this.email = address.getEmail();
    	this.kategorie = address.getKategorie();
    	this.addressID = address.getId();

    	return "bearbeiten.xhtml";
    }

    public List<Address> getAddresses() {
        return new AdressSort((ArrayList<Address>)addressService.getAllAddresses()).nachVorname();
    	//return addressService.getAllAddresses();
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

	public Address getAddressToBearbeit() {
		return addressToBearbeit;
	}

	public void setAddressToBearbeit(Address addressToBearbeit) {
		this.addressToBearbeit = addressToBearbeit;
	}


}
