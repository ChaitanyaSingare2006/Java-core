import java.util.Scanner;

public class Currency{
    public static void main(String[] args){
	
	
	int amt,note10,note5,note1;

	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter the amount to be withdrawn : ");
	amt =sc.nextInt();

	note10 = amt / 10;
	amt = amt % 10;

	note5= amt / 5;
	amt = amt % 5;

	note1 = amt;


	System.out.println("The total number of 10rupee notes cashier will give :"+note10);
	System.out.println("The total number of 5rupee notes cashier will give :"+note5);
	System.out.println("The total number of 1rupee notes cashier will give :"+note1);

    }
}