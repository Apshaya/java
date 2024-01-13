import java.util.Scanner; 
public class CheckPersonalitySwitch
{
	public static void main (String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		System.out.print("Input Score:"); 
		int score = input.nextInt(); //user supplies a grade 
		
	switch (score) 
	// every value must be enumerated! 
	{ 
	case 40: 
	case 39: 
	case 38: 
	case 37: 
	case 36: 
	case 35: 
	System.out.println("Score: " + score+ ". Your personality is Type A"); 
	break; 
	case 34: 
	case 33: 
	case 32: 
	case 31: 
	case 21: 
	System.out.println("Score: " + score + ". You are between A and B tending towards A"); 
	break;
	 //etc. 
	}

	}
}