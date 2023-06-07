package automate.models;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response {
	public static ResponseEntity<?> success(Object data) {
		Map<String, Object> map = new HashMap<>();
		map.put("status", "success");
		if (data != null)
			map.put("data", data);
		return ResponseEntity.ok(map);
	}

	/**
	 * success(Object data): This method takes an object data as a parameter,
	 * creates a HashMap with the key-value pair "status":"success", and if the data
	 * parameter is not null, adds a key-value pair "data":data to the HashMap. It
	 * then returns a ResponseEntity object with HTTP status code 200 (OK) and the
	 * HashMap as the body.
	 *
	 */
	public static ResponseEntity<?> error(Object err) {
		Map<String, Object> map = new HashMap<>();
		map.put("status", "error");
		if (err != null)
			map.put("error", err);
		return ResponseEntity.ok(map);
	}

	/**
	 * error(Object err): This method is similar to the success method, but it
	 * creates a HashMap with the key-value pair "status":"error", and if the err
	 * parameter is not null, adds a key-value pair "error":err to the HashMap. It
	 * returns a ResponseEntity object with HTTP status code 200 (OK) and the
	 * HashMap as the body.
	 *
	 */
	public static ResponseEntity<?> status(HttpStatus status) {
		return ResponseEntity.status(status).build();
	}
	/**
	 * status(HttpStatus status): This method takes an HTTP status code as a
	 * parameter and returns a ResponseEntity object with the specified status code
	 * and an empty body.
	 */
}

/*
 * This code defines a class Response that provides static methods to create
 * ResponseEntity objects that are returned as responses from API endpoints in a
 * Spring Boot application.
 *
 * These methods can be used in the application's controller methods to create
 * responses with appropriate status codes and body content.
 */
