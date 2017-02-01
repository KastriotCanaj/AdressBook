package ch.bbw.addressbook;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
@Named("AddressDAO")
@ApplicationScoped
public class AddressDAO_Mockup implements AddressDAO {

	protected ArrayList<Address> addressesss = new ArrayList<>();

	@Override
	public void create(Address address) {
		// TODO Auto-generated method stub
		addressesss.add(address)
;	}

	@Override
	public Address read(int id) {
		for (Address addi : addressesss) {
			if (addi.getId() == id) {
				return addi;
			}
		}

		return null;
	}

	@Override
	public List<Address> readAll() {
		return this.addressesss;
	}

	@Override
	public void update(Address address) {
		for (Address adress : addressesss) {
			if (address.getId() == adress.getId()) {
				this.addressesss.set(adress.getId(), address);
			}
		}
	}

	@Override
	public void delete(int id) {
		this.addressesss.remove(id);
	}

}
