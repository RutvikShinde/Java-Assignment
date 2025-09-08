import java.util.Scanner;
public class CharIsVowelOrConsonent {
public static void main(String[] args) {
    char a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a lowercase character : ");
    a=sc.next().charAt(0);
    if(a== 'a'||a=='e' || a=='i' || a=='o' || a=='u')
        System.out.println("given character is vowel");
    else 
        System.out.println("given character is consonent");
}
}