package automate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ContactUs {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String email;
	private String thoughts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
	@Override
	public String toString() {
		return "ContactUs [id=" + id + ", email=" + email + ", thoughts=" + thoughts + "]";
	}

}
