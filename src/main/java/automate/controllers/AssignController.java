package automate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automate.entities.AssignCentre;
import automate.models.Response;
import automate.services.AssignCentreService;

@CrossOrigin
@RestController
@RequestMapping("/api/received")
public class AssignController {

	@Autowired
	AssignCentreService assignCentreService;

	@GetMapping
	public ResponseEntity<?> findAllCentre() {
		List<AssignCentre> result = assignCentreService.allCentres();
		return Response.success(result);
	}

}
