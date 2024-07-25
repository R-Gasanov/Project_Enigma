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
			
			Spaceadder(2);
			System.out.println("You enter inside the Kabin. \n"
					+ "The moment you do, your headache worsens. \n"
					+ "You take haste and attempt to rebalance yourself. \n"
					+ "Finally after it weakens again you get to look around. \n"
					+ "It looked suprisingly cosy,"
					+ "with post it notes stuck around everywhere and furniture that made it look like a bedroom. \n"
					+ "There was another room to your left as well too. Leading to the bathroom. \n"
					+ "But wait... you haven't been here at all to know that? \n"
					+ "But something in your mind tells you that this place is all to familiar. \n");
			
			System.out.println("Enter in Continue \n");
			
			while (checker == false)
			{
				checker = LocErrHandler(input);			
			}
			checker = false;
			
			// Here we have the choices for the story line the character can go through.
			
			while (checker == false)
			{
				int location = 0;
				Spaceadder(2);
				System.out.println("What do you choose to look at? \n"
						+ "Enter '1' to look at the desk. \n"
						+ "Enter '2' to look at the notice board. \n"
						+ "Enter '3' to look at the cabinet. \n"
						+ "Enter '4' to look at the bed. \n"
						+ "Enter '5' to look at the bedside table. \n"
						+ "Enter '6' to look at the bathroom door. \n"
						+ "Enter '7' to go back. \n");
				location = LocKabinHandler(input);
			}
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
	
	public static int LocKabinHandler(Scanner input)
	{
		String outcome;
		try
		{
			outcome = input.nextLine();
			
			if (outcome.equals("1"))
			{
				return 1;
			}
			else if (outcome.equals("2"))
			{
				return 2;
			}
			else if (outcome.equals("3"))
			{
				return 3;
			}
			else if (outcome.equals("4"))
			{
				return 4;
			}
			else if (outcome.equals("5"))
			{
				return 5;
			}
			else if (outcome.equals("6"))
			{
				return 6;
			}
			else if (outcome.equals("7"))
			{
				return 7;
			}
		}
		catch (Exception E)
		{
			System.out.println("Please enter a valid response in letters...");
			System.out.println("'Enter' OR 'Exit' for their following actions");
		}
		
		
		return 0;
	}
	public static void desk()
	{
		Spaceadder(2);
		
	}
}
