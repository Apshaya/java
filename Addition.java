import java.util.Scanner; 
public class Addition
{
	public static void main (String[] args) 
	{
		int sum = 0; 
		int count = 0; 
		Scanner input = new Scanner(System.in);
		while (count< 50) 
		{ 
			sum = sum + input.nextInt(); 
			count++; 
		} 
		System.out.print("Sum is"+ sum);
	}
}



