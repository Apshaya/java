import java.util.Scanner; 
public class ATMMachine 
{ 
	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		double balance = 5423.00, deposit, withdrawal; 
		int transaction; 
		System.out.println("Welcome! Enter the number for your transaction"); 
		System.out.println("Withdraw cash: 1"); 
		System.out.println("Make a deposit: 2"); 
		System.out.println("Check your balance: 3"); 
		System.out.println("Exit: 4"); 
		System.out.print("Transaction number: "); 
		transaction = input.nextInt(); 
		switch (transaction) 
 		{ 
		case 1: 
			System.out.println("Enter amount"); 
			withdrawal = input.nextDouble(); 
			if (withdrawal > balance) 
				System.out.println("Invalid amount"); 
			else { 
				balance -= withdrawal; 
				System.out.println("Your new balance is Rs." + balance);
			} 
			break;
		case 2: 
			System.out .println("Enter amount of deposit: "); 
			deposit = input.nextDouble(); 
			balance += deposit; 
			System.out.println("Your new balance is Rs." + balance); 
			break; 
		case 3: 
			System.out.println("Your balance is Rs." + balance); 
			break; 
		case 4: 
			System.out.println("Thank you."); 
			break; 
		default: 
		System.out.println("Invalid transaction");
		}
	} 
}
