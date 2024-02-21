package Srikanth;
import java.io.*;
import java.util.Scanner;


public class FileHandling {

	public static void main(String[] args)  {
	
	try {
		//Create a new file 
		File obj = new File("fileName.txt");
		if(obj.createNewFile()) {
			System.out.println("sucessfully created new file"+obj.getName());
		}else {
			System.out.println("already created");
		}
		
		//know the details about the file
		if(obj.exists()) {
			System.out.println("Name of file :"+obj.getName());
			System.out.println("absolute path of file :"+obj.getAbsolutePath());
			System.out.println("can able read :"+obj.canRead());
			System.out.println("can able write :"+obj.canWrite());
			System.out.println("file size :"+obj.length());
		}
		
		// write some data into that file
		FileWriter writerobj=new  FileWriter("fileName.txt");
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter the data into file :");
		writerobj.write(sc1.nextLine());
		writerobj.close();
		System.out.println("Successfully wrote");
		
		
		//Read the file
		Scanner sc = new Scanner(obj);
		while(sc.hasNextLine()) {
			String data=sc.nextLine();
			System.out.println(data);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("error occured");
		e.printStackTrace();
	}
		
	}

//	

}
