import java.util.Scanner;

public class Evenodd{

	public static void main(String[] args){

	int n;
	
	Scanner sc=new Scanner(System.in);

	System.out.println("enter n value");
	n=sc.nextInt();
	
	if(n%2==0)
		System.out.println("No is Even");
	else
		System.out.println("No is Odd");
	}
}