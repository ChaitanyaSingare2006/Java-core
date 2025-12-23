import java.util.Scanner;

public class Velocity{
    public static void main(String[] args) {
	
	Double u,a,t,v,s;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Initial velocity : ");
	System.out.println("Enter the acceleration : ");
	System.out.println("Enter the time : ");

	
	u= sc.nextDouble();
	a= sc.nextDouble();
	t= sc.nextDouble();

	v = u + a*t;
	s = u + a*t*t;

	System.out.println("The final velocity is :"+v);
	System.out.println("Distance travelled is :"+s);

    }
}