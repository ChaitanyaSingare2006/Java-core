import java.util.Scanner;

public class Incometax{
    public static void main(String[] args){

	Double basic_sal;

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the basic salary : ");
	basic_sal = sc.nextDouble();

	if(basic_sal<=150000)
	System.out.println("Tax is 0%");
	else if(basic_sal>150000 && basic_sal<=300000)
	System.out.println("Tax is 20%");
	else
	System.out.println("Tax is 30%");
    }
}