import java.util.Scanner;
	
public class CharToAsciiVal{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the No to get Character :");
	char ch = sc.nextInt().charAt(0);
		
	int uniCode = ch;
	System.out.println("The Ascii value is + ch + is :"+ uniCode);
	
		
		sc.close();

}
}