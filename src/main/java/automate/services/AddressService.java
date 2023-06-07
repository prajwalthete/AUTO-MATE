package automate.services;

import automate.entities.Address;

public interface AddressService {
	Address saveAddress(Address address);

	/**
	 * The saveAddress method takes an Address object as an argument and returns an
	 * Address object that represents the saved entity. This method is used to save
	 * an Address entity to the database.
	 */

	Address findAddress(int id);
	/**
	 * The findAddress method takes an integer id as an argument and returns an
	 * Address object that represents the entity with the given id. This method is
	 * used to retrieve an Address entity from the database using its id.
	 *
	 */
}
/*
 * This code defines an interface AddressService that declares two methods for
 * performing operations related to Address entities.
 *
 */