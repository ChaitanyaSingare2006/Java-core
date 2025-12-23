import java.util.Scanner;

public class quantity{
	
	public static void main(String[] args){

	int q1,q2,q3,r1,r2,r3,item1,item2,item3;
	double totalSales,discount=0,netamount;
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Quantity");
	q1=sc.nextInt();
	q2=sc.nextInt();
	q3=sc.nextInt();

	System.out.println("Enter Rate");
	r1=sc.nextInt();
	r2=sc.nextInt();
	r3=sc.nextInt();
	
	totalSales=(q1*r1)+(q2*r2)+(q3*r3);

		
	if(totalSales > 10000)
	System.out.println("20% discount");
	
	else if(totalSales> 5000 && totalSales < 10000)
	System.out.println("15% discount");
	
	else if(totalSales > 100 && totalSales <  5000)
	System.out.println("8% discount");
	
	else
	System.out.println("No discount");
	
	}
}