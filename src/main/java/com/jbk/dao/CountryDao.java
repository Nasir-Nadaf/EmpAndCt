package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;

@Repository
public class CountryDao {
	
	@Autowired
	SessionFactory sf;

	public List<Country> getAllCountry() {
		List<Country> list=null;
		Session session=null;
		try {
			session=sf.openSession();
			list=session.createCriteria(Country.class).list();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return list;
	}
	

	public String saveCountry(Country country) {
		Session session=null;
		boolean isadded= false;
		try {
			session=sf.openSession();
			Transaction tr = session.beginTransaction();
			session.save(country);
			tr.commit();
			isadded=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		if(isadded) {
			return "country added successfull......";
		}else {
			return "not added";
		}
	}

	public String deleteCountry(long id) {
		Session session=null;
		boolean isdeleted= false;
		try {
			session=sf.openSession();
			
			 Country country = session.get(Country.class,id);
			if(country!=null) {
				Transaction tr = session.beginTransaction();
				session.delete(country);
				tr.commit();
				isdeleted=true;
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		if(isdeleted) {
			return "country deleted successfull......";
		}else {
			return "not deleted";
		}
	}

	public String updateCountry(Country country) {
		Session session=null;
		boolean isdeleted= false;
		try {
			session=sf.openSession();
			
			Country dbcountry = session.get(Country.class,country.getcId());
			if(dbcountry!=null) {
				session.evict(dbcountry);
				Transaction tr = session.beginTransaction();
				session.update(country);
				tr.commit();
				isdeleted=true;
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		if(isdeleted) {
			return "country updated successfull......";
		}else {
			return "not updated ";
		}
	}

	public Country getCountryById(long id) {
		Session session=null;
		Country cty=null;
		try {
			session=sf.openSession();
			cty=session.get(Country.class, id);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return cty;
	}
	
	
	

}
