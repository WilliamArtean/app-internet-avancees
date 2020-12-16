package model;

import java.util.HashMap;

public class UserDB {
	
	private static HashMap<String, User> users = new HashMap<String, User>();
	
	public static void createUser(String name, String password) {
		users.put(name, new User(name, password));
	}
	
	public static User getUser(String name) {
		if (users.containsKey(name)) {
			return users.get(name);
		} else {
			return null;
		}
	}
	
}
