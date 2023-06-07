package automate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automate.daos.AddressDao;
import automate.entities.Address;

@Service
/**
 * It is a Spring @Service component, which means it is a candidate for Spring's
 * dependency injection mechanism.
 */
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao dao;

	/*
	 * The AddressDao dependency is injected using the @Autowired annotation. This
	 * service provides two methods:
	 */
	@Override
	public Address saveAddress(Address address) {

		return dao.save(address);
	}

	/**
	 * saveAddress(Address address): This method saves an Address entity using the
	 * AddressDao instance injected during the service creation. It returns the
	 * saved Address object.
	 */

	@Override
	public Address findAddress(int id) {
		return dao.getById(id);
	}
	/**
	 * findAddress(int id): This method finds an Address entity by its ID using the
	 * AddressDao instance injected during the service creation. It returns the
	 * Address object with the specified ID.
	 */

}
