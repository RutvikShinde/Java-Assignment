import java.util.Scanner;
public class CalculateDiscountOnProduct{
public static void main(String[] args){
int i1,i2,i3,q1,q2,q3,amount,discount;
double discountAmt,finalAmt;
Scanner sc=new Scanner(System.in);
System.out.println("enter product amount:");
i1=sc.nextInt();
System.out.println("enter quantity:");
q1=sc.nextInt();
System.out.println("enter product amount:");
i2=sc.nextInt();
System.out.println("enter quantity:");
q2=sc.nextInt();
System.out.println("enter product amount:");
i3=sc.nextInt();
System.out.println("enter quantity:");
q3=sc.nextInt();
amount=(i1*q1)+(i2*q2)+(i3*q3);
if(amount<=10000)
discount=8;
else if(amount>10000 && amount<=25000)
discount=15;
else
discount=20;
discountAmt=(discount*amount)/100;
finalAmt=amount-discountAmt;
System.out.println("total amount:"+amount);
System.out.println("discount amount:"+discountAmt);
System.out.println("final amount:"+finalAmt);
}
}