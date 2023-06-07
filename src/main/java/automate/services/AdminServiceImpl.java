package automate.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automate.daos.AdminDao;
import automate.entities.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;

	/*
	 * The class also has an instance variable named dao of type AdminDao, which is
	 * injected by Spring using the @Autowired annotation. This variable is used to
	 * interact with the database to perform CRUD operations on the Admin entity.
	 *
	 */ @Override
	public Admin validate(String userid, String pwd) {
		Optional<Admin> admin = dao.findById(userid);
		if (admin.isPresent() && admin.get().getPwd().equals(pwd)) {
			return admin.get();
		}
		return null;
	}
	/*
	 * validate() method takes in two arguments - userid and pwd - and checks
	 * whether there is an Admin entity in the database with the given userid and
	 * pwd. If there is, it returns the Admin entity. If there isn't, it returns
	 * null.
	 */

	@Override
	public void updateAdmin(Admin admin) {
		if (admin.getPwd().equals("") || admin.getPwd() == null) {
			admin.setPwd(dao.getById(admin.getUserid()).getPwd());
		}
		dao.save(admin);
	}
	/*
	 * The updateAdmin() method takes in an Admin entity and updates it in the
	 * database. If the entity has an empty or null pwd field, the method retrieves
	 * the old pwd value from the database and sets it on the entity before saving
	 * it.
	 */

}

/*
 * This code defines a service implementation for the AdminService interface.
 *
 * The class uses Spring's @Service annotation to indicate that it is a service
 * component that should be managed by Spring.
 *
 * The class also has an instance variable named dao of type AdminDao, which is
 * injected by Spring using the @Autowired annotation. This variable is used to
 * interact with the database to perform CRUD operations on the Admin entity.
 *
 * The class implements two methods: validate() and updateAdmin(). The
 * validate() method takes in two arguments - userid and pwd - and checks
 * whether there is an Admin entity in the database with the given userid and
 * pwd. If there is, it returns the Admin entity. If there isn't, it returns
 * null.
 *
 * The updateAdmin() method takes in an Admin entity and updates it in the
 * database. If the entity has an empty or null pwd field, the method retrieves
 * the old pwd value from the database and sets it on the entity before saving
 * it.
 */