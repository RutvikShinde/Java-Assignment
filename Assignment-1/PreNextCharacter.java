import java.util.Scanner;
	
public class PreNextCharacter{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the Character :");
	char ch = sc.nextInt().charAt(0);
			
	char prev = (char) (ch - 1);
	char next = (char) (ch + 1);
	
	System.out.println("The Previous char is :"+ prev);
	System.out..println("The Nextchar is :"+ next);
		
		sc.close();
}
}