import java.util.Scanner;

public class areaofcircle{
    public static void main(String[] args) {
	
	Double r,area,circum;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the radius : ");
	r = sc.nextDouble();

	area=3.14*r*r;
	circum=2*3.14*r;

	System.out.println("The area of circle is :"+area);
	System.out.println("The circumference of circle is :"+circum);

    }
}