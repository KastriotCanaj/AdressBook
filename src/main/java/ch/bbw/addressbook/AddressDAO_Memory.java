package ch.bbw.addressbook;

import java.util.ArrayList;
import java.util.List;

//@Named
//@ApplicationScoped
public class AddressDAO_Memory /*implements AddressDAO*/{
		
	private List<Address> addresses = new ArrayList<>();
	
	// CRUD Commands: Create Read Update Delete
	public void create(Address address) {
		address.setId(addresses.size()+1);
		addresses.add(address);
	}
	
	public Address read(int id) {
		return addresses.get(id-1);
	}
	public List<Address> readAll() {
		return addresses;
	}

	public void update(Address address) {
		// TODO: update, not implemented yet
	}
	
	public void delete(int id) {
		// TODO: delete, not implemented yet
	}

}
