package practiceHiber;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
    	cfg.configure("practice/HibernatePractice/cinfig/config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
    	Session session =  factory.openSession();
    	
    	
    	Address address = session.get(Address.class, 5);
    	System.out.println(address.toString());
    	
    	
    	session.close();
    	factory.close();
    	
	}
}
