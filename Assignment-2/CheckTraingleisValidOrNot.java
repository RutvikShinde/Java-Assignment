 import java.util.Scanner;
public class CheckTraingleisValidOrNot {
public static void main(String[] args) {
    float a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first side of traingle : ");
    a=sc.nextFloat();
    System.out.println("Enter second side of traingle : ");
    b=sc.nextFloat();
    System.out.println("Enter third side of traingle : ");
    c=sc.nextFloat();

    if((a+b>c)&&(a+c>b)&&(c+b>a))
        System.out.println("Traingle is valid ");
    else
        System.out.println("Traingle is not valid");
}
}