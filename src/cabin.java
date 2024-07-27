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
				if (location == 1)
				{
					desk();
				}
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
	public static int SelErrHandler(Scanner input)
	{
		
		try
		{
			String outcome = input.nextLine();
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
		}
		catch (Exception E)
		{
			System.out.println("Please an integer and not any other character");
			System.out.println("'1' or '2' or '3' are your valid choices");
		}
		return 4;
	}
	public static void desk()
	{
		boolean checker = false;
		Spaceadder(2);
		System.out.println("The desk was to the right of you. \n"
				+ "It was accompanied with a little lantern with candle that died. \n"
				+ "There was one last match stick left beside so you don't hesitate to light it up. \n"
				+ "Besides that, there were a couple of other things alongside it. \n"
				+ "One being a post it note and another being a letter. \n"
				+ "Which do you choose to read? \n");
		
		
		Scanner input = new Scanner(System.in);
		int result = 4;
		while (result != 3)
		{
			System.out.println("Enter '1' for the letter. \n"
					+ "Enter '2' for the post it note. \n"
					+ "Enter '3' look elsewhere. \n");
			
			result = SelErrHandler(input);
			if (result == 1)
			{
				Spaceadder(2);
				System.out.println("You decide to look at the letter, \n"
						+ "\n"
						+ "Hey Arran,\n"
						+ "\n"
						+ "I’ll keep this short. You remember what I told you earlier back in the truck? \n"
						+ "I’m sorry I wasn’t able to come after all, I had to check up on Bonnie in the hospital.\n"
						+ "\n"
						+ "After she had that bad fall from the lookout tower, I couldn’t have kept her all alone in there. \n"
						+ "\n"
						+ "She didn’t have anyone to talk to, and no one would understand her. \n"
						+ "\n"
						+ "Especially with her talking about her visions. \n"
						+ "\n"
						+ "No doctor would believe her Clairvoyance.\n"
						+ "\n"
						+ "I’m glad you managed to make it inside, its safe in here. \n"
						+ "\n"
						+ "I’ve accidentally left the place in a bit of a mess too. \n"
						+ "\n"
						+ "You know me loving my post it notes. I’m always picky especially on the colouring. \n"
						+ "\n"
						+ "My favourites being Emerald and Calamime, I never liked the name of it being pink or green anyways. \n"
						+ "\n"
						+ "I hope that helps, I’m sorry for leaving you there alone. \n"
						+ "\n"
						+ "I wish you luck.\n"
						+ "Stay Safe, \n"
						+ "\n"
						+ "From Fiona - The best Conservationist in all of Britannia \n");
			}
			else if (result == 2)
			{
				Spaceadder(2);
				System.out.println("Psst Bonnie, \n"
						+ "I’ve heard Duncan hired a new replacement already. \n"
						+ "Pray to me they’re another girl. \n"
						+ "The quantity of guys and girls here isn’t equal enough here, sorry lads! \n"
						+ "Fiona \n");
			}
		}
		
	}
}
