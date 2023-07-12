package practiceHiber;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	
	@Id
	private int id;
	private String name; 
	private String city; 
	@Embedded
	private Cirtificate carti;
	
	
	public Student(int id, String name, String city, Cirtificate carti) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.carti = carti;
	}


	public Cirtificate getCarti() {
		return carti;
	}


	public void setCarti(Cirtificate carti) {
		this.carti = carti;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", carti=" + carti + "]";
	}
	
	
	
}
