import java.util.Scanner;
	public class NoIsDivisibleBy5And7UsingOr{
	public static void main(String [] args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a No :");
	int no = sc.nextInt();

	if(no % 5 == 0 || no % 7 == 0)
		System.out.println(no+" is divisible by 5 or 7");
	else 
		System.out.println(no+" is not divisible by 5 or 7");
}
}