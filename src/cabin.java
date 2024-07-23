import java.util.Scanner;

public class cabin 
{
	public void cabin()
	{
		Spaceadder(10);
		System.out.println("-------------Version 0.0.0.1--------------");
		System.out.println("------------------------------------------");
		System.out.println("------Enigma Games presents... KABIN------");
		System.out.println("------------------------------------------");
		System.out.println("\n");
		
		System.out.println("You make it the cabin, \n"
				+ "It was unoccupied, above the entrance was a sign. \n"
				+ "The words spelt 'KABIN'. \n"
				+ "You wondered why on dear Irenes name would that have changed? \n"
				+ "Then you started to wonder... who on earth is Irene? \n"
				+ "Although the thought only continues to worsen your headache. \n"
				+ "Instead you approach the door to the 'KABIN'. \n");
		
		System.out.println("Type in Continue \n");
		
		inventory inv = inventory.getInstance();
		
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		boolean checker = false;
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		
		if (inv.getkabinkey() == false)
		{
			Spaceadder(2);
			System.out.println("You attempt to open it but the door was securely locked. \n"
					+ "You look around but find nothing interersting to help you get in. \n"
					+ "It looks like you'll need to find a key somewhere. \n"
					+ "You head back to your original location. \n");
			
			System.out.println("Type in Continue \n");
			
			while (checker == false)
			{
				checker = LocErrHandler(input);
			}
			checker = false;
			
		}
		else if (inv.getkabinkey() == true)
		{
			Spaceadder(2);
			System.out.println("You scramble through your pocket finding the key you found the lookout tower. \n"
					+ "In anticipation you put the key in the hole, hoping for it to open. \n"
					+ "With a promising click, you open the door and head in. \n");
			
			System.out.println("Enter in Continue \n");
			
			while (checker == false)
			{
				checker = LocErrHandler(input);
			}
			checker = false;
		}
		
	}
	public static void Spaceadder(int space)
	{ // Here is what we use to create the space in between each segment of dialogue
		while (space > 0)
		{
			System.out.println();
			space--;
		}
	}
	public static boolean LocErrHandler(Scanner input)
	{
		String outcome;
		
		
		try
		{
			outcome = input.nextLine();
			if (outcome.toLowerCase().equals("continue"))
			{
				return true;
			}
			else
			{
				System.out.println("You've provided an incorrect string");
				System.out.println("Please enter...");
				System.out.println("'Continue' following actions");
			}

		}
		catch (Exception E)
		{
			System.out.println("Please enter a valid response in letters...");
			System.out.println("'Enter' OR 'Exit' for their following actions");
		}
		return false;
	}

}
