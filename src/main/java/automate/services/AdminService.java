package automate.services;

import automate.entities.Admin;

public interface AdminService {
	Admin validate(String userid, String pwd);
	/*
	 * validate method takes two parameters, userid and pwd which are strings
	 * representing the user id and password respectively. This method is used to
	 * validate the user id and password of an admin user in the system. The method
	 * returns an Admin object if the user is valid, or null if the user is not
	 * valid.
	 */

	void updateAdmin(Admin amin);
	/*
	 * updateAdmin method takes an Admin object as a parameter, which represents the
	 * updated information for an admin user. This method is used to update the
	 * admin user's profile in the system. The method does not return anything, it
	 * just updates the information in the database.
	 */
}