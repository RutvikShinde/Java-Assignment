import java.util.Scanner;
public class CheckTimeIsValidOrNot{
public static void main(String[] args){
int hour,minute,second;
Scanner sc=new Scanner(System.in);
System.out.println("enter a time:");
System.out.println("enter a hour:");
hour=sc.nextInt();
System.out.println("enter a minute:");
minute=sc.nextInt();
System.out.println("enter a second:");
second=sc.nextInt();
if(hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second<60)
System.out.println("time is valid");
else
System.out.println("time is invalid");
}
}