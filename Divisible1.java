import java.util.Scanner;

public class Divisible1{
    public static void main(String[] args){
	
	int num;
	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter the Number : ");
	num =sc.nextInt();

	if(num % 5 == 0)
	System.out.println("The number is divisible by 5");

	else if(num % 7 == 0)
	System.out.println("The number is divisible by 7");
	
	else
	System.out.println("The number is not divisible by 5 and 7");


    }
}