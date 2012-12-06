package com.oodles.actions;

import com.oodles.beans.User;
import com.oodles.dao.DataConnectDao;
import com.opensymphony.xwork2.ActionSupport;

public class SaveDetails extends ActionSupport {
	

	private int userId;
	private String name;
	private String password ;
	private String gender;
	private String city;
	
	User user = new User();
	DataConnectDao dcd= new DataConnectDao(); 
	
	public String execute(){
		
		user.setCity(city);
		user.setGender(gender);
		user.setName(name);
		user.setPassword(password);
		user.setUserId(userId);
	
		dcd.insertDetailsDao(user);
		
		return SUCCESS;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

}
