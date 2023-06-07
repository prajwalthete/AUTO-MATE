package automate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import automate.entities.Admin;
import automate.models.LoginDTO;
import automate.models.Response;
import automate.services.AdminService;

@CrossOrigin
/*
 * The @CrossOrigin annotation enables cross-origin resource sharing (CORS),
 * which allows requests from different domains to access the resources of this
 * API.
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	/*
	 * @Autowired is a Spring annotation that injects a dependent bean into the
	 * current bean. In this case, the AdminService dependency is being injected
	 * into the current bean.
	 */

	@PostMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		Admin admin = adminService.validate(dto.getUserid(), dto.getPwd());
		if (admin != null)
			return Response.success(admin);
		else
			return Response.status(HttpStatus.NOT_FOUND);
	}

	/*
	 * The validateUser method handles POST requests to the /api/admin/validate
	 * endpoint. It takes in a JSON payload in the request body, which should
	 * contain a LoginDTO object representing the user's credentials. The method
	 * passes these credentials to the AdminService to validate them against a
	 * database of admin users. If the credentials are valid, the method returns an
	 * HTTP response with a JSON payload containing the admin object as a successful
	 * response, or a 404 status code if the credentials are invalid.
	 *
	 *
	 */
	@PostMapping
	public ResponseEntity<?> updateProfile(@RequestBody Admin admin) {
		adminService.updateAdmin(admin);
		return Response.status(HttpStatus.OK);
	}
	/*
	 * The updateProfile method handles POST requests to the /api/admin endpoint. It
	 * takes in a JSON payload in the request body, which should contain an Admin
	 * object representing the admin's profile. The method passes this object to the
	 * AdminService to update the admin's profile in the database. The method
	 * returns an HTTP response with a 200 status code if the update is successful.
	 */

}
