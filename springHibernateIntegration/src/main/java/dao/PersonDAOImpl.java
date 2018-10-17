package dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Person;

public class PersonDAOImpl implements PersonDAO {
	private SessionFactory sessionfactory;
	
	
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public void save(Person p) {
		Session session=this.sessionfactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
		session.close();
		
		
	}

	public List<Person> list() {
		Session session=this.sessionfactory.openSession();
		List<Person>peronList=session.createQuery("from Person").list();
		session.close();
		return peronList;
		
	}

}
