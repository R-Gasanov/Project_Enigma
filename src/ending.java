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
				+ "Fiona was trying to me something... \n");
		
		// The beginning of the divergence of the endings will start to occur now.
		
		// Solely based on whether or not you've got the gun
		
		System.out.println("Type in 'Continue' \n");
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
	}
	public static void badending()
	{
		
	}
	public static void goodending()
	{
		
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

}
