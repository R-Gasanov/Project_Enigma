import java.util.Scanner;


public class rustic_truck
{
	public void rustic_truck()
	{
		Spaceadder(10);
		System.out.println("-------------Version 0.0.0.1--------------");
		System.out.println("------------------------------------------");
		System.out.println("------Enigma Games presents... KABIN------");
		System.out.println("------------------------------------------");
		System.out.println("\n");
		
		System.out.println("You make your way through the path. \n"
				+ "It doesn't take you long to find something else along the path. \n"
				+ "You notice a truck, \n"
				+ "its state looked questionable. \n"
				+ "As you approach the truck you notice it more clearly. \n"
				+ "It appeared to have writing on the side but it was barely readable... \n"
				+ "The only part you were able to make out was 'Park Ranger's Mobile'. \n"
				+ "You notice that the truck wasn't the only thing here. \n");
		
		Scanner input = new Scanner(System.in);
		
		boolean checker = false;
		
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("You notice just passed the truck was what appeared to be a garage, \n"
				+ "It almost appeared coming out of the ground, \n"
				+ "making a small mound of green around the door. \n"
				+ "Beside it looked like a podium with what appeared to be switch. \n"
				+ "You take a good extra look around. \n"
				+ "Managing to spot three other things, three generators scattered around. \n");
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		System.out.println("You have this odd feeling that this truck might be your only escape. \n");
		
		// Here we will be using the cabin location method, just rewriting it here for practice sake
		while (checker == false)
		{
			int location = 0; 
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
	public static void truck()
	{
		
	}
	public static void generator_C()
	{
		
	}
	public static void garage()
	{
		
	}
	public static void generator_A()
	{
		int gen_Vol = 10;
		int gen_knob = 2;
		boolean checker = false;
		Scanner input = new Scanner(System.in);
		Spaceadder(2);
		System.out.println("You approach the generator beside the hidden garage. \n"
				+ "It looked fairly ancient and run down, \n"
				+ "the labelling of it clearly ripped off. \n"
				+ "You do spot a control panel among it, "
				+ "although the panel sadly is cracked not showcasing anything. \n"
				+ "The only thing noteworthy is a knob you could turn, it was currently left at '2'. \n");
		
		System.out.println("Type in 'Continue'");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		while (checker == false)
		{
			Spaceadder(2);
			System.out.println("What do you choose to do? \n"
					+ "Enter '1' to change the knob. \n"
					+ "Enter '2' to head back. \n");
			
		}
		
	}
	public static void generator_switch()
	{
		
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
		
	}
}	

