import java.util.Scanner;

public class Positive{
    public static void main(String[] args){
	
	int num;
	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter the Number : ");
	num =sc.nextInt();

	if(num>0)
	System.out.println("The number is positive");
	
	else if(num == 0)
	System.out.println("The number is neutral");

	else
	System.out.println("The number is negative");
    }
}