import java.util.Scanner;


public class rustic_truck
{
	/*
	 *  Going to set some global variables to be used between the generator methods...	
	 *  These are apparently called class variables.
	 */
	static int gen_A_volt = 0,gen_B_volt = 45, gen_C_volt = 2, gen_switch = 0, gen_knob_A = 0, gen_knob_B = 0, gen_knob_C;
	
	public void rustic_truck()
	{
		Spaceadder(10);
		System.out.println("-------------Version 0.0.3.0--------------");
		System.out.println("------------------------------------------");
		System.out.println("------Enigma Games presents... KABIN------");
		System.out.println("------------------------------------------");
		System.out.println("\n");
		
		System.out.println("You make your way through the path. \n"
				+ "It doesn't take you long to find something else along it. \n"
				+ "You notice a truck, \n"
				+ "its state looked questionable. \n"
				+ "As you approach the truck you notice it more clearly. \n"
				+ "It appeared to have writing on the side but just barely readable... \n"
				+ "The only part you were able to make out was 'Park Ranger's Mobile'. \n"
				+ "You notice that the truck wasn't the only thing here. \n");
		
		Scanner input = new Scanner(System.in);
		
		boolean checker = false;
		
		System.out.println("Type in 'Continue' or 'C'. \n");
		
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("You notice just passed the truck was what appeared to be a garage, \n"
				+ "As though it had ascended from the ground up, \n"
				+ "making a small mound of green around the door. \n"
				+ "Beside it looked like a podium with what appeared to be switch. \n"
				+ "You take a further good extra look around the area. \n"
				+ "Managing to spot other things, with three generators scattered around. \n");
		
		System.out.println("Type in 'Continue' or 'C'. \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		System.out.println("You have this odd feeling that this truck might be your only way of escape. \n");
		
		// Here we will be using the cabin location method, just rewriting it here for practice sake
		while (checker == false)
		{
			int location = 0; 
			Spaceadder(2);
			System.out.println("Where do you choose to look at? \n"
					+ "Enter '1' to look at the truck. \n"
					+ "Enter '2' to look at the generator in front of the truck. \n"
					+ "Enter '3' to look at the hidden garage. \n"
					+ "Enter '4' to look at the generator by the garage. \n"
					+ "Enter '5' to look at the control podium. \n"
					+ "Enter '6' to look at the generator on the opposite side of the path from the car. \n"
					+ "Enter '7' to head back. \n");
			location = LocTruckHandler(input);
			if (location == 1)
			{
				truck();
			}
			else if (location == 2)
			{
				generator_C();
			}
			else if (location == 3)
			{
				garage();
			}
			else if (location == 4)
			{
				generator_A();
			}
			else if (location == 5)
			{
				generator_switch();
			}
			else if (location == 6)
			{
				generator_B();
			}
			else if (location == 7)
			{
				checker = true;
			}
			else
			{
				Spaceadder(2);
				System.out.println("Please enter a singular valid interger from '1' to '7'. \n");
			}
			
		}
	}
	public static int LocTruckHandler(Scanner input)
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
		catch (Exception e)
		{
			System.out.println("Please enter a valid response in letters...");
			System.out.println("'Enter' OR 'Exit' for their following actions");
		}
		return 0;
	}
	public static void Spaceadder(int space)
	{
		while (space > 0)
		{
			System.out.println();
			space--;
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
	public static void truck()
	{
		inventory inv = inventory.getInstance();
		boolean checker = false, dobchecker = false;
		Scanner input = new Scanner(System.in);
		int result;
		Spaceadder(2);
		System.out.println("You approach the truck, \n"
				+ "It held its frame but segments were rusted, \n"
				+ "almost like as though it had been abandoned. \n"
				+ "You walk around it in an attempt to look inside, \n"
				+ "Theres nothing much but a couple of boxes, \n"
				+ "filled with various things like ropes, blankets, \n"
				+ "a first aid kit, a flashlight and a book. \n"
				+ "On the cover, it said 'Generator manual'. \n");
		
		System.out.println("Type in 'Continue' or 'C'. \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		while (checker == false)
		{
			
			Spaceadder(2);
			System.out.println("What do you choose to do? \n"
					+ "Enter '1' to go in the car. \n"
					+ "Enter '2' to head back. \n");
			result = SelErrHandler(input);
			
			if (result == 1)
			{
				if (inv.getcarkey() == true)
				{
					Spaceadder(2);
					System.out.println("You use the car keys you've found in the 'Kabin'. \n"
							+ "Thankfully it clicks and lets you in. \n"
							+ "Once settled in the car, you take a good deep long breath. \n"
							+ "You could feel hope bubbling in you with the possibility of escape palpable. \n");
					
					System.out.println("Type in 'Continue' or 'C'. \n");
					while (dobchecker == false)
					{
						dobchecker = LocErrHandler(input);
					}
					dobchecker = false;
					
					while (dobchecker == false)
					{
						Spaceadder(2);
						System.out.println("What do you choose to do? \n"
								+ "Enter '1' to start the car \n"
								+ "Enter '2' to read the generator's manual. \n"
								+ "Enter '3' to head back. \n");
						result = TruckErrHandler(input);
						if (result == 1)
						{
							if (inv.getcarfuel() == true)
							{
								Spaceadder(2);
								System.out.println("Before you start the car again, you remember the fuel you have. \n"
										+ "You waste no extra time and add the fuel within the truck. \n"
										+ "It gulps it up, finally satiating its thirst. \n"
										+ "Once done, you make it back in and attempt to start the truck. \n"
										+ "It kickstarts, the engine roaring as it vibrates. \n"
										+ "You begin to move, driving through the path... \n");
								boolean fincheck = false;
								
								System.out.println("Type in 'Continue' or 'C'. \n");
								while (fincheck == false)
								{
									fincheck = LocErrHandler(input);
								}
								fincheck = false;
								
								ending finale = new ending();
								finale.EndGame(); // Finally making the final part of the game.
							}
							else if (inv.getcarfuel() == false)
							{
								System.out.println("You turn the key on the truck. \n"
										+ "But the engine doesn't start, \n"
										+ "you then notice that the truck is missing fuel. \n"
										+ "With its tank empy, \n"
										+ "you'll have to find another source of fuel. \n");
							}
						}
						else if (result == 2)
						{
							System.out.println("You head to the back of the car to reach out for the manual. \n"
									+ "It was covered in a layer of dust which you blew away. \n"
									+ "You open its contents. \n");
							
							System.out.println("Type in 'Continue' or 'C'. \n");
							boolean trichecker = false;
							while (trichecker == false)
							{
								trichecker = LocErrHandler(input);
							}
							trichecker = false;
							
							Spaceadder(2);
							System.out.println("--1894 - GENERATOR CATALYST GUIDE V2-- \n"
									+ "\n"
									+ "The location currently houses three generators. \n"
									+ "\n"
									+ "These generators use to power a number of objects within the vicinity. \n"
									+ "\n"
									+ "Although the majority of said objects have been scrapped by the government. \n"
									+ "\n"
									+ "These generators are also in relatively bad shape, having different excitor rates. \n"
									+ "\n"
									+ "As an external mechanic, I don't know how these were operated but I've pinpointed some things. \n"
									+ "\n"
									+ "The only thing operable for the generators is the garage door used to store supplies. \n"
									+ "\n"
									+ "It requires around 100 Volts to operate, although only specifically this amount. \n"
									+ "\n"
									+ "Otherwise the garage door won't operate under any other condition. \n"
									+ "\n"
									+ "We have the following three generators, Generator A, B, and C. \n"
									+ "\n"
									+ "The excitor is the amplifyer used to generate volts within the generator. \n"
									+ "\n"
									+ "Generator A excitor is tuned at 5. \n"
									+ "Turn the knob to increase the Volt via the iteration of the excitor \n"
									+ "\n"
									+ "Generator B excitor is tuned at 9. \n"
									+ "Turn the knob to increase the Volt via the iteration of the excitor \n"
									+ "\n"
									+ "Generator C excitor is tuned at 2. \n"
									+ "Turn the knob to increase the Volt via the iteration of the excitor \n"
									+ "\n"
									+ "Anyhow I've set the generator to a default, \n"
									+ "since I've found a combination that works without the hassle of finding one yourself. \n"
									+ "It equals to about 100 Volts, I've linked that specifc combination to a set of green indicators. \n"
									+ "They're below the knife switch for you to double check. \n"
									+ "Or if you're fancy you can use your own combination and ignore the lights. \n"
									+ "They still will light up in an event where you reach 100 Volts, so don't forget. \n");
							
							
							System.out.println("Type in 'Continue' or 'C'. \n");
							while (trichecker == false)
							{
								trichecker = LocErrHandler(input);
							}
							trichecker = false;
						}
						else if (result == 3)
						{
							dobchecker = true;
						}
						else if (result == 0)
						{
							System.out.println("Please an integer and not any other character. \n"
									+ "'1' or '2' or '3' are your valid choices. \n");
						}

					}
	
				}
				else if (inv.getcarkey() == false)
				{
					Spaceadder(2);
					System.out.println("You try and open the truck door, \n"
							+ "but it doesn't budge. \n"
							+ "Looks like you'll find a pair of keys to open it. \n");
				}
			}
			else if (result == 2)
			{
				checker = true;
			}
		}
		
		
	}
	public static void generator_C()
	{
		int gen_exciter = 2;
		//int gen_knob = 1;
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		Spaceadder(2);
		System.out.println("You approach the generator in front of the car. \n"
				+ "It looked fairly ancient and run down, \n"
				+ "with the labelling of it clearly ripped off. \n"
				+ "You do spot a control panel among it, \n"
				+ "although the panel sadly is cracked, not showcasing anything. \n"
				+ "The only other noteworthy thing is a knob you could turn, it was currently left at '"+ gen_knob_C + "'. \n");
		
		System.out.println("Type in 'Continue' or 'C'. \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		while (checker == false)
		{
			int result, count;
			Spaceadder(2);
			System.out.println("What do you choose to do? \n"
					+ "Enter '1' to change the knob. \n"
					+ "Enter '2' to head back. \n");
			result = SelErrHandler(input);
			if (result == 1)
			{
				count = 1;
				while (count == 1)
				{
					Spaceadder(2);
					System.out.println("The current knob is at " + gen_knob_C + ". \n"
							+ "What number do you turn the knob to? \n"
							+ "Enter a value ranging from '0' to '9'. \n");
					
					gen_knob_C = knob_dialler(input);
					if (gen_knob_C == -1)
					{
						System.out.println("You provided an incorrect value, \n"
								+ "Please provide a correct value ranging from '0' to '9'. \n");
					}
					else
					{
						Spaceadder(2);
						System.out.println("You've turned the knob to " + gen_knob_C + ". \n");
						gen_C_volt = gen_exciter*gen_knob_C;
						//System.out.println(gen_C_volt);
						count = 0;
					}
				}
			}
			else if (result == 2)
			{
				checker = true;
			}
		}
	}
	public static void garage()
	{
		inventory inv = inventory.getInstance();
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		if (gen_switch == 0)
		{
			Spaceadder(2);
			System.out.println("You approach the garage, \n"
					+ "it was locked with the garage door preventing you from getting in. \n"
					+ "There wasn't much around it, you'll have to open it to find out more. \n");
		}
		else if (gen_switch == 1)
		{
			Spaceadder(2);
			System.out.println("When approaching the garage you notice the scale of it was smaller than expected. \n"
					+ "You found tons of different equipment here and there and posters, \n"
					+ "You even find a easel at the center of it showcasing an art piece. \n");
					
			System.out.println("Type in 'Continue' or 'C'. \n");
			while (checker == false)
			{
				checker = LocErrHandler(input);
			}
			checker = false;
					
			Spaceadder(2);
			System.out.println("You approach it, taking a deep good look at it. \n"
					+ "It wasn't something of the faint hearted. \n"
					+ "The top half of the art was the forest you recognised outside of here. \n"
					+ "Likely off the local environment. \n"
					+ "It was drawn beautifully showcasing the wild life and lush trees that surrounded a loch. \n"
					+ "Although the said loch that made the lower half of the image should've mirrored the forest. \n"
					+ "Instead... \n"
					+ "Displayed dark blotches of red, with arms trying to reach out of the loch. \n"
					+ "Shadowy figures whailed from its depths, trapped with the view of the forest from above.\n"
					+ "Whatever it was, it made your heart sink. \n"
					+ "You looked away with no hesitation. \n");
			
			System.out.println("Type in 'Continue' or 'C'. \n");
			while (checker == false)
			{
				checker = LocErrHandler(input);
			}
			checker = false;
					
			Spaceadder(2);
			System.out.println("The remaining notable thing was a fuel canister. \n"
					+ "Upon picking it up you noticed it was full. \n"
					+ "You take it with you. \n");	
			
			inv.setcarfuel(true);
			
			System.out.println("Type in 'Continue' or 'C'. \n");
			while (checker == false)
			{
				checker = LocErrHandler(input);
			}
			checker = false;	
		
		}
		
	}
	public static void generator_A()
	{ // Yes i am going to be a lil lazy and copy the code for each segment instead of rewriting it...
		// Customisation comes later!
		int gen_exciter = 5;
		//int gen_knob = 0;
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		Spaceadder(2);
		System.out.println("You approach the generator beside the hidden garage. \n"
				+ "It looked fairly ancient and run down, \n"
				+ "with the labelling of it clearly ripped off. \n"
				+ "You do spot a control panel among it, \n"
				+ "although the panel sadly is cracked not showcasing anything. \n"
				+ "The only other noteworthy thing is a knob you could turn, it was currently left at '"+ gen_knob_A + "'. \n");
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		while (checker == false)
		{
			int result, count;
			Spaceadder(2);
			System.out.println("What do you choose to do? \n"
					+ "Enter '1' to change the knob. \n"
					+ "Enter '2' to head back. \n");
			result = SelErrHandler(input);
			if (result == 1)
			{
				count = 1;
				while (count == 1)
				{
					Spaceadder(2);
					System.out.println("The current knob is at " + gen_knob_A + ". \n"
							+ "What number do you turn the knob to? \n"
							+ "Enter a value ranging from '0' to '9'. \n");
					
					gen_knob_A = knob_dialler(input);
					if (gen_knob_A == -1)
					{
						System.out.println("You provided an incorrect value, \n"
								+ "Please provide a correct value ranging from '0' to '9'. \n");
					}
					else
					{
						Spaceadder(2);
						System.out.println("You've turned the knob to " + gen_knob_A + ". \n");
						gen_A_volt = gen_exciter*gen_knob_A;
						/* Below that I've commented out was an error handler,
						 *  used to help determine whether or not my mathematical
						 *  calculation genuinely did work and convert to the game
						 */
						
						//System.out.println(gen_A_volt);
						count = 0;
					}
				}
			}
			else if (result == 2)
			{
				checker = true;
			}
		}
		
	}
	public static void generator_switch()
	{
		
		int cor_gen_count = 0, result;
		
		// The amount of volts the generators produce collectively.
		int total_volt = gen_A_volt + gen_B_volt + gen_C_volt;
		if (gen_A_volt == 35)
		{
			cor_gen_count = cor_gen_count + 1;
		}
		if (gen_B_volt == 63)
		{
			cor_gen_count = cor_gen_count + 1;
		}
		if (gen_C_volt == 2)
		{
			cor_gen_count = cor_gen_count + 1;
		}
		
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		Spaceadder(2);
		System.out.println("You approach the podium. \n"
				+ "You get a better closer look at it. \n"
				+ "On it was a massive knife switch, \n"
				+ "meanwhile below was three green indicators that were off. \n"
				+ "There wasn't really much else, "
				+ "it looked like the only thing you could interact with was the said switch. \n");
		
		System.out.println("Type in 'Continue' or 'C'. \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
	
		while (checker == false)
		{
			Spaceadder(2);
			System.out.println("What do you choose to do? \n"
					+ "Enter '1' to flip the knife switch. \n"
					+ "Enter '2' to head back. \n");
			result = SelErrHandler(input);
			if (result == 1)
			{
				Spaceadder(2);
				System.out.println("You approach the knife switch, \n"
						+ "You feel this odd sense of excitement like something big is going to happen. \n"
						+ "You take a deep breath, and push it up with all your force. \n"
						+ "Suddenly you hear the generators kickstart. \n"
						+ "With the sound of power rushing to the switch... \n");
				if (total_volt == 100)
				{
					Spaceadder(2);
					System.out.println("You hear the nearby garage make an odd sound. \n"
							+ "As you look you notice it begin to drag itself up. \n"
							+ "You smile with the confidence that you were able to make it open. \n"
							+ "Plus you notice all of the green lights had turned on too. \n");
					gen_switch = 1;
				}
				else
				{
					Spaceadder(2);
					System.out.println("You hear the sputter of power but it starts to die down. \n"
							+ "With the generators turning back off. \n"
							+ "You do notice that "+ cor_gen_count + " of the green lights are on. \n");
				}
			}
			else if (result == 2)
			{
				checker = true;
			}
			else
			{
				System.out.println("Please provide in the correct integer between '1' or '2' \n");
			}
			
		}
		
	}
	public static int SelErrHandler(Scanner input)
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
			else
			{
				System.out.println("Please provide a correct value either '1' or '2'. \n");
			}
		}
		catch (Exception E)
		{
			System.out.println("Please an integer and not any other character. \n");
			System.out.println("'1' or '2' or '3' are your valid choices. \n");
		}
		return 0;
	}
	public static void generator_B()
	{
		int gen_exciter = 9;
		//int gen_knob = 5;
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		Spaceadder(2);
		System.out.println("You approach the generator across the path from the car. \n"
				+ "It looked fairly ancient and run down, \n"
				+ "with the labelling of it clearly ripped off. \n"
				+ "You do spot a control panel among it, \n"
				+ "the panel was in relatively good condition. \n"
				+ "The only other noteworthy thing is a knob you could turn, it was currently left at '"+ gen_knob_B + "'. \n");
		
		System.out.println("Type in 'Continue' or 'C'. \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		while (checker == false)
		{
			int result, count;
			Spaceadder(2);
			System.out.println("What do you choose to do? \n"
					+ "Enter '1' to change the knob. \n"
					+ "Enter '2' to head back. \n");
			result = SelErrHandler(input);
			if (result == 1)
			{
				count = 1;
				while (count == 1)
				{
					Spaceadder(2);
					System.out.println("The current knob is at " + gen_knob_B + ". \n"
							+ "What number do you turn the knob to? \n"
							+ "Enter a value ranging from '0' to '9'. \n");
					
					gen_knob_B = knob_dialler(input);
					if (gen_knob_B == -1)
					{
						System.out.println("You provided an incorrect value, \n"
								+ "Please provide a correct value ranging from '0' to '9'. \n");
					}
					else
					{
						Spaceadder(2);
						System.out.println("You've turned the knob to " + gen_knob_B + ". \n");
						gen_B_volt = gen_exciter*gen_knob_B;
						System.out.println("Once changing the knob you notice the display change to " + gen_B_volt);
						count = 0;
					}
				}
			}
			else if (result == 2)
			{
				checker = true;
			}
		}
	}
	public static int knob_dialler(Scanner input)
	{ 
		// It looks long, but its just to convert & verify the value is indeed correct for the knob
		String outcome;
		try
		{
			outcome = input.nextLine();
			if (outcome.equals("0"))
			{
				return 0;
			}
			else if (outcome.equals("1"))
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
			else if (outcome.equals("8"))
			{
				return 8;
			}
			else if (outcome.equals("9"))
			{
				return 9;
			}
		}
		catch (Exception e)
		{
			System.out.println("Please enter a valid response in letters...");
			System.out.println("'Enter' OR 'Exit' for their following actions");
		}
		return -1;
	}
	public static int TruckErrHandler(Scanner input)
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
		}
		catch (Exception e)
		{
			System.out.println("Please an integer and not any other character. \n");
			System.out.println("'1' or '2' or '3' are your valid choices. \n");
		}
		
		return 0;
	}
}	