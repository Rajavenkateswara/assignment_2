package Assignment_2;

import java.util.Scanner;

public class task_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program which will store students information and print the output.
Program should ask how many students information you want to store. For each students it should ask name, email, phone, address, status
Once all entries are done, program should ask which user information you want to fetch and should print the same.

		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of students ");
		int snum=sc.nextInt();
		System.out.println("Please enter student name");
		String sname1=sc.next();
		System.out.println("please enter student email ");
		String semail=sc.next();
		System.out.println("please enter student phone numner");
		long sph=sc.nextLong();
		System.out.println("please enter student address");
		String sadd=sc.next();
		System.out.println("Student status Active/inactive ");
		String Status =sc.next();
		
		System.out.println("Total number of students : "+ snum);
		System.out.println("Studen name : "+ sname1);
		System.out.println("Student Email : "+ semail );
		System.out.println("Student phone number : "+ sph);
		System.out.println("Student adress : " + sadd);
		System.out.println("Student Status " + Status);
		
		

	}

}
