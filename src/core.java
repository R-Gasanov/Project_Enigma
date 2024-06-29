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
				+ "Your the middle of some woods."
				+ "You get up from the dried crisp leaves that layed below you.\n"
				+ "Wondering how you got here in the first place.\n"
				+ "You tried to think but you're met with the stabbing pain in your head.\n"
				+ "Only to realise besides the pain your mind is blank.\n"
				+ "With no memories as to why you're here.\n"
				+ "You dig around your pockets only to find a rusty looking compass.\n"
				+ "Or who you are.\n");
		
		System.out.println("Type in Continue\n");
		
		int count = 0;
		boolean checker = false;
		
		Scanner input = new Scanner(System.in);
		// Conditional statement going on below based on the story line of the user
		while (count != 1)
		{
			checker = Errorhandler(input);
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
			
			checker = Errorhandler(input);
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

		
	}
	public static boolean Errorhandler(Scanner input)
	{
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
	{
		while (space > 0)
		{
			System.out.println();
			space--;
		}
	}	
}
