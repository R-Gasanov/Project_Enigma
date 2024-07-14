
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
				+ "You wondered \n"
				+ "With little choices \n");
		
		
		
	}
	public static void Spaceadder(int space)
	{ // Here is what we use to create the space in between each segment of dialogue
		while (space > 0)
		{
			System.out.println();
			space--;
		}
	}	

}
