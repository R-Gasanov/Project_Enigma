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
				+ "You get up from the dried crisp leaves that layed below you.\n"
				+ "Wondering how you got here in the first place.\n"
				+ "You tried to think back but you're met with the stabbing pain in your head.\n"
				+ "Only to realise besides the pain, your mind is blank.\n"
				+ "With no memories as to why you're here.\n"
				+ "You try and dig around your pockets, only to find a rusty looking compass.\n"
				+ "Or who you are.\n");
		
		System.out.println("Type in Continue\n");
		
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
				System.out.println("With things looking dire.\n"
						+"You try to calm yourself down.\n"
						+"Thankfully the sharp pain in your head started to turn dull.\n"
						+"With that out of the way for now, you're able to look around.\n");
			}
		}
		while (count != 2)
		{
			System.out.println("Type in Continue\n");
			
			checker = LocErrHandler(input);
			if (checker == true)
			{
				checker = false;
				Spaceadder(2);
				System.out.println("To the north there was a lookout tower,\n"
						+"visible above the trees mounting to the northern hill.\n"
						+"\n"
						+"To the west, wheres there's little amount of trees,\n"
						+"is the outline of what appears to be a cabin.\n"
						+"\n"
						+"The last thing you notice is a path that leads south.\n"
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
		{
			System.out.println("Enter '1' for the Lookout Tower.\n"
					+ "Enter '2' for the Cabin.\n"
					+ "Enter '3' for the southern path.\n"
					);
			
			int intchecker = 4;
			while (intchecker == 4)
			{
				intchecker = SelErrHandler(input);
				//intchecker = locationselect(input);
			}
			locationselect(intchecker);
		}

		
	}
	public static boolean LocErrHandler(Scanner input)
	{ // Handlers string based inputs from the user
		String outcome;
		try
		{
			outcome = input.nextLine();
			//System.out.println(outcome);
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
		int selecter;
		try
		{ // Remember! nextLine is for String, nextInt is for Integer
			selecter = input.nextInt();
			switch(selecter)
			{
				case 1:
					return 1;
				case 2:
					return 2;
				case 3:
					return 3;
				default:
					System.out.println("Please provide a valid integer");
					System.out.println("'1' or '2' or '3' are your valid choices");
					return 4;
			}
			
		}
		catch (Exception E)
		{
			System.out.println("Please provide a valid integer");
			System.out.println("'1' or '2' or '3' are your valid choices");
		}
		
		
		return 4;
	}
	public static void locationselect(int input)
	{ // Meanwhile here is the selector of the three locations the user can go to
		
		// Here we are creating instances from other classes 
		if (input == 1)
		{
			System.out.println("You decide to head to the lookout tower.\n");
			lookout_tower location_go = new lookout_tower();
			location_go.lookout_tower();
		}
		else if (input == 2)
		{
			System.out.println("You decide to head to the cabin.\n");
			cabin location_go = new cabin();
			location_go.cabin();
		}
		else if (input == 3)
		{
			System.out.println("You decide to head to the rustic car.\n");
			rustic_car location_go = new rustic_car();
			location_go.rustic_car();
		}
	}
}
