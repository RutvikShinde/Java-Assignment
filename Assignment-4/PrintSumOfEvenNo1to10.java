public class PrintSumOfEvenNo1to10{
  public static void main(String[] args){
	int sum=0,i;
	 for(i=1;i<=10;i++)
	{
		if(i%2==0)
			sum+=i;
	}
	System.out.println("Sum of 1 to 10 is : "+sum);
 }
}