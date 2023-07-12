package practiceHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class EmDemo {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();

		configuration.configure(new File("config.xml"));
//new File("C:\\Users\\Hp ZBooK 15u G5\\IdeaProjects\\HibernatePractice\\src\\main\\java\\cinfig\\config.xml")

		SessionFactory session = configuration.buildSessionFactory();

		// ("practice/HibernatePractice/cinfig/config.xml");
		// Student(int id, String
		// name, String city, Cirtificate carti)
		//Student student = new Student(1243, "Md Toufique Husien", "Dhaka", (new Cirtificate("Bangla", "31 Days")));
		
		Student student = new Student(124, "Md Toufique Husien", "Dhaka", (new Cirtificate("Math", "31 Days")));

		Session s = session.openSession();
		Transaction tx = s.beginTransaction();

		s.save(student);
		tx.commit();
		s.close();
		session.close();

		System.out.println("Hello world!!!");

	}
}
