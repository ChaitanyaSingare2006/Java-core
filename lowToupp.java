import java.util.Scanner;

public class lowToupp{

	public static void main(String[] args){

	char ch,ch1=0;

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a Character");
	ch=sc.next().charAt(0);

	if(ch>='a' && ch<='z'){
	ch1=(char)(ch-32);
	System.out.println("Lower to upper:"+ch1);
	}
	else if(ch>='A' && ch<='Z'){
	ch1=(char)(ch+32);
	System.out.println("Upper to Lower:"+ch1);
	}
	else{
	System.out.println("Invalid Character");
	}
	}
}