import java.util.Scanner;
public class PrintHello{
  public static void main(String[] args){
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many times you want print hello : ");
	n=sc.nextInt();
	for(i=0;i<n;i++)
		System.out.println("Hello");
  }
}