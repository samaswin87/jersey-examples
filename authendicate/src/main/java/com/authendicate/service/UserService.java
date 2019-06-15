package com.authendicate.service;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	List<User> userList;
	
	public UserService() {
		userList = this.list();
	}
	
	public class User{
		private Integer id;
		private String name;
		private String password;
		private String token;
		private String sessionId;
		
		public User() {}
		
		public User(String name, String password) {
			super();
			this.name = name;
			this.password = password;
		}
		
		public User(Integer id, String name, String password) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
		}
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
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
		
		public String getToken() {
			return token;
		}
		
		public void setToken(String token) {
			this.token = token;
		}
		
		public String getSessionId() {
			return sessionId;
		}
		
		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
	}
	
	public List<User> list(){
		List<User> list = new ArrayList<User>();
		User user = new User(1, "Ashwin", "aswin");
		list.add(user);
		user = new User(1, "Ashwin", "aswin");
		list.add(user);
		user = new User(2, "Raj", "raj");
		list.add(user);
		user = new User(3, "Madhan", "madhan");
		list.add(user);
		user = new User(4, "Maddy", "maddy");
		list.add(user);
		user = new User(5, "Praveen", "praveen");
		list.add(user);
		return list;
	}
	
	public boolean addUser(User user) {
		if (user.getId() != null && find(user.getId()) == null) {
			userList.add(user);
			return true;
		}
		return false;
	}
	
	public User find(Integer id) {
		return this.userList
				   .stream()
				   .filter(user -> (user.getId() == id))
				   .findFirst()
				   .orElse(null);
	}
	
	public User findByName(String name) {
		return this.userList
				   .stream()
				   .filter(user -> (name.equals(user.getName())))
				   .findFirst()
				   .orElse(null);
	}
}
