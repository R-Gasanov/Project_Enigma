
public class inventory 
{
	// Here we will be storing all the user's items for future use.
	
	/*
	 *  In addition we will be using setters and getters.
	 *  Meaning I will need to learn and understand how to user them in future pretenses within coding
	 */
	
	// -> So to understand a getter literally just prints out the variable for you
	
	// -> And as you guessed it, the setter literally sets the value of the variable
	
	private boolean 
		rustycompass = true,
		kabinkey = false, 
		note = false, 
		carkey = false, 
		carfuel = false;
	
	public boolean getrustycompass()
	{
		return rustycompass;
	}
	
	public boolean getkabinkey()
	{
		return kabinkey;
	}
	// Creating the set of getters here.
	public boolean getnote()
	{
		return note;
	}
	
	public boolean getcarkey()
	{
		return carkey;
	}
	
	public boolean getcarfuel()
	{
		return carfuel;
	}
	
	// Now we will be making the setters to modify the variables for future uses
	
	// Now remember void, means it doesn't have to return anything thus called void
	
	public void setkabinkey(boolean kabinkey)
	{
		this.kabinkey = kabinkey;
	}
	
	public void setnote(boolean note)
	{
		this.note = note;
	}
	
	public void setcarkey(boolean carkey)
	{
		this.carkey = carkey;
	}
	
	public void setcarfuel(boolean carfuel)
	{
		this.carfuel = carfuel;
	}
	
	//As you can see above, we now have the setters.
	
	
	// To remind myself, above are global variables. (Unless we make them private, which is what we did now)
	
	// This may be subject to change and the current inventory java file is highly experimental and new
	

}
