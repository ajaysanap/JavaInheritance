/*create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. Call "perform()" method from main function.*/

class Q9
{
	
	static void perform(Game ref)
	{
		ref.play();   // polymorphic call
	}
	public static void main(String argsp[])
	{
		
        perform(new Football());
        perform(new Cricket());
        perform(new Tennis());

	}
}


interface Game
{
	abstract void play();
}
 
class Cricket implements Game
{

	public void play() 
	{
		System.out.println("Playing Criket");
	}
	
}
 
class Football implements Game
{

	public void play() 
	{
		System.out.println("Playing Football");
	}
	
}class Tennis implements Game
{

	public void play() 
	{
		System.out.println("Playing Tennis");
	}
	
}