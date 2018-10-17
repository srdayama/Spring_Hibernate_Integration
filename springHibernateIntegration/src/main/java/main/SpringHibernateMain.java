package main;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDAO;
import model.Person;



public class SpringHibernateMain {
public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_Integration.xml");
		PersonDAO personDAO =context.getBean(PersonDAO.class);
		
		Person p=new Person(1, "sonali", "INDIA");
		personDAO.save(p);
		Person p1=new Person(2, "sheetal", "USA");
		personDAO.save(p1);
		Person p2=new Person(3, "Sumit", "UK");
		personDAO.save(p2);
		
		List<Person> list = personDAO.list();
		for (Person pp : list) {
			System.out.println("Person List::"+pp);
		}
		
		/*personDAO.updatePerson(2);
		
		personDAO.deletePerson(4);*/
		
	}


	
	}
