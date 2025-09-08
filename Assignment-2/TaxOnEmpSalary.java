import java.util.Scanner;
public class TaxOnEmpSalary{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	float basicSal;
	double tax;
	System.out.println("Enter salary :");
	basicSal=sc.nextFloat();
	if(basicSal<150000)
		tax=0;
	else if(basicSal>150000 && basicSal<=300000)
		tax=(basicSal - 150000) * 0.20;
	else
		tax=(150000 * 0.20) +((basicSal- 300000) * 0.30);

	System.out.println("tax : "+tax);
}
}