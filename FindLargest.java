import java.util.Scanner;
public class FindLargest 
{ 
	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner (System.in); 
		int a, b, c; 
		System.out.print("Enter value a : "); 
		a = input.nextInt(); 
		System.out.print("Enter value b : "); 
		b = input.nextInt(); 
		System.out.print("Enter value c : "); 
		c = input.nextInt(); 
		
		int max = a; 	//a is biggest so far 
		if (b > max) 	// is b bigger than the current maximum?
			max = b; 	// if so, set max to b 
		if (c > max) 	// is c bigger than the current maximum? 
			max = c; 	// if so set max to c 
		System.out.println ("The maximum value is " + max);
		
	} 
} 












 
