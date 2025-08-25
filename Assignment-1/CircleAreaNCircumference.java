import java.util.Scanner;
public class CircleAreaNCircumference {
	public static void main(String [] args){
		float r;
		double area,circumference;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius: ");
	r=sc.nextFloat();
	area=Math.PI*r*r;
	System.out.println("Area of circle: "+area);
	circumference=Math.PI*2*r;
	System.out.println("Circumference of circle is : "+circumference);
}
}
