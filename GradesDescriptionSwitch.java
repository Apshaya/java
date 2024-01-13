import java.util.Scanner; 
public class GradesDescriptionSwitch 
{
	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		System.out.print("Input Grade:"); 
		char grade = input.next().charAt(0);//user supplies a grade 
		switch (grade) 
		{ 
		case 'A': 
		System.out.println("Excellent"); 
		break; 
		case 'B': 
		System.out.println("Good");
		break;
		case 'C': 
		System.out.println("Average");
		break; 
		case 'D': 
		System.out.println("Passing");
		break; 
		default:
		System.out.println("Failure");
		} 
 
	}
}
 
 
 