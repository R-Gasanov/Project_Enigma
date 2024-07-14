import java.util.Scanner;

public class lookout_tower 
{
	public void lookout_tower()
	{
		Spaceadder(10);
		System.out.println("-------------Version 0.0.0.1--------------");
		System.out.println("------------------------------------------");
		System.out.println("------Enigma Games presents... KABIN------");
		System.out.println("------------------------------------------");
		System.out.println("\n");
		
		System.out.println("You make it the lookout tower, \n"
				+ "It was clearly abondoned, \n"
				+ "with vegtatation attempting to claim the pillars. \n"
				+ "There was a set of rusty set of ladders that led to the top. \n"
				+ "It looked stable enough for you to climb.\n"
				+ "Where do you choose to go? \n");
		
		// Below is the prerequisite for us to take in the input and do a check for the users input
		int count = 0;
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		
		
		while (count == 0)
		{
			System.out.println("Enter '1' to climb up the look out tower. \n"
					+ "Enter '2' to head back. \n"
					);
			count = SelErrHandler(input);
		}
		
		// Story continues if the value 1 is returned within the lookout_tower
		
		if (count == 1)
		{
			Spaceadder(2);
			System.out.println("You begin to climb,"
					+ "the ladder groaned at the pressure of your weight."
					+ "You could feel your heart beat and body tense the higher you went."
					+ "It was quite a way up but you knew you had little other options.");
			
			System.out.println("Type in Continue\n");
			while (checker == false)
			{
				checker = LocErrHandler(input);
			}
			if (checker == true)
			{
				checker = false;
				
				Spaceadder(2);
				System.out.println("You finally make it up inside the lookout tower. \n"
						+ "You notice three things, \n"
						+ "a chest to the left of you, a torn poster above it and a view of the forest. \n"
						+ "");
				
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
			System.out.println("'1' or '2' are your valid choices");
			//selecter = input.nextInt();
		}
		return 0;
		
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
}
