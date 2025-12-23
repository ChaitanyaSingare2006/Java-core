import java.util.Scanner;

public class Swapping2{
    public static void main(String[] args){
	
	Double a,b;

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Using addition and Sub : ");


	System.out.println("Enter the First number : ");
	a=sc.nextDouble();
	System.out.println("Enter the Second number : ");
	b=sc.nextDouble();
	
	a = a + b;
	b = a - b;
	a = a - b;

	System.out.println("The first interchanged number is : " +a);
	System.out.println("The second interchanged number is : " +b);

	System.out.println("Using multiplication and Division: ");
	
	System.out.println("Enter the First number : ");
	a=sc.nextDouble();
	System.out.println("Enter the Second number : ");
	b=sc.nextDouble();

	a = a*b;
	b = a/b;
	a=a/b;

	System.out.println("The first interchanged number is : " +a);
	System.out.println("The second interchanged number is : " +b);
	

   }
}
