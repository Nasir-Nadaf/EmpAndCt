package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;



@Repository
public class EmpDao {
	@Autowired
	SessionFactory sf;

	public List<Employee> getAllEmployee() {
		List<Employee> list=null;
		Session session=null;
		try {
			session=sf.openSession();
			list=session.createCriteria(Employee.class).list();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return list;
	}

	public String saveEmployee(Employee employee) {
		Session session=null;
		boolean isadded= false;
		try {
			session=sf.openSession();
			Transaction tr = session.beginTransaction();
			session.save(employee);
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
			return "added successfull......";
		}else {
			return "not added";
		}
	}

	public String deleteEmployee(long id) {
		
		Session session=null;
		boolean isdeleted= false;
		try {
			session=sf.openSession();
			
			Employee employee = session.get(Employee.class,id);
			if(employee!=null) {
				Transaction tr = session.beginTransaction();
				session.delete(employee);
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
			return "deleted successfull......";
		}else {
			return "not deleted";
		}

	}

	public String updateEmployee(Employee employee) {
		
		Session session=null;
		boolean isdeleted= false;
		try {
			session=sf.openSession();
			
			Employee dbemployee = session.get(Employee.class,employee.getEmpId());
			if(dbemployee!=null) {
				session.evict(dbemployee);
				Transaction tr = session.beginTransaction();
				session.update(employee);
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
			return "updated successfull......";
		}else {
			return "updated deleted";
		}
	}

	public Employee getEmployeeById(long id) {
		Session session=null;
		Employee emp=null;
		try {
			session=sf.openSession();
			emp=session.get(Employee.class, id);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return emp;
	}

}
