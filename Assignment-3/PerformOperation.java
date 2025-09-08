import java.util.Scanner;
public class PerformOperation{
public static void main(String[] args){
int a,b;
char op;
Scanner sc=new Scanner(System.in);
System.out.println("enter first no:");
a=sc.nextInt();
System.out.println("enter second no:");
b=sc.nextInt();
System.out.println("enter operand:");
op=sc.next().charAt(0);
switch(op){
case '+'->System.out.println("addition:"+(a+b));
case '-'->System.out.println("substraction:"+(a-b));
case '*'->System.out.println("multiplication:"+(a*b));
case '/'->System.out.println("division:"+(a/b));
default->System.out.println("wrong operand!!");
}
}
}