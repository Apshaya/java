import java.util.Scanner; 
public class CheckPersonality
{
	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		System.out.print("Input Score:"); 
		int score = input.nextInt(); //user supplies a grade 
		
		if (score >= 35) 
			System.out.println("Score: "+ score+ ". \nYour personality is Type A");
		else if (score >= 21) 
			System.out.println("Score:"+score+".\nYou are between A and B tending towards A");
		else if (score >= 12)
			System.out.println("Score: " +score+ ". \nYou are between A and B tending towards B");
		else 
			System.out.println("Score: " + score+ ". \nYour personality is Type B");
	}
}