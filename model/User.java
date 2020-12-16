package model;

public class User {

	private String name;
	private String password;
	
	
	public User() {
		this.name = "defaultuser";
		this.password = "defaultpassword";
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
	
	
}
