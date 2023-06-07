package automate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automate.entities.AssignCentre;
import automate.models.Response;
import automate.services.AssignCentreService;

@CrossOrigin
@RestController
@RequestMapping("/api/assignCentre")
public class AssignCentreController {

	@Autowired
	private AssignCentreService assignCentreService;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody AssignCentre assigncentre) {
		assignCentreService.AssignCentre(assigncentre);
		return Response.success(assigncentre);
	}

}