import java.util.Scanner;

public class IT26102443Lab3Q2 {
	
	public static void main(String[]args) {
		
		double monthlySalary , numberOfOtHours , OtHourlyRate , otAmount , TotalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		numberOfOtHours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		OtHourlyRate = input.nextDouble();
		
		otAmount = numberOfOtHours * OtHourlyRate;
		TotalSalary = monthlySalary + otAmount;
		
		System.out.println();
		System.out.println("The total salary including OT is : " + TotalSalary);
	}
}
		
		