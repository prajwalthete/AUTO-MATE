package automate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automate.daos.AssignDao;
import automate.entities.Assign;

@Service
public class AssignServiceImpl implements AssignService {

	@Autowired
	private AssignDao dao;

	@Override
	public void Assign(Assign assign) {
		// TODO Auto-generated method stub
		dao.save(assign);

	}
	/**
	 * The Assign() method is an implementation of the AssignService interface
	 * method which is used to save an assignment in the database. It receives an
	 * Assign object as a parameter and uses the dao.save() method to save the
	 * assignment in the database.
	 */

}
/*
 * This is an implementation of the AssignService interface which defines the
 * contract for operations related to assignments. The class is annotated
 * with @Service indicating that it is a Spring-managed service bean.
 *
 * The AssignServiceImpl class has a dependency on the AssignDao interface which
 * is used to perform database operations related to assignments. The @Autowired
 * annotation is used to inject an instance of the AssignDao into the
 * AssignServiceImpl class.
 *
 * The Assign() method is an implementation of the AssignService interface
 * method which is used to save an assignment in the database. It receives an
 * Assign object as a parameter and uses the dao.save() method to save the
 * assignment in the database.
 *
 * Note that there are no other methods implemented in this class for retrieving
 * or manipulating assignments in the database.
 */