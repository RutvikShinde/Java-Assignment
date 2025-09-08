import java.util.Scanner;
public class CheckProfitLoss{
	public static void main(String args[]){
		float cp,sp;
		double l,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cost price ");
		cp=sc.nextFloat();
		System.out.println("Enter Selling Price ");
		sp=sc.nextFloat();

		if(sp>cp){
				p=sp-cp;
				System.out.println("Profit is "+p);
		}
		else if(cp>sp){
				l=cp-sp;
				System.out.println("Loss is "+l);
		}
		else {
			System.out.println(" No profit No Loss ");
		}
	}
}