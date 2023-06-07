package automate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automate.daos.AssignCentreDao;
import automate.entities.AssignCentre;

@Service
/**
 * The service class is annotated with @Service, which indicates that it is a
 * Spring-managed service component.
 */
public class AssignCentreServiceImpl implements AssignCentreService {

	@Autowired
	private AssignCentreDao dao;

	/**
	 * The AssignCentreServiceImpl class has a dependency on the AssignCentreDao
	 * interface which is injected using @Autowired annotation.
	 */

	@Override
	public void AssignCentre(AssignCentre assignCentre) {
		// TODO Auto-generated method stub
		dao.save(assignCentre);
	}

	/**
	 * AssignCentre method saves the AssignCentre object to the database using the
	 * save method of the AssignCentreDao interface.
	 */

	@Override
	public AssignCentre findById(int id) {
		// TODO Auto-generated method stub

		return dao.getById(id);
	}

	/**
	 * findById method retrieves the AssignCentre object by its id from the database
	 * using the getById method of the AssignCentreDao interface.
	 **/

	@Override
	public List<AssignCentre> allCentres() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	/**
	 * allCentres method retrieves all the AssignCentre objects from the database
	 * using the findAll method of the AssignCentreDao interface.
	 **/

}
/*
 * This is the implementation of a service class AssignCentreServiceImpl that
 * provides methods to perform CRUD operations on the AssignCentre entity.
 * Overall, the AssignCentreServiceImpl class provides a layer of abstraction
 * between the controller and the DAO layer, allowing for better separation of
 * concerns and easier maintenance of the codebase.
 */