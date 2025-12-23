import java.util.Scanner;

public class Divisible{
    public static void main(String[] args){
	
	int num;
	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter the Number : ");
	num =sc.nextInt();

	if(num % 5==0 && num % 7==0)
	System.out.println("The number is divisible");

	else
	System.out.println("The number is not divisible");

    }
}