package Srikanth;

public class Student {

	
	private int id;
	private String name;
	private int age;
	private String mail;
	private String gender;
	public Student(int id, String name, int age, String mail, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMail() {
		return mail;
	}
	public String getGender() {
		return gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
