
public class User {
	private String fname, lname, email, phone, adrs;

	
	public User() {
		super();
	}

	public User(String fname, String lname, String email, String phone, String adrs) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.adrs = adrs;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdrs() {
		return adrs;
	}

	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}
	
	

}
