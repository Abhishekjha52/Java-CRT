import java.util.*;
class Student
{
	String name;
	int rollno;
	int marks1,marks2,marks3,marks4,marks5,marks6;
	void read()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name : ");
		name=sc.nextLine();
		System.out.println("Enter your rollno : ");
		rollno=sc.nextInt();
		System.out.println("Enter your marks in 6 subjects : ");
		marks1=sc.nextInt();
		marks2=sc.nextInt();
		marks3=sc.nextInt();
		marks4=sc.nextInt();
		marks5=sc.nextInt();
		marks6=sc.nextInt();
	}		
}
class Exams extends Student{
	void print()
	{
	int total=marks1+marks2+marks3+marks4+marks5+marks6;
	double average=total/6;
	if(average>=40)
	{
		System.out.println("PASS");
	}
	else
		System.out.println("FAIL");
	}
}
class Demo
{
	public static void main(String args[])
	{
		Exams s=new Exams();
		s.read();
		s.print();
	}
}
		

