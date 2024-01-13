import java.util.Scanner; 
public class ForAddEmUp 
{ 
	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in); 
		int sum = 0; 
		int size; 
		int number; 
		System.out.print("How many numbers would you like to add? "); 
		size = input.nextInt(); 
		System.out.println("Enter the " + size + " numbers"); 
		for (int count = 1; count <= size; count++)
		{ 
			number = input.nextInt(); 
			sum += number; 
		} 
		System.out.println("Sum: " + sum); 
	} 
}
