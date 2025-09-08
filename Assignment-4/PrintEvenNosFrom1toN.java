import java.util.Scanner;
public class PrintEvenNosFrom1toN{
  public static void main (String args[]){
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	n=sc.nextInt();
	if(n<1)
		System.out.println("number must begreater than 1");
	System.out.println("Even nos :");
	for(i=1;i<=n;i++)
	{	  
	  if(i%2==0)
		System.out.println(i);
	}
}
}