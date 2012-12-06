package com.oodles.services;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.oodles.beans.User;
import com.oodles.utils.HibernateUtils;


public class DataConnect {
Session sess;
	
	public void insertDetails(User user){
		try{
			sess = HibernateUtils.getSession();
			Transaction tx = sess.beginTransaction();
			sess.save(user);
			
			System.out.println("Data Inserted in user_details");
			
			tx.commit();
			sess.close();
		}
		catch(Exception exep){
			exep.printStackTrace();
		}
	}
}
