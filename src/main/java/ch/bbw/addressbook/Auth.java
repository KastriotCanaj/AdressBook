package ch.bbw.addressbook;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Auth {
	private boolean isAuthed = false;
	private String pass = "";

	public Auth() {

	}

	public String authenticate() {
		System.out.println(pass);
		isAuthed = true;
		if (pass.equals("1234")) {
			isAuthed = true;
		}

		return null;
	}

	public boolean isAuthed() {
		return isAuthed;
	}

	public void setAuthed(boolean isAuthed) {
		this.isAuthed = isAuthed;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}
