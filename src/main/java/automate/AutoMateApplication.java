package automate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AutoMateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoMateApplication.class, args);
	}

}
/*
 * This is the main class for a Spring Boot application for a AUTO-MATE backend.
 * 
 * @SpringBootApplication annotation indicates that this is a Spring Boot
 * application and enables auto-configuration and component scanning.
 * 
 * @EnableJpaAuditing annotation enables JPA Auditing in the application, which
 * allows for automatic population of createdAt and updatedAt fields in entities
 * annotated with @EntityListeners(AuditingEntityListener.class).
 */