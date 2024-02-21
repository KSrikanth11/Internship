package Srikanth;
import java.util.*;

public class CrudManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentOperations so = new StudentOperations();
	
		Scanner sc1 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		
		int choice;

        do {
            System.out.println("\n1. Add Student\n2. Display All Students\n3. Update Student\n4. Delete Student\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = sc1.nextInt();
                    System.out.print("Enter student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age = sc1.nextInt();
                    System.out.print("Enter student Mail: ");
                    String mail = sc.nextLine();
                    System.out.print("Enter student gender: ");
                    String gender = sc.nextLine();
                    sc1.nextLine();
                    
                    so.addStudent(new Student( id, name, age,mail, gender));
                    break;
                case 2:
//                	 System.out.print("Enter student ID: ");
//                     int id1 = sc.nextInt();
                    so.displayAll();
                    
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                     id = sc1.nextInt();
                    System.out.print("Enter student Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter student age: ");
                    age = sc1.nextInt();
                    System.out.print("Enter student Mail: ");
                     mail = sc.nextLine();
                    System.out.print("Enter student gender: ");
                     gender = sc1.nextLine();
                     sc.nextLine();
                    so.updateStudent(id,name,age,mail,gender);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    so.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice <=5);

        sc.close();
        sc1.close();
    
		
		
	}

	

}
