package ch.bbw.addressbook;

import java.util.List;

public interface AddressDAO {

	// CRUD Commands: Create Read Update Delete
	void create(Address address);

	Address read(int id);

	List<Address> readAll();

	void update(Address address);

	void delete(int id);

}