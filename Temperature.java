import java.util.Scanner;

public class Temperature{
    public static void main(String[] args) {
	
	Double F,C,K;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the temperature : ");
	
	F= sc.nextDouble();

	C= 5*(F-32)/9;
	K = C + 273.15;

	System.out.println("The temp in celcius is :"+C);
	System.out.println("The temp in kelvin is :"+K);

    }
}