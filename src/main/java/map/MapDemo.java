package map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo {
	public static void main(String[] args) {

		Configuration cnf = new Configuration();
		cnf.configure(new File("config.xml"));
		
		SessionFactory factory = cnf.buildSessionFactory();

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();


/*		Answer ans1 = new Answer(1, "I am Md Toufique Husein");
		Answer ans2 = new Answer(2, "I am Mr. Pappu");
		Answer ans3 = new Answer(3, "I am Mr. Nobody");
		Answer ans4 = new Answer(5, "Hello Bangladesh");

		List<Answer> ls = new ArrayList<>();
		ls.add(ans1);
		ls.add(ans2);
		ls.add(ans3);
		ls.add(ans4);
		Question question = new Question(1, "Who are you?");
		question.setAnswers(ls);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(question);

		for (int i= 0; i < ls.size(); i++) {
			s.save(ls.get(i));
		}*/


		Question q = s.get(Question.class, 1);

		for (Answer i: q.getAnswers()) {
			System.out.println(i.getAnswerId() + " " + i.getAnswer());
		}

		tx.commit();
		factory.close();
		
	}

	static void debug(Object...obj) {
		System.err.println(Arrays.deepToString(obj));
	}
}
