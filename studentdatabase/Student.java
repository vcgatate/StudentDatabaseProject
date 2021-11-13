package studentdatabase;

import java.util.Scanner;
public class Student {

	private String firstname;
	private String lastname;
	private int year;
	private int studentID;
	private String courses = null;
	private int balance;
	private static int cost= 600;
	private static int id=1001; 
	
	// Constructor to prompt for user name and year
	public Student ()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student First name");
		this.firstname = sc.nextLine();
		
		System.out.println("Enter the Student Last name");
		this.lastname = sc.nextLine();
		
		System.out.println("Enter the Student Registration year");
		
		this.year = sc.nextInt();
		
		setStudentID();
		System.out.println(firstname + " " + lastname + " " + year);
		
	}
	
	//Generate an ID 
	private void setStudentID()
	{
		id ++;
		 this.studentID= year + id;
	}
	
	// Enroll n courses
	public void enroll()
	{
		do {
		System.out.print("enter the course to be enrolled (Q to quit) ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();

		if(!course.equals("Q"))
		{
			courses = courses + course;
			balance = balance + cost;
		}
		else 
		{
			System.out.println("break");
			break;
		}
		} while (1!=0);
		System.out.println("course enrolled in :" + courses);
		System.out.println("balance :" +balance);
	}
		
	public void viewTuitionBalance() {
		System.out.println("balance is " + balance);
	}
	
	//view balance amount to pay
	public void payTuitionAmount()
	{
		System.out.println("enter payment");
		Scanner in = new Scanner(System.in);
		int payment= in.nextInt();
		balance = balance - payment;
		viewTuitionBalance();
	}
	// show status
	public String showInfo() {
		return "Name" + " " + firstname + " " + lastname +
				"\n courses enrolled" + courses +
				"\n Balance " + balance ;
			}
	
}
