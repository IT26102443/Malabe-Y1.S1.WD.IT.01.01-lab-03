import java.util.Scanner;

public class IT26102443Lab3Q1B {
	
	public static void main(String[]args){
		
		double pricePerKg , quantity , totalAmount , discount , finalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		quantity = input.nextDouble();
		
		totalAmount = pricePerKg * quantity;
		
		discount = ((totalAmount/100) * 10);
		
		finalAmount = totalAmount - discount;
		
		System.out.println();
		System.out.println("The total amount with 10% discount: " + finalAmount);
	}
}