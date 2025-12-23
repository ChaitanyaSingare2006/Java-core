import java.util.Scanner;

public class voworcons{
    public static void main(String[] args){
	
	char ch;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the character :");
	ch = sc.next().charAt(0);

	if(ch>='a' && ch<='z'){
		if(ch == 'a'||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u')
	        System.out.println("The given character is vowel");
		else
	        System.out.println("The given character is Consonant");
		}
	else
	System.out.println("The given character is not a lowercase character");
    }
}
