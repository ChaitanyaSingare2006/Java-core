import java.util.Scanner;

public class Salary{
    public static void main(String[] args){
	
	Double sal;
	int emp_id;

	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter the employee id : ");
	emp_id =sc.nextInt();

	System.out.println("Enter the Basic salary : ");
	sal =sc.nextDouble();

	System.out.println(" The basic salary of employee id:" +emp_id+ " is "+sal);


	sal= sal + (sal*0.10) + (sal * 0.30) - (sal*0.05);

	System.out.println("The take home salary of the employee is :"+sal);
    }
}




			
	