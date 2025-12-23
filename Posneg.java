import java.util.Scanner;

public class Posneg{

	public static void main(String[] args){

	int n;
	
	Scanner sc=new Scanner(System.in);

	System.out.println("enter n value");
	n=sc.nextInt();
	
	if(n>0)
		System.out.println("No is positive");
	else
		System.out.println("No is negative");
	}
}