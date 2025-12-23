import java.util.Scanner;

public class Time{
    public static void main(String[] args){
	
	int hours,mins,secs;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the no. of hours :");
	hours = sc.nextInt();
	System.out.println("Enter the no. of mins :");
	mins = sc.nextInt();
	System.out.println("Enter the no. of secs :");
	secs = sc.nextInt();

	if((hours>=0 && hours<24)&&(mins>=0 && mins<60)&&(secs>=0 && secs<60))
	System.out.println("Time is valid");
	else
	System.out.println("Time is NOT valid");
    }
}

