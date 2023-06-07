package automate.services;

import java.util.List;

import automate.entities.AssignCentre;

public interface AssignCentreService {
	void AssignCentre(AssignCentre assignCentre);

	AssignCentre findById(int id);

	List<AssignCentre> allCentres();
}
