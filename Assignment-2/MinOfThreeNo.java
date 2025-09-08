import java.util.Scanner;
	public class MinOfThreeNo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a :");
	int a = sc.nextInt();
	System.out.println("Enter b :");
	int b = sc.nextInt();
	System.out.println("Enter c :");
	int c = sc.nextInt();
	
	if(a < b && a < c){
		System.out.println(""+a+" is min using (if-else)");
	}
	else if(b < c){
		System.out.println(""+b+" is min using (if-else)");
	}
	else
		System.out.println(""+c+" is min using (if-else)");

	int min =(a < b) ? ((a  <  c) ? a : c) : ((b < c) ? b : c);
		System.out.println(""+min+" is min using (ternary operator)");

	int min1 = Math.min(a,Math.min(b,c));
		System.out.println(""+min1+" is min using (Math.min)");

}
}
		