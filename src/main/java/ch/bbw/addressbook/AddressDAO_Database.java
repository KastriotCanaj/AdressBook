package ch.bbw.addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
public class AddressDAO_Database implements AddressDAO {

	private Connection connection; // TODO: to be replaced by connection pool

	public AddressDAO_Database() {
	}

	@PostConstruct
	private void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/addressbook","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@PreDestroy
	private void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	// CRUD Commands: Create Read Update Delete
	/* (non-Javadoc)
	 * @see ch.bbw.addressbook.AddressDAOInterface#create(ch.bbw.addressbook.Address)
	 */
//	@Override
	public void create(Address address) {
		// TODO: create, not implemented yet
	}

	/* (non-Javadoc)
	 * @see ch.bbw.addressbook.AddressDAOInterface#read(int)
	 */
//	@Override
	public Address read(int id) {
		// TODO: read, not implemented yet
		return null;
	}

	/* (non-Javadoc)
	 * @see ch.bbw.addressbook.AddressDAOInterface#readAll()
	 */
//	@Override
	public List<Address> readAll() {
		List<Address> list = new ArrayList<>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet entries = stmt.executeQuery("SELECT * FROM address");
			while (entries.next()) {
				list.add(new Address(
						entries.getInt("id"), entries.getString("firstname"),
						entries.getString("lastname"), entries.getString("phonenumber"),
						entries.getDate("registrationDate"), entries.getString("ort"),
						entries.getString("geschlecht"), entries.getString("email"),
						entries.getString("kategorie")));
			}
			entries.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see ch.bbw.addressbook.AddressDAOInterface#update(ch.bbw.addressbook.Address)
	 */
//	@Override
	public void update(Address address) {
		// TODO: update, not implemented yet
	}

	/* (non-Javadoc)
	 * @see ch.bbw.addressbook.AddressDAOInterface#delete(int)
	 */
//	@Override
	public void delete(int id) {
		// TODO: delete, not implemented yet
	}

}
