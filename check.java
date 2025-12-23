import java.util.Scanner;

public class check{

	public static void main(String[] args){
		
	char ch;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter given is character or digit:");
	ch=sc.next().charAt(0);

	if(ch>=48 && ch<=58)
	System.out.println("It's Digit");

	else if(ch>=65 && ch<=90)
	System.out.println("It's Uppercase Character");

	else if(ch>=97 && ch<=122)
	System.out.println("It's Lowercase Character");

	else
	System.out.println("It's Special Symbol");
	}

}