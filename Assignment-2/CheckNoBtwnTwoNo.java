import java.util.Scanner;
public class CheckNoBtwnTwoNo{
public static void main(String[] args){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter first no:");
a=sc.nextInt();
System.out.println("enter second no:");
b=sc.nextInt();
System.out.println("enter third no:");
c=sc.nextInt();
if((a>b && a<c)||(a<b && a>c))
System.out.println("a is in between b and c");
else
System.out.println("a is not in between b and c");
}
}