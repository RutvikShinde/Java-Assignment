import java.util.Scanner;
public class FindReverseNo{
  public static void main(String args[]){
	int n,s=0,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	
	while(n>0){
		r=n%10;
		s=s*10+r;
		n=n/10;
	}
	System.out.println("Reversed number : "+s);
 }
}