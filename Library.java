import java.util.Scanner;

public class Library{
	
	public static void main(String[] args){

	int d;

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the No of days");
	d=sc.nextInt();

	if(d<=5)
	System.out.println("Fine is 50rs");
	
	else if(d>=6 && d<=10)
	System.out.println("Fine is 100rs");
	
	else
	System.out.println("Fine is 200rs");
	
	}
}