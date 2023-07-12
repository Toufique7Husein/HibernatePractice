package manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
       // cnf.configure(new File("config.xml"));
        configuration.configure(new File("config.xml"));
        SessionFactory factory = configuration.buildSessionFactory();




        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = new Emp();

        Project p1 = new Project();
        Project p2 = new Project();
        Project p3 = new Project();


        e1.setEid(1);
        e2.setEid(2);
        e1.setName("Toufique");
        e2.setName("Husein");
        e3.setEid(3);
        e3.setName("Khalid");


        p1.setEid(0);
        p2.setEid(1);
        p3.setEid(2);
        p1.setName("Tresarry");
        p2.setName("Dhali");
        p3.setName("Badol");

        List<Emp> e = new ArrayList<>();
        List<Project> p = new ArrayList<>();


        e.add(e1);
        e.add(e2);

        p.add(p3);
        p.add(p1);

        p1.setEmps(e);
        p2.setEmps(e);
        p3.setEmps(e);



        e1.setProjects(p);
        e2.setProjects(p);
        e3.setProjects(p);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(e1);
        s.save(e2);
        s.save(e3);

        s.save(p1);
        s.save(p2);
        s.save(p3);


        tx.commit();
        s.close();

    }
}
