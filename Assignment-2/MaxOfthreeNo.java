import java.util.Scanner;
	public class MaxOfthreeNo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the a :");
	int a = sc.nextInt();
	System.out.println("Enter the b :");
	int b = sc.nextInt();
	System.out.println("Enter the c :");
	int c = sc.nextInt();

	if(a > b && a > c){
		int max = a;
		System.out.println(""+a+" is max using(if-else)");
	}
	
	else if(b > c){
		int max = b;
		System.out.println(""+b+" is max using(if-else)");
	}
	else 
		System.out.println(""+c+" is max using(if-else)");
	
	int maximum = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c );
	System.out.println(""+maximum+" is max using (ternary operator)");

	int max1 = Math.max(a,Math.max(b,c));
	System.out.println(""+max1+" is max using (Math.max)");
}
}