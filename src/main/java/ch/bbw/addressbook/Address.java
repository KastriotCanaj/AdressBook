package ch.bbw.addressbook;

import java.util.Date;

public class Address implements Comparable<Address>{

	private int id;
	private String firstname;
    private String lastname;
    private String phonenumber;
    private Date registrationDate;
    private String ort;
    private String geschlecht;
    private String email;
    private String kategorie;

    public Address(int id, String firstname, String lastname, String phonenumber, String ort, String geschlecht, String email, String kategorie) {
    	this(id, firstname, lastname, phonenumber, null, ort, geschlecht, email, kategorie);
    }
    public Address(int id, String firstname, String lastname, String phonenumber, Date registrationDate, String ort, String geschlecht, String email, String kategorie) {
    	this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.registrationDate = registrationDate;
        this.ort = ort;
        this.geschlecht = geschlecht;
        this.email = email;
        this.kategorie = kategorie;
    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((geschlecht == null) ? 0 : geschlecht.hashCode());
		result = prime * result + id;
		result = prime * result + ((kategorie == null) ? 0 : kategorie.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((ort == null) ? 0 : ort.hashCode());
		result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (geschlecht == null) {
			if (other.geschlecht != null)
				return false;
		} else if (!geschlecht.equals(other.geschlecht))
			return false;
		if (id != other.id)
			return false;
		if (kategorie == null) {
			if (other.kategorie != null)
				return false;
		} else if (!kategorie.equals(other.kategorie))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (ort == null) {
			if (other.ort != null)
				return false;
		} else if (!ort.equals(other.ort))
			return false;
		if (phonenumber == null) {
			if (other.phonenumber != null)
				return false;
		} else if (!phonenumber.equals(other.phonenumber))
			return false;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		return true;
	}
	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return this.firstname.compareTo(o.getFirstname());
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber="
				+ phonenumber + ", registrationDate=" + registrationDate + ", ort=" + ort + ", geschlecht=" + geschlecht
				+ ", email=" + email + ", kategorie=" + kategorie + "]";
	}
}
