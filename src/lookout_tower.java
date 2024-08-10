import java.util.Scanner;

public class lookout_tower 
{
	public void lookout_tower()
	{
		Spaceadder(10);
		System.out.println("-------------Version 0.0.3.0--------------");
		System.out.println("------------------------------------------");
		System.out.println("------Enigma Games presents... KABIN------");
		System.out.println("------------------------------------------");
		System.out.println("\n");
		
		System.out.println("You make it the lookout tower, \n"
				+ "It was clearly abondoned, \n"
				+ "with vegetation sprouting out from the foundations. \n"
				+ "There was a rusty ladder that led to the top. \n"
				+ "It looked stable enough for you to climb.\n"
				+ "Where do you choose to go? \n");
		
		// Below is the prerequisite for us to take in the input and do a check for the users input
		
		int count = 0, lock = 0;
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
			System.out.println("You begin to climb, \n"
					+ "the ladder groaned at the pressure of your weight. \n"
					+ "You could feel your heart beat and body tense the higher you went up. \n"
					+ "It was quite a way, but you knew you had little other options. \n");
			
			System.out.println("Type in 'Continue' or 'C'. \n");
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
						+ "What do you choose to look at? \n");
				
			}
			while (checker == false)
			{
				System.out.println("Enter '1' to look at the poster. \n"
						+ "Enter '2' to look at the locked chest. \n"
						+ "Enter '3' to look at the view. \n"
						+ "Enter '4' to head back. \n"
						);
				count = LTErrHandler(input);
				
				// System.out.println(count + "Is the count");
				if (count == 1)
				{
					Spaceadder(2);
					System.out.println("You decide to look at the poster, \n"
							+ "It was ripped quite badly but you were able to make out its content. \n"
							+ "'Welcome to C--------- -----nal Park lookout tower! \n"
							+ "Here you get to sight see and look at the wonderious views, \n"
							+ "in which the highlands have to offer. \n"
							+ "From here we can see three lochs amongst the forest we're in. \n"
							+ "The park has seen a--und two-hundred and eighty bird sp--ies too! \n"
							+ "We eve- have --- of the hig---t mountain peak in all of the --!' \n"
							+ "Thats about as much as you could read from the poster itself. \n");
				}
				else if (count == 2)
				{ // 32801 is the correct combination -> if you're cheating, you're a loser...
					if (lock == 0) // I've only wrote the answer here once behind the scenes
					{ // So if you actually know java and can read this hunk of code to find the answers
						Spaceadder(2); // Then fine, if not ha ha ha... HA!
						System.out.println("You decide to look at the locked chest. \n"
								+ "You of course try to open it to no avail. \n"
								+ "From further inspection though, there appears to be a number pad. \n"
								+ "It had five rows with numbers ranging from zero to nine. \n"
								+ "What do you choose to do? \n");
						
						while (true)
						{
							System.out.println("Enter '1' to attempt to unlock the chest. \n"
									+ "Enter '2' to look elsewhere. \n");
							count = SelErrHandler(input);
							if (count == 1)
							{
								Spaceadder(2);
								System.out.println("You pick up the lock pad and try your attempt... \n"
										+ "Enter the correct five number value, an example '12345'... \n");
								int result;
								result = ChestLockCheck(input);
								if (result == 5)
								{
									lock = 1;
								}
								else if (result == 4)
								{
									Spaceadder(2);
									System.out.println("When you put in that combination you hear a subtle click. \n"
											+ "But unfortunately it still stays locked... \n"
											+ "You sigh in irritation, hoping the next combination you put in solves it. \n");
									
								}
							}
							else if (count == 2)
							{
								break;
							}
						}
					}
					else if (lock == 1)
					{
						System.out.println("There's nothing left to find inside the chest. \n");
					}
				}
				else if (count == 3)
				{
					Spaceadder(2);
					System.out.println("You decide to look at the view from the lookout tower. \n"
							+ "Here you can see a large expanse of where you are, \n"
							+ "you take in the landscape, hoping for a way out. \n"
							+ "Although, all you can see is the continuation of wilderness endlessly. \n"
							+ "With trees and hills stretching out for miles. \n"
							+ "The only notable thing you see is one large mountain peak from the view. \n");
				}
				else if (count == 4)
				{
					checker = true;
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
	public static int LTErrHandler(Scanner input)
	{
		String selecter; // here we are specifying the input to a string variable.
		selecter = input.nextLine();
		try
		{
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
		}
		catch (Exception E)
		{
			System.out.println("Please an integer and not any other character");
			System.out.println("'1' or '2' or '3' are your valid choices");
		}
		return 4;
	}
	public static int ChestLockCheck(Scanner input)
	{
		
		inventory inv =  inventory.getInstance();
		//32801 is the answer here, and we want to make sure that we get this result
		try
		{
			String combination = input.nextLine();
			if (combination.equals("32801"))
			{
				System.out.println("After trying that sequence you hear a click in the lock, \n"
						+ "You feel this little ball of joy jump in you as you open the chest. \n"
						+ "You find a scrumbled up note, \n"
						+ "'Arran, heres the key to the Kabin incase you get stuck here overnight. \n"
						+ "Fiona.' \n"
						+ "Below the note, you find a key. \n");
				
				inv.setkabinkey(true);
				inv.setnote(true);
				
				
				System.out.println("Type in 'Continue' or 'C'. \n");
				
				// Ensuring we are breaking everything into segments for the user 
				
				Boolean ChestLockchecker = false;
				
				while (ChestLockchecker == false)
				{
					ChestLockchecker = LocErrHandler(input);
				}
				return 5;
			}
		}
		catch (Exception e)
		{
			System.out.println("Please an integer and not any other character");
			System.out.println("'1' or '2' are your valid choices");
		}
		return 4;
	}
}
