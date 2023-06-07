package automate.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import automate.entities.Admin;

@Repository
/**
 * The AdminDao interface is annotated with @Repository, which is a Spring
 * annotation used to indicate that the class is a repository. Spring will
 * automatically detect this class as a bean and manage its lifecycle.
 */
public interface AdminDao extends JpaRepository<Admin, String> {

}
/**
 * The AdminDao interface is generic and takes two parameters - Admin and
 * String. Admin represents the entity class that the repository manages and
 * String represents the type of the entity's primary key.
 */