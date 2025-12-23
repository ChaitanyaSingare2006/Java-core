import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
	
	int num1,num2,num3;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the first number :");
	num1 = sc.nextInt();
	System.out.println("Enter the second number :");
	num2 = sc.nextInt();
	System.out.println("Enter the Third number :");
	num3 = sc.nextInt();

	if(num1+num2>num3 && num2+num3>num1 && num1+num3>num2)
	System.out.println("THE TRIANGLE IS VALID");
	else
	System.out.println("THE TRIANGLE IS NOT VALID");
    }
}