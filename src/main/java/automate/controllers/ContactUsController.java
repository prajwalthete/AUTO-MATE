package automate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automate.entities.ContactUs;
import automate.models.Response;
import automate.services.ContactUsService;

@CrossOrigin
@RestController
@RequestMapping("/api/contactus")
public class ContactUsController {


	@Autowired ContactUsService contactservice;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody ContactUs contact) {
		contactservice.AddConatactus(contact);
		return Response.success(contact);
	}
}
