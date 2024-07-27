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
					+ "It looked suprisingly cosy, \n"
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
				else if (location == 2)
				{
					notice_board();
				}
				else if(location == 3)
				{
					cabinet();
				}
				else if(location == 4)
				{
					bed();
				}
				else if(location == 5)
				{
					bedside_table();
				}
				else if(location == 6)
				{
					bathroom_door();
				}
				else if(location == 7)
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
	public static int bathroomdoor(Scanner input)
	{
		inventory inv = inventory.getInstance();
		
		try
		{
			String result = input.nextLine();
			if (result.equals("007"))
			{
				inv.setcarfuel(true);
				return 1;
			}
			else
			{
				return 2;
			}
		}
		catch (Exception e)
		{
			System.out.println("Please an integer and not any other character");
			System.out.println("'1' or '2' are your valid choices");
		}
		
		return 2;
		
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
	public static int CabinetLock(Scanner input)
	{
		inventory inv = inventory.getInstance();
		//boolean checker = false;
		try
		{
			String combination = input.nextLine();
			if (combination.toLowerCase().equals("bryce"))
			{
				System.out.println("You hear a beep as the lock opens up. \n"
						+ "You couldn't tell whether or not you were thrilled or scared at opening it. \n"
						+ "You spare no time opening the cabinet. \n"
						+ "In it, you find a gun and another post it note. \n"
						+ "'Arran, if your reading this, I'm sorry. \n"
						+ "Thank dear Irene that you were smart enough to figure it out, I knew you would! \n"
						+ "I'm keeping Bonnie safe, \n"
						+ "but he knows about us and he's trying to find anyone one of us before we escape out the park. \n"
						+ "I'm not good with a rifle but I remember you said you were a detective at some point. \n"
						+ "Please, I'm stuck with Bonnie here too somewhere in the park. \n"
						+ "Take the car, it does actually work. I've just told him it doesn't so it'll save us some time. \n"
						+ "Please, escape out of the park and contact the police! \n"
						+ "\n"
						+ "May Irene be with you... Fiona. \n"
						+ "... \n"
						+ "You grab the gun with you. It has two rounds left inside of it. \n");
				
				inv.setgun(true);
				return 3;
			}
			else if (combination.equals("0"))
			{
				return 0;
			}
			else
			{
				System.out.println("You hear a hard beep. \n"
						+ "You try and open the lock but its still bardged shut. \n"
						+ "Looks like you'll need to to try another combination. \n");
			}
		}	
		catch (Exception E)
		{
			System.out.println("Please an integer and not any other character");
			System.out.println("'1' or '2' are your valid choices");
		}
		return 1;
	}
	public static void desk()
	{
		//boolean checker = false;
		Spaceadder(2);
		System.out.println("You approach the desk that was to the left of you. \n"
				+ "It was accompanied with a little lantern with a candle that had died. \n"
				+ "There was one last match stick left beside so you don't hesitate to light it up. \n"
				+ "Besides that, there were a couple of other things alongside it. \n"
				+ "One being a post it note and another being a letter. \n"
				+ "Which do you choose to look at? \n");
		
		
		Scanner input = new Scanner(System.in);
		int result = 4;
		while (result != 3)
		{
			System.out.println("Enter '1' for the letter. \n"
					+ "Enter '2' for the post it note. \n"
					+ "Enter '3' to look elsewhere. \n");
			
			result = SelErrHandler(input);
			if (result == 1)
			{
				Spaceadder(2);
				System.out.println("You decide to look at the letter, \n"
						+ "\n"
						+ "Hey Arran,\n"
						+ "\n"
						+ "I’ll keep this short. You remember what I told you earlier back in the truck? \n"
						+ "\n"
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
						+ "\n"
						+ "Stay Safe, \n"
						+ "\n"
						+ "From Fiona - The best Conservationist in all of Britannia \n");
			}
			else if (result == 2)
			{
				Spaceadder(2);
				System.out.println("You decide to look at the post it note, the colour is red. \n"
						+ "\n"
						+ "'Psst Bonnie, \n"
						+ "I’ve heard Duncan hired a new replacement already. \n"
						+ "Pray to me they’re another girl. \n"
						+ "The quantity of guys and girls here isn’t equal enough here, sorry lads! \n"
						+ "Fiona' \n"
						+ "Behind the post it note was a number, '2'. \n");
			}
		}
		
	}
	public static void notice_board()
	{
		Spaceadder(2);
		System.out.println("You made your way to the notice board, \n"
				+ "It was to the left of the cabinet and right of the desk. \n"
				+ "You noticed some newspaper pieces stuck across the board and a post it note. \n"
				+ "Which do you choose look at?");
		
		Scanner input = new Scanner(System.in);
		int result = 4;
		while (result != 3)
		{
			System.out.println("Enter '1' for the newspaper pieces. \n"
					+ "Enter '2' for the post it note. "
					+ "Enter '3' to look elsewhere. \n");
			result = SelErrHandler(input);
			if (result == 1 )
			{
				System.out.println("You decide to look at the multiple torn pieces of newspaper. \n"
						+ "\n"
						+ "Most of them were unreadable referencing weather pollution and new species descoveries. \n"
						+ "Although the one thing that caught your eye was the supposed dissapearences. \n"
						+ "It read. \n" // Felix Anderson is NOT the main character
						+ "'Multiple dissaperances have been occuring in the national park. \n"
						+ "Authorities are investigating whether or not this is linked to the dissaperance to one of the employees. \n"
						+ "F----- -------- the local park ranger had gone missing six years ago. \n"
						+ "Neither of the three missing individuals have been found, despite searches around the park. \n"
						+ "The most popular theory is that they all drowned in one of the many lochs found at the park. \n"
						+ "Although no evidence suggests this happened.' \n"
						+ "\n"
						+ "Thats about all the torn paper had, you wonder why the name had been marked on over. \n"
						+ "Beside it, another small paper pinned to the board had a number written. \n"
						+ "'3+1' ARE NOW MISSING. \n"
						+ "You feel a chill run up your spine. \n");
			}
			else if (result == 2)
			{
				System.out.println("You decide to look at the post it note, the colour is green. \n"
						+ "\n"
						+ "'Fiona, sorry for using one of these. \n"
						+ "But I don’t have any means of contacting you right away. "
						+ "Andrew, the shipment guy has brought you the thing you were waiting for. \n"
						+ "Its the wired nest box camera you wanted. Its in the cabinet.\n"
						+ "Bryce.' \n"
						+ "Behind the post it note was a number, '5'. \n");
			}
		}
		
		
	}
	public static void cabinet()
	{
		Spaceadder(2);
		System.out.println("You make your way to the cabinet. \n"
				+ "It was at the corner left of the room, looming over everything. \n"
				+ "You notice a post it not strapped to one of its door. \n"
				+ "A five letter lock prevented you from opening the cabinet. \n"
				+ "The only other thing you find is a package filled with post it notes. \n");
		
		System.out.println("Enter in 'Continue");
		
		Scanner input = new Scanner(System.in);
		
		boolean checker = false;
		while (checker == false)
		{
			checker = LocErrHandler(input);
			
		}
		checker = false;
		Spaceadder(2);
		System.out.println("You kneel down to the package. \n"
				+ "You didn't really think nothing of it, \n"
				+ "it was just where the package of post it notes were bought with but, \n"
				+ "It looked like someone wrote something on it. \n"
				+ "'Don't use unless you have my permission! \n"
				+ "These are my well renowned post it notes. \n"
				+ "And yes Arran even though it says pink and green on the package...\n"
				+ "The Colours look more like Emerald and Calamime!' \n"
				+ "On the back it does say the colours, \n"
				+ "Yet where it would say green and pink are marked out and replaced with Camamile and Emerald. \n"
				+ "... \n"
				+ "What a strange person. \n");
		
		System.out.println("Enter in 'Continue");
		
		while (checker == false)
		{
			checker = LocErrHandler(input);
			
		}
		checker = false;
		int result = 4;
		while (result != 3)
		{
			Spaceadder(2);
			System.out.println("Enter '1' to try the lock of the cabinet. \n"
					+ "Enter '2' for the post it note. \n"
					+ "Enter '3' to look elsewhere. \n");
			result = SelErrHandler(input);
			if (result == 1)
			{
				int counter = 1;
				while (counter == 1)
				{
					System.out.println("The lock was unique in a sense. \n"
							+ "It was five letters long, \n"
							+ "and had arrows up and down each letter to change it alphabetically. \n"
							+ "You decide to give it an attempt... \n"
							+ "Enter the correct five letter value, an example 'ABCDE'... \n"
							+ "Or enter '0' to stop trying. \n");
					counter = CabinetLock(input);
				}
			}
			else if (result == 2)
			{
				System.out.println("You decide to look at the post it note, the colour is pink."
						+ "\n"
						+ "'Hey guys, in regards to the disappearances in the park stay careful okay? \n"
						+ "We’ve already had one of us disappear. \n"
						+ "Its the one year anniversary of Caitlin. \n"
						+ "The previous conservationist before Fiona for those who don’t know. \n"
						+ "Please stay safe. Arran.' \n"
						+ "Behind the post it note was a number, '4'. \n");
			}
			
		}
		
		
		
	}
	public static void bed()
	{
		Spaceadder(2);
		System.out.println("You decide to go and look at the bed. \n"
				+ "It was to the far right of the room where there was a window covered with curtains. \n"
				+ "There wasn't much to it, it had thick covered for warmth with a foresty design. \n"
				+ "On top of it was a post it note. \n"
				+ "What do you choose to look at? \n");
		
		Scanner input = new Scanner(System.in);
		int result = 4;
		while (result != 3)
			{
				System.out.println("Enter '1' look around the bed. \n"
						+ "Enter '2' for the post it note. \n"
						+ "Enter '3' to look elsewhere. \n");
				result = SelErrHandler(input);
				if (result == 1)
				{
					Spaceadder(2);
					System.out.println("You look around the bed and pull the covers. \n"
							+ "But you find nothing of value or use. \n");
				}
				else if (result == 2)
				{
					Spaceadder(2);
					System.out.println("You decide to look at the post it note, the colour is blue. \n"
							+ "\n"
							+ "Archie hey! \n"
							+ "Welcome to the team. \n"
							+ "We work around this specific site in the park. \n"
							+ "I’m sure you’ve gotten to known Bryce, his thriller on the arts. \n"
							+ "Quite the painter am I right? \n"
							+ "The Kabin here is our head quarters, \n"
							+ "we do our gatherings here. \n"
							+ "Hope you feel welcome :) \n"
							+ "Bonnie \n"
							+ "Behind the post it note was a number, '1'. \n");
				}
			}
		
		
	}
	public static void bedside_table()
	{
		Spaceadder(2);
		System.out.println("You decide to look at the bedside table,"
				+ "which was at the rightside of the bed. \n"
				+ "You find the desk lamb lighting up the majority of Cabin. \n"
				+ "Other than that you find a post it note. \n"
				+ "What do you choose to look that. \n");
		
		Scanner input = new Scanner(System.in);
		int result = 4;
		while (result != 3)
		{
			System.out.println("Enter '1' look at the bedside cabinet drawers. \n"
					+ "Enter '2' for the post it note. \n"
					+ "Enter '3' to look elsewhere. \n");
			result = SelErrHandler(input);
			if (result == 1)
			{
				System.out.println("You open the bed drawers. \n"
						+ "But you find nothing of value. \n");
			}
			else if (result == 2)
			{
				System.out.println("You decide to look at the post it note, the colour is yellow. \n"
						+ " \n"
						+ "Hey guys! \n"
						+ "I’ve already told Fiona and Arran, \n"
						+ "but she let me to use one of her post it notes as a good bye message. \n"
						+ "Thank you so much for having me! \n"
						+ "It was a pleasure working with you all. \n"
						+ "Sorry I couldn’t tell you all in person.\n"
						+ "Love James \n."
						+ "Behind the post it note was a number, '3'.");
			}
		}
	}
	public static void bathroom_door()
	{
		Scanner input = new Scanner(System.in);
		Spaceadder(2);
		System.out.println("You decide to go to the bath room. \n"
				+ "It was stationed directly on the left of the room. \n"
				+ "You attempt to open the door but of course theres another lock. \n"
				+ "You then notice the label to the left side of the door stuck to the wall. \n"
				+ "'Hey hey! The code is the current active number of people in our team. \n"
				+ "Its a smart way of people not leaching our bathroom. \n"
				+ "Love Bonnie.' \n");
		
		 System.out.println("Enter in 'Continue'");
		 
		 boolean checker = false;
		 if (checker == false)
		 {
			 checker = LocErrHandler(input);
		 }
		 Spaceadder(2);
		 System.out.println("You look at the lock more closely. \n"
		 			+ "It appeared to a be a three digit num pad, \n"
		 			+ "with numbers going from zero to nine. \n "
		 			+ "What do you choose to do? \n");
		 int result = 4;
		 while (result != 3)
			 {
			 	
			 	Spaceadder(2);
			 	System.out.println("Enter '1' look back at the label on the wall. \n"
						+ "Enter '2' to try and unlock the door. \n"
						+ "Enter '3' to look elsewhere. \n");
			 	result = SelErrHandler(input);
			 	if (result == 1)
			 	{
			 		Spaceadder(2);
			 		System.out.println("'Hey hey! \n"
			 				+ "The code is the current active number of people in our team. \n"
			 				+ "Its a smart way of people not leaching our bathroom. \n"
			 				+ "Love Bonnie.' \n");
			 	}
			 	else if (result == 2)
			 	{
			 		int answer = 0;
			 		Spaceadder(2);
			 		System.out.println("You attempt your luck at unlocking the door... \n"
			 				+ "Enter the correct five number value, an example '123'... \n");
			 		answer = bathroomdoor(input);
			 		if (answer == 1)
			 		{
			 			Spaceadder(2);
			 			System.out.println("You manage to get inside the bathroom door. \n"
			 					+ "Inside, you find a normal bathroom but to the right is a fuel canister. \n"
			 					+ "You attempt to pick it up, and you fill it still being full. \n"
			 					+ "Part of you thinks this might be useful. \n");
			 		}
			 		else if (answer == 2)
			 		{
			 			System.out.println("You try to apply the lock but it doesn't work... \n"
			 					+ "You look elsewhere. \n");
			 		}
			 	}
			 }
		 
		 
	}
}
