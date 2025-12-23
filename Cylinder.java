import java.util.Scanner;

public class Cylinder{
    public static void main(String[] args) {
	
	Double dim,area,vol,r,h;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the dimension : ");
	System.out.println("Enter the radius : ");
	System.out.println("Enter the height : ");

	dim= sc.nextDouble();
	r= sc.nextDouble();
	h= sc.nextDouble();

	area=2 * 3.14 * r * r + 2 * 3.14 * r * h ;
	vol=3.14 * r * r * h;

	System.out.println("The area of circle is :"+area);
	System.out.println("The circumference of circle is :"+vol);

    }
}