package beans;

public class User {

	private String name;
	private String password;
	
	
	public User() {
	}
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		String res = "User[";
		res += "name=" + this.name;
		res += " ; password=" + this.password;
		res += "]";
		return res;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
