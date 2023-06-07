package automate.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import automate.entities.Assign;

@Repository
/**
 * The "@Repository" annotation is used to indicate that this interface is a
 * Spring Data repository, which allows it to be automatically detected and
 * instantiated by Spring.
 */
public interface AssignDao extends JpaRepository<Assign, Integer> {
	Assign findByUserid(String userid);
}
/**
 * The "AssignDao" interface defines a single method named "findByUserid" which
 * takes a String parameter "userid" and returns an object of type "Assign".
 * This method will be implemented automatically by Spring Data JPA at runtime,
 * and it will perform a database query to find an Assign entity with the given
 * userid.
 */




/*
 * This is a Java interface named "AssignDao" which extends the JpaRepository
 * interface provided by Spring Data JPA. It is used to perform CRUD (Create,
 * Read, Update, and Delete) operations on the "Assign" entity.
 *
 */