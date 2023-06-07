package automate.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import automate.entities.AssignCentre;

@Repository

/**
 * The "@Repository" annotation is used to indicate that this interface is a
 * Spring Data repository, which allows it to be automatically detected and
 * instantiated by Spring.
 */
public interface AssignCentreDao extends JpaRepository<AssignCentre, Integer> {

	AssignCentre findByUserid(String userid);
}
/**
 * The "AssignCentreDao" interface defines a single method named "findByUserid"
 * which takes a String parameter "userid" and returns an object of type
 * "AssignCentre". This method will be implemented automatically by Spring Data
 * JPA at runtime, and it will perform a database query to find an AssignCentre
 * entity with the given userid.
 *
 */
