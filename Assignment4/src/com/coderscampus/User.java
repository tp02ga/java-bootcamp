package com.coderscampus;

public class User implements Comparable<User> {
	private String username;
	private String password;
	private String name;
	protected String role;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(User that) {
		int c = that.getRole().compareTo(this.getRole());
		if (c == 0) {
			c = this.getUsername().compareTo(that.getUsername());
		}
		return c;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + "]";
	}

}
