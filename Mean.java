import java.util.Scanner;

public class Mean{
    public static void main(String[] args) {
	
	Double a,b,AM,HM;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the First number : ");
	System.out.println("Enter the Second number : ");

	a = sc.nextDouble();
	b = sc.nextDouble();

	AM = (a+b)/2;
	HM = (a*b)/(a+b);
	
	System.out.println("The Arithmetic mean is :" +AM);
	System.out.println("The Harmonic mean is : " +HM);

    }
}