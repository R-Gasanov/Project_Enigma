import java.util.Scanner;


public class core 
{
	public void StartGame()
	{
		Spaceadder(10);
		System.out.println("-------------Version 0.0.0.1--------------");
		System.out.println("------------------------------------------");
		System.out.println("------Enigma Games presents... KABIN------");
		System.out.println("------------------------------------------");
		System.out.println("\n");
		
		// Below is the initial dialogue that starts up.
		
		System.out.println("Your head felt heavy.\n"
				+ "As you begin to come back to your senses, you notice where you are.\n"
				+ "Your in the middle of some woods."
				+ "You get up from the dried layer of crispy leaves, patting yourself clean.\n"
				+ "Wondering how you got here in the first place.\n"
				+ "You tried to think back but you're met with the stabbing pain in your head.\n"
				+ "Only to realise besides the pain, your mind is blank.\n"
				+ "With no memories as to why you're here.\n"
				+ "You try and dig around your pockets, hoping for anything.\n"
				+ "Only to find a rusty compass, and nothing to indicate as to who you are.\n");
		
		System.out.println("Type in 'Continue' or 'C'. \n");
		
		int count = 0;
		boolean checker = false;
		
		Scanner input = new Scanner(System.in);
		// Conditional statement going on below based on the story line of the user
		while (count != 1)
		{
			checker = LocErrHandler(input);
			if (checker == true)
			{
				checker = false;
				count++;
				Spaceadder(2);
				System.out.println("Panic settles in, realising the dire situation.\n"
						+"You take deep breaths, hoping to calm yourself down.\n"
						+"Thankfully the sharp pain in your head started to turn dull.\n"
						+"With that out of the way for now, you're able to look around.\n");
			}
		}
		while (count != 2)
		{
			System.out.println("Type in 'Continue' or 'C'. \n");
			
			checker = LocErrHandler(input);
			if (checker == true)
			{
				checker = false;
				Spaceadder(2);
				System.out.println("To the north was a lookout tower,\n"
						+"visible above the trees mounting to the northern hill.\n"
						+"\n"
						+"To the west, were a few trees,\n"
						+"the only thing notable was what appeared to be an outline of a cabin.\n"
						+"\n"
						+"The last thing you do notice is a path that leads south.\n"
						+"Bending slightly between the trees.\n"
						+"\n"
						+"To the east was nothing but dense forest,\n"
						+"You have this odd feeling that nothing good can come in that direction.\n"
						+"\n"
						+"Where do you choose to go?\n"
						);
				count++;
			}
		}
		while (count != 3)
		{ // Here we have the choice to select for multiple different locations
			System.out.println("Enter '1' for the Lookout Tower.\n"
					+ "Enter '2' for the Cabin.\n"
					+ "Enter '3' for the Southern Path.\n"
					+ "Enter '4' to look at your Inventory \n"
					// Potentially implementing an inventory throughout the locations
					// May come around in a 3.0 update.
					);
			
			int intchecker = 5;
			while (intchecker == 5)
			{
				//input.nextLine();
				intchecker = SelErrHandler(input);
				//System.out.println("This is the intchecker" + intchecker);
			}
			
			// Below we are doing the inventory if its 4 or the location if its everything else
			if ( intchecker == 4)
			{
				inventorycheck();
			}
			else // Head back to choosing a location
			{
				locationselect(intchecker);
			}
		}

		
	}
	public static boolean LocErrHandler(Scanner input) // UPDATED VERSION -> Don't forget to copy...
	{ // Handlers string based inputs from the user
		String outcome;
		try
		{
			outcome = input.nextLine();
			//System.out.println(outcome);
			
			// New shortcut added with the c instead of having to constantly write c
			// Now everyone can stop complaining that it takes too long to type continue...
			// Боже мой...
			if ((outcome.toLowerCase().equals("continue")) || (outcome.toLowerCase().equals("c")))
			{
				return true;
			}
			
			else
			{
				System.out.println("You've provided an incorrect string");
				System.out.println("Please enter...");
				System.out.println("'Continue' or 'C' for following actions...");
			}
		}
		catch (Exception E)
		{
			// Yes I am too easy to change these lines of text...
			System.out.println("Please enter a valid response in letters...");
			System.out.println("'Enter' OR 'Exit' for their following actions");
		}
		return false;
	}
	public static void Spaceadder(int space)
	{ // Here is what we use to create the space in between each segment of dialogue
		while (space > 0)
		{
			System.out.println();
			space--;
		}
	}	
	public static int SelErrHandler(Scanner input)
	{ // Handlers integer based inputs from the user
		String selecter;
		try
		{ // Remember! nextLine is for String, nextInt is for Integer
			selecter = input.nextLine();
			
			if (selecter.equals("1"))
			{
				return 1;
				
			}
			else if (selecter.equals("2"))
			{
				return 2;
				
			}
			else if (selecter.equals("3"))
			{
				return 3;
				
			}
			else if (selecter.equals("4"))
			{
				return 4;
			}
			else
			{
				System.out.println("You've provided an incorrect integer");
				System.out.println("Please enter...");
				System.out.println("Just the integer '1'");
				System.out.println(selecter);
			}
			
		}
		catch (Exception E)
		{
			System.out.println("Please an integer and not any other character");
			System.out.println("'1' or '2' or '3' are your valid choices");
			//selecter = input.nextInt();
		}
		return 5;
		
	}
	public static void locationselect(int input)
	{ // Meanwhile here is the selector of the three locations the user can go to
		
		// Here we are creating instances from other classes 
		if (input == 1)
		{
			System.out.println("You decide to head to the Lookout Tower.\n");
			lookout_tower location_go = new lookout_tower();
			location_go.lookout_tower();
		}
		else if (input == 2)
		{
			System.out.println("You decide to head to the Cabin.\n");
			cabin location_go = new cabin();
			location_go.cabin();
		}
		else if (input == 3)
		{
			System.out.println("You decide to head to the Southern Path.\n");
			rustic_truck location_go = new rustic_truck();
			location_go.rustic_truck();
		}
	}
	public static void inventorycheck()
	{
		// Here we will be checking what we have in the inventory
		inventory inv =  inventory.getInstance();
		
		Spaceadder(2);
		System.out.println("Within your inventory, you have... \n");
		
		if (inv.getrustycompass() == true)
		{
			System.out.println("A rusty compass. \n");
		}
		if (inv.getkabinkey() == true)
		{
			System.out.println("A key to the Cabin. \n");
		}
		if (inv.getnote() == true)
		{
			System.out.println("A note from the Lookout Tower. \n");
		}
		if (inv.getcarfuel() == true)
		{
			System.out.println("A red fuel canister. \n");
		}
		if (inv.getgun() == true)
		{
			System.out.println("A rifle with two bullets remaining. \n");
		}
	}
}