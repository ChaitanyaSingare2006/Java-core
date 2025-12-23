import java.util.Scanner;

public class Quadrant{
    public static void main(String[] args){
	
	int x,y;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the x coordinate :");
	x = sc.nextInt();
	System.out.println("Enter the y coordinate :");
	y = sc.nextInt();

	if(x>0 && y>0)
	System.out.println("The point lies in First quadrant");
	else if(x<0 && y>0)
	System.out.println("The point lies in Second quadrant");
	else if(x<0 && y<0)
	System.out.println("The point lies in Third quadrant");
	else if(x>0 && y<0)
	System.out.println("The point lies in Fourth quadrant");
	else
	System.out.println("The point lies at origin");
	
    }
}

