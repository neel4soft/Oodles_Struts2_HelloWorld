package com.oodles.dao;

import com.oodles.beans.User;
import com.oodles.services.DataConnect;

public class DataConnectDao {
	DataConnect dc = new DataConnect();
	public void insertDetailsDao(User user){
	dc.insertDetails(user);
	}

}
