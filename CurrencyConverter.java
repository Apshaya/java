import java.util.Scanner; 
public class CurrencyConverter 
{
final static double SLR_PER_DOLLAR = 250; // exchange rate
	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in);  
		int transactionType; 
		double SLR, dollars; 
		System.out.print("Enter 1 to convert from dollars to Sri Lankan Rupees and 2 from  Sri Lankan Rupees to dollars: "); 
		transactionType = input.nextInt();
		if (transactionType == 1) // dollars to  Sri Lankan Rupees 
		{ 
			System.out.print("Number of dollars: "); 
 			dollars = input.nextDouble(); 
			SLR = SLR_PER_DOLLAR*dollars; 
			System.out.println("Number of  Sri Lankan Rupees: " + SLR); 
		} else // otherwise Sri Lankan Rupees to dollars 
		{ 
			System.out.print("Number of Sri Lankan Rupees: "); 
			SLR =input.nextDouble(); 
			dollars =SLR/SLR_PER_DOLLAR; 
			System.out.println("Number of dollars: " +dollars); 
		}		
	}  
} 
