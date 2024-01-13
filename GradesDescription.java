import java.util.Scanner; 
public class GradesDescription 
{
	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		System.out.print("Input Grade:"); 
		char grade = input.next().charAt(0);//user supplies a grade 
		if (grade == 'A') 
			System.out.println("Excellent");
		else if (grade == 'B') 
			System.out.println("Good");
		else if (grade== 'C')   
			System.out.println("Average");
		else if (grade == 'D') 
			System.out.println("Passing");
		else 
			System.out.println("Failure"); 
	}
}
 
 
 