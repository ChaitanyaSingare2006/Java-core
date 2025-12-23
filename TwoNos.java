import java.util.Scanner;

public class TwoNos{
    public static void main(String[] args){
	
	int num1,num2;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the first number :");
	num1 = sc.nextInt();
	System.out.println("Enter the second number :");
	num2 = sc.nextInt();

	if(num1==num2)
	System.out.println("BOTH NUMBERS ARE EQUAL");
	if(num1>num2)
	System.out.println("NUM1 IS GREATER THAN NUM2");
	if(num1<num2)
	System.out.println("NUM1 IS SMALLER THAN NUM2");
    }
}