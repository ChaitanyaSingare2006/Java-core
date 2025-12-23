import java.util.Scanner;

public class Swapping{
    public static void main(String[] args){
	
	Double a,b,temp;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the First number : ");
	a=sc.nextDouble();
	System.out.println("Enter the Second number : ");
	b=sc.nextDouble();
	
	temp = a;
	a = b;
	b = temp;

	System.out.println("The first interchanged number is : " +a);
	System.out.println("The second interchanged number is : " +b);

   }
}
