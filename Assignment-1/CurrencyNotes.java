import java.util.Scanner;
public class CurrencyNotes {
public static void main(String args[])
{
    int amt;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter amount you want to withdraw : ");
    amt=sc.nextInt();
    System.out.println("10 rs notes = "+amt/10);
    amt=amt%10;
    System.out.println("5rs notes ="+amt/5);
    amt=amt%5;
    System.out.println("1rs = "+amt/1);
    amt%=1;
}
}