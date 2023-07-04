package com.jbk.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Registration;



@Repository
public class RegistrationDao {
	@Autowired
	SessionFactory sf;

	public Registration userLogin(Registration reg) {
		Session session=null;
		Registration reg1=null;
		try {
			session=sf.openSession();
			Criteria criteria = session.createCriteria(Registration.class);
			criteria.add(Restrictions.eq("emailId",reg.getEmailId() ));
			criteria.add(Restrictions.eq("password",reg.getPassword() ));
			reg1=(Registration) criteria.uniqueResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
		return reg1;
	}

}
