import java.util.Scanner;

public class Marks{
    public static void main(String[] args){

	int m1,m2,m3,total_mks,avg;

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the marks for first subject : ");
	m1 = sc.nextInt();	
	System.out.println("Enter the marks for second subject : ");
	m2 = sc.nextInt();
	System.out.println("Enter the marks for third subject : ");
	m3 = sc.nextInt();	

	total_mks = m1+m2+m3;
	System.out.println("THE TOTAL MARKS ARE :" +total_mks);
	avg= total_mks/3;
	System.out.println("THE TOTAL AVERAGE IS :" +avg);


	if(total_mks>90)
	System.out.println("CLASS 1");
	else if(total_mks>80 && total_mks<=90)
	System.out.println("CLASS 2");
	else if(total_mks>70 && total_mks<=80)
	System.out.println("CLASS 3");
	else if(total_mks>60 && total_mks<=70)
	System.out.println("PASS");
	else
	System.out.println("FAIL");
    }
}











	
	
