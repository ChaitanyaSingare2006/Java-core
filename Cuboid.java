import java.util.Scanner;

public class Cuboid{
    public static void main(String[] args){
	
	Double l,b,h;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the length : ");
	l=sc.nextDouble();
	System.out.println("Enter the breadth : ");
	b=sc.nextDouble();
	System.out.println("Enter the height : ");
	h=sc.nextDouble();

	Double area = 2*((l*b) + (l*h) + (b*h));
	Double volume= l*b*h;

	System.out.println("The Surface area of Cuboid is : " +area);
	System.out.println("The Volume of Cuboid is : " +volume);

   }
}
