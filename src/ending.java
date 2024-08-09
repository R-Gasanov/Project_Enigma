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
		Scanner input = new Scanner(System.in);
		boolean checker = false;
		
		Spaceadder(2);
		System.out.println("But whatever it was I couldn't get it. \n"
				+ "I couldn't help but be frustated... \n"
				+ "But hopefully I'll get to see her and Bonnie in the hospital at least. \n"
				+ "And that they're safe... \n"
				+ "You find yourself zoning out until you see a silhouette in the street and swerve. \n");
		
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
				+ "You grunt at the pain,  \n"
				+ "thankfully the crash wasn't too serious. \n"
				+ "You heard footsteps approaching you. \n"
				+ "'Finally, signs of human life...' \n"
				+ "You await patiently for whoever to arrive. \n");
		
		System.out.println("Type in 'Continue' \n");
		
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("'Hey! You alright in there?' \n"
				+ "You heard the man, he opened your door and grabbed you out. \n"
				+ "'I-I think so?' the pain in the abdomin still prevelant. \n"
				+ "'Arran! Its you! Thank Irene you're alright... \n"
				+ "You look up at him, he was a tall build with dark short wavy hair. \n"
				+ "'Lets get you up.' He picks you up and thats when you feel a sudden sting. \n");
		
		System.out.println("Type in 'Continue' \n");
		
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("I fall onto the ground. \n"
				+ "The last thing I see was him standing over me with a syringe. \n"
				+ "Then things turn black... \n"
				+ "Forver... \n");
		
		System.out.println("Type in 'Continue' \n");
		
		while (checker == false)
		{
			checker = LocErrHandler(input);
		}
		checker = false;
		
		Spaceadder(2);
		System.out.println("Bad Ending. \n");
		System. exit(0);
		
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
				+ "Before you let that thought truly sink in you see a silhouette in the street and swerve. \n");
		
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
				Spaceadder(2);
				System.out.println("You don't hesitate and take a shot at his leg. \n"
						+ "It hits but just barely grazes him, \n"
						+ "he groans, with shock plastered over his face. \n"
						+ "'Oh ho ho ho, you shouldn't have done that.' \n"
						+ "His face alters to this somewhat manic smile. \n"
						+ "'Arran, I'm sorry it had to come to this.' \n"
						+ "He dashed straight for you, \n"
						+ "With between you shortening you scramble to get your rifle ready. \n"
						+ "You take another shot. \n");
				
				System.out.println("Type in 'Continue \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("It goes straight through his leg. \n"
						+ "His groan was stronger,"
						+ "and just as he closed to gap to a couple of meters he fell short falling down. \n"
						+ "'D-dammit Arran! Y-you just had to get in the way! \n"
						+ "Crap that hurts!' \n"
						+ "He clenches his leg, the blood soaking his trousers. \n"
						+ "You took a step back, letting the situation sink in. \n"
						+ "You have no memories of who you are, there's been a serial killer and you just shot a man. \n"
						+ "'What are you doing just standing there... are you going to leave me here?' \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("'N-no. You're coming with me.' \n"
						+ "You left him there and went straight back to the truck. \n"
						+ "As much as you wanted to just drive and leave him there, \n"
						+ "You didn't want to leave any chance for him to somehow escape. \n"
						+ "You grap a couple of ropes in one of the boxes in the back heading straight for him. \n"
						+ "The bleeding didn't stop and he was beggining to look pale. \n"
						+ "'Are you kidding me? I don't think I can do muc-' \n"
						+ "You wack him on the head with the back of the gun, knocking him out. \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("With him talking less you tie him securely up. \n"
						+ "Dragging him back to the truck. \n"
						+ "Despite you crashing it wasn't the worst kind. \n"
						+ "With a couple attempts at the truck the engine reignites. \n"
						+ "Reversing you find yourself back on the road quickening your pace. \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("You continue on, the anxiety kicking in. \n"
						+ "Finally, \n"
						+ "after what felt like a lifetime you find yourself with signs of life. \n"
						+ "You spot a random pedestrian, by the pavement. \n"
						+ "You stop your car nearby, \n"
						+ "and roll down the window asking for directions to the polic station. \n"
						+ "He gives you them, thankfully not far. You thank him. \n"
						+ "You drive off, just noticing his surprised expression when he looks at Bryce unconscious. \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("You made it, and just as you get out. \n"
						+ "Multiple police officers and enforcers point their guns at you. \n"
						+ "'PUT YOUR HANDS UP!' You do so. \n"
						+ "But instead of panicking, you let out a sigh of relief. \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("'6 hours later.' \n"
						+ "Your eyes felt drousy, the medic gave you an all clear. \n"
						+ "She'd told me that I had supposedly experience some sort of concussion. \n"
						+ "But that didn't matter, right now you were safe. \n"
						+ "The doors opened from the polic precint entrance and there she came. \n"
						+ "'A-arran? Oh Irene you really are here!' \n"
						+ "She runs up to you and hugs you tightly, tears pouring out her eyes. \n"
						+ "'U-uh... F-fiona? Is that you?' \n"
						+ "\n"
						+ "'Of course it is silly! \n"
						+ "The one and only. \n"
						+ "The best conservationist in all of Britannia.' \n"
						+ "You look at her, \n"
						+ "something about her was familiar. Warming in a way. \n"
						+ "You could feel a tear coming down your eye. \n"
						+ "'I-is everything alright Arran?' \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("The medic told her of my amnesia. \n"
						+ "That I must've been hit on the head with something hard. \n"
						+ "'I-I-I remember you, not exactly but I can feel it.' \n"
						+ "She looked back in you. \n"
						+ "Sharing a beautiful sheepish smile. \n"
						+ "Her wavy ginger hair messy from the day's troubles illuminated her green eyes. \n"
						+ "I hugged her, it felt right. \n"
						+ "My own tears started to roll off her shoulder. \n"
						+ "'I'm glad your safe, Fiona.' \n"
						+ "We stayed like that, for a long time. \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("There was one thing left in your mind wondering. \n"
						+ "Something strange, but a question you wanted to resolving. \n"
						+ "'Why is the cabin called the 'KABIN'?' \n"
						+ "She chuckled, pausing her tears for a moment. \n"
						+ "'Your mother spelt it with a K instead of a C since her english isn't the best. \n"
						+ "The park commisoned her to do the design for the place. \n"
						+ "'You almost completely forgot the fact that you even have a mother.' \n"
						+ "Huh... you wonder to yourself, will you ever remember anyone else in your life? \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("'3 months later.' \n"
						+ "My memories had began to return. \n"
						+ "It was weird, almost like a fog was slowly lifting itself. \n"
						+ "Bryce was apprehended put on trial and taken away by the authorities. \n"
						+ "A full thorough investigation happened throughout Cairngorms National Park. \n"
						+ "They founded the 4 missing people, 3 of the missing citizens and the former employee. \n"
						+ "Caitlyn, you remembered her. She was young, bright and passonate. \n"
						+ "She wanted to travel all across Europa and visit all the places. \n"
						+ "They were found in the lochs, as his paintings suggest which he painted dozens of them. \n"
						+ "Drowning in the lochs. \n"
						+ "'Bonnie, how are you holding up today?' Fiona said, surprising her with our presence. \n"
						+ "'Could be better, can't wait to get out of here.' \n"
						+ "'Yeah... just a little longer the doctor said right?' I asked. \n"
						+ "'A week extra to just make sure, the fall was bad, but not bad enough to take me down.' \n"
						+ "'How about you Arran? Your memories are slowly coming back right?' \n"
						+ "'Yeah, still hazy at times but its getting there.' \n"
						+ "'Slowly but surely yeah... What are you guys going to do after this?' \n"
						+ "'I'll be staying in town with my grandmother, find out more about my abilites. \n"
						+ "What about you, Fiona?' Said Bonnie. \n"
						+ "'Theres still a need for a conservationist at the park. \n"
						+ "Since things are beggining to settle donw, I might stay and continue my line of work. \n"
						+ "And you, Arran?' \n"
						+ "You take a deep long breath, thinking about it. \n"
						+ "You already knew what you wanted to be."
						+ "It was just a matter of taking the first step in being so. \n"
						+ "'I wanna be a detective.' \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("True Ending. \n");
				System. exit(0);
				
			}
			else if (fincheck == 2)
			{
				Spaceadder(2);
				System.out.println("You decide to put down the gun. \n"
						+ "He releases a breath he was a breathing. \n"
						+ "'Thank you Arran, I'm glad we're on the same page.' \n"
						+ "He approaches me. \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("'Lets go find Bonnie and Fiona shall we?' \n"
						+ " He embraces me for a hug. \n"
						+ "'Together.' I felt a sudden sting on my neck. \n"
						+ "I try to move but my body feels heavy, the headache resurfacing. \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("I fall onto the ground. \n"
						+ "The last thing I see is Bryce standing over me with a syringe. \n"
						+ "Then things turn black... \n"
						+ "Forver... \n");
				
				System.out.println("Type in 'Continue' \n");
				
				while (checker == false)
				{
					checker = LocErrHandler(input);
				}
				checker = false;
				
				Spaceadder(2);
				System.out.println("Bad Ending. \n");
				System. exit(0);
				
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
