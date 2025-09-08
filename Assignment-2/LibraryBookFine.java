import java.util.Scanner;
public class LibraryBookFine{
public static void main(String[] args){
int days,fine=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter how days did you return a book late:");
days=sc.nextInt();
if(days<=5 && days>0)
fine=10;
else if(days>5 && days<=10)
fine=15;
else if(days>10)
fine=20;
else
System.out.println("you dont need to pay fine");
System.out.println("for "+days+" you have to pay "+fine+"Rs fine");
}
}