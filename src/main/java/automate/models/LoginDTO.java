package automate.models;

public class LoginDTO {
	private String userid;
	private String pwd;
	private String role;

	/**
	 * The "userid" variable represents the user ID used to authenticate the user,
	 * the "pwd" variable represents the password used for authentication, and the
	 * "role" variable represents the role of the user (e.g. "admin", "Seller",
	 * etc.)
	 */

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + ", pwd=" + pwd + ", role=" + role + "]";
	}

}
/*
 * This is a Java class named "LoginDTO" which represents a data transfer object
 * for user login information. It has three private member variables: "userid",
 * "pwd", and "role", along with getter and setter methods for each of these
 * variables.
 *
 * The "userid" variable represents the user ID used to authenticate the user,
 * the "pwd" variable represents the password used for authentication, and the
 * "role" variable represents the role of the user (e.g. "admin", "employee",
 * etc.).
 *
 * The "@Override" annotation is used to indicate that the following method
 * overrides a method inherited from the Object class. In this case, the
 * "toString" method is overridden to return a string representation of the
 * object's state, which includes the values of the "userid", "pwd", and "role"
 * variables.
 *
 * Overall, this class is used to transfer user login information between
 * different layers of an application (e.g. between the front-end and back-end).
 */
