public class DemoForEach 
{ 
	public static void main (String[] args) 
	{ 
		String[] fruits = new String[] { "Orange", "Apple", "Pear", "Strawberry" };

		for (String fruit: fruits) {
			System.out.println("Fruit is: " + fruit);
		}
	}
}
