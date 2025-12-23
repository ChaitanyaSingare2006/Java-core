import java.util.Scanner;

public class profitorloss{
    public static void main(String[] args){
	
	int cp,sp;
	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter the cost price : ");
	cp =sc.nextInt();

	System.out.println("Enter the selling price : ");
	sp =sc.nextInt();

	if(sp>cp){
	System.out.println("The seller has made profit");
	int profit = sp - cp;
	System.out.println("The seller has made profit of :" +profit);
	}
	
	else{
	System.out.println("The seller has made a loss");
	int loss = cp - sp;
	System.out.println("The seller has made loss of :" +loss);
	}
    }
}