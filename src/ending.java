import java.util.Scanner;

public class ending 
{
	public void EndGame()
	{
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		inventory inv = inventory.getInstance();
		
		Spaceadder(2);
		System.out.println("You wizz down the road, \n"
				+ "it wasn't the smoothest ride but you had to make due. \n"
				+ "You weren't really sure either where you were going but you knew you had to. \n"
				+ "It wasn't until you noticed beggining to look better that you were heading out. \n");
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("With potential signs of life imminent, \n"
				+ "you breath out a sign of relief. \n"
				+ "Something isn't right about this place. You definetly knew it. \n"
				+ "Fiona was trying to tell me something... \n");
		
		// The beginning of the divergence of the endings will start to occur now.
		
		// Solely based on whether or not you've got the gun
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		// Here it is, finally getting towards the end huh
		
		if (inv.getgun() == true)
		{
			goodending();
		}
		else
		{
			badending();
		}
		
	}
	public static void badending()
	{
		Spaceadder(2);
	}
	public static void goodending()
	{
		Scanner input = new Scanner(System.in);
		boolean checker = false;
		
		Spaceadder(2);
		System.out.println("The code to the cabinet was Bryce... \n"
				+ "Why was that? \n"
				+ "It led you to the gun, \n"
				+ "Was Bryce someone that could help? \n");
		
		System.out.println("Type in 'Continue' \n");
		
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("No... your mind went back to the easel in the garage. \n"
				+ "The dissapearances, rumours of drowning. \n"
				+ "The painting of the reflection from the loch. \n"
				+ "Of people whailing trying to free themselves... \n"
				+ "It all felt connected, 'his thriller on the arts'. \n"
				+ "That's what Bonnie wrote about him. \n"
				+ "You felt shivers run down your spine. \n"
				+ "Whoever she was, she was injured and stuck with Fiona somewhere here. \n"
				+ "So whoever I am, if I am this 'Arran' they mention I need to get them out of here. \n"
				+ "Unless... what if... \n"
				+ "Your heart starts pounding. \n"
				+ "Am I Bryce? \n"
				+ "Before you let that thought truly sink in you see a silhouette in the street and swerve \n");
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("You lose control and its not long before you go off road and crash into a tree. \n"
				+ "The whiplash was brutal, \n"
				+ "after a couple of seconds you begin to feel a dull ache in your abdomin. \n"
				+ "You didn't let that stop you though, \n"
				+ "you grab the gun from the passenger street and come out. \n"
				+ "Whatever was on the street was a person... \n"
				+ "You get out of the car and head back to the road. \n"
				+ "Thats until you see him. \n");
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("'Arran! Thank Irene you're here. Are you alright?' \n"
				+ "I stared at him warrily, who was he? \n"
				+ "He noticed my hesitation and distance. \n"
				+ "'Its me Bryce, how many fingers am I holding?' \n"
				+ "'Thr-three.' Was he to be trusted? I wasn't for certain it was him. \n"
				+ "There was no evidence after all, nothing to indicate anything back there was even real. \n"
				+ "'Hey, why don't I take you back to the Kabin and let you rest for a little while.' \n"
				+ "'I'm trying to find Bonnie and Fiona, something bad is out there.' \n"
				+ "Thats when you froze, something was off. \n"
				+ "As he began to walk closer you pulled up your gun. \n"
				+ "'Woah woah woah Arran calm done haha, I'm not here to hurt you.' \n"
				+ "'You can trust me. You know that, right?' \n");
		
		int fincheck = -1;
		
		while (fincheck == -1)
		{
			Spaceadder(2);
			System.out.println("What do you choose to do? \n"
					+ "Enter '1' to shoot him. \n"
					+ "Enter '2' to put the gun down. \n");
			fincheck = SelErrHandler(input);
			
			if (fincheck == 1)
			{
				
			}
			else if (fincheck == 2)
			{
				
			}
		}
		
		
	}
	public static void Spaceadder(int space)
	{
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
		catch (Exception e)
		{
			System.out.println("Please enter a valid response in letters...");
			System.out.println("'Enter' OR 'Exit' for their following actions");
		}
		return false;
	}
	public static int SelErrHandler(Scanner input)
	{
		String selecter;
		try
		{
			selecter = input.nextLine();
			if (selecter.equals("1"))
			{
				return 1;
			}
			else if (selecter.equals("2"))
			{
				return 2;
			}
		}
		catch (Exception e)
		{
			System.out.println("Please enter a valid response in letters...");
			System.out.println("'Enter' OR 'Exit' for their following actions");
		}
		return -1;
	}

}
