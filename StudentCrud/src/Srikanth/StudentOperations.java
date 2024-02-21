package Srikanth;
import java.util.ArrayList;
import java.util.Iterator;


public class StudentOperations {
	private ArrayList<Student> students;
	
	public StudentOperations() {
	
		students = new ArrayList<>();
	}
	public void addStudent(Student student) {
		students.add(student);
//		Iterator<Student> i= students.iterator();
//		while(i.hasNext()) {
//			Student stu =i.next();
//			System.out.println(stu);
//		}
		System.out.println("Successfully your details added");
		
	}
	public void searchStudent(int id) {
		
		for(Student stu: students) {
			if(stu.getId()==id) {
				System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge()+" "+stu.getGender()+" "+stu.getMail());
			return;
			}
			
		}
		System.out.println("Student Record Not Found");
		
		
	}
	public void displayAll() {
		Iterator<Student> i= students.iterator();
		while(i.hasNext()) {
			Student stu =i.next();
//			System.out.println(stu);
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge()+" "+stu.getMail()+" "+stu.getGender());
		}
		
	}
	
	public void updateStudent(int id, String name, int age,String mail,String gender ) {
		
		
		for(Student stu : students) {
			if(stu.getId()==id) {
				stu.setName(name);
				stu.setAge(age);
				stu.setMail(mail);
				stu.setGender(gender);
				System.out.println("Updated successfully");
				return;
			}
		}
		System.out.println("Student Record Not Found");
	}
	
	public void deleteStudent(int id) {
		for(Student stu : students) {
			if(stu.getId()==id) {
				students.remove(stu);
				System.out.println(" Successfully Deleted");
				return;
			}
		}
		System.out.println("Student Record Not Found");
	}
	
	
	

}
