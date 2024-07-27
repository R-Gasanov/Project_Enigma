import java.util.Scanner;


public class startup 
{
	public static void main(String args[])
	{
		// Below we are displaying the version and a simple display of the game
		System.out.println("-------------Version 0.0.0.1--------------");
		System.out.println("------------------------------------------");
		System.out.println("------Enigma Games presents... KABIN------");
		System.out.println("------------------------------------------");
		System.out.println("\n");
		System.out.println("-Type 'ENTER' to start or 'EXIT' to leave-");
		// Above is presenting the potential options on what to do
		int count = 0;
		
		// While loop to make sure the error handler is fully checked and successful
		while (count == 0)
		{
			// Using a scanner for an input
			Scanner input = new Scanner(System.in);
			String outcome;
			// Using try and catch for error handling
			try
			{
				outcome = input.nextLine();
				System.out.println(outcome);
				if (outcome.toLowerCase().equals("enter"))
				{
					count = 1;
					
					core gameinstance = new core();
					gameinstance.StartGame();
					
				}
				else if (outcome.toLowerCase().equals("exit"))
				{
					count = 2;
				}
	
				{
					System.out.println("You've provided an incorrect string");
					System.out.println("Please type specifically either...");
					System.out.println("'Enter' OR 'Exit' for their following actions");
				}
			}
			catch (Exception E)
			{
				System.out.println("Please enter a valid response in letters...");
				System.out.println("'Enter' OR 'Exit' for their following actions");
			}
			//System.out.println(count);
			//Above is what I've used to double check the end results of the user's input
		}
	}

}
