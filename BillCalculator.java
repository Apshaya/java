import java.util.Scanner;
public class BillCalculator 
{ 
	final static double TAX_RATE = 0.08; // notice TAX_RATE is a constant 
 	final static double SHIPPING_FEE = 5.00; // another constant 

	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner (System.in); 
		double sale, taxes, total; 
		System.out.print("Enter the item price: $ "); 
		sale = input.nextDouble(); 
 		taxes = sale * TAX_RATE; 
 		total = sale + taxes; 
		System.out.println("Sale: $" + sale); 
		System.out.println("Tax: $" + taxes);

			if (sale < 25.00)
			{
 				total += SHIPPING_FEE;
				System.out.println("Shipping is $5.00");
			} 
			System.out.println("Final cost: $" + total); 
		} 
} 
