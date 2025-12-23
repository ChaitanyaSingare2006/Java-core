import java.util.Scanner;

public class Threenumbers{
    public static void main(String[] args){
	
	int num1,num2,num3;
	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter the first Number : ");
	num1 =sc.nextInt();
	System.out.println("Enter the second Number : ");
	num2 =sc.nextInt();
	System.out.println("Enter the third Number : ");
	num3 =sc.nextInt();

	if((num1>num2 && num1<num3)||(num1>num3 && num1<num2))
	System.out.println("The first is  between the two numbers");

	else 
	System.out.println("The first is not between the two numbers");
	
    }
}