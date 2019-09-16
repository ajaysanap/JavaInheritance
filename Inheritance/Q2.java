/*create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method of parent class ?*/



public class Q2 
{
	public static void main(String[] args) 
	{
		Fourwheeler v1 = new Fourwheeler();
		v1.start();
	}

}

class Fourwheeler extends Vehicle
{
 	public void start()
 	{	
	System.out.println("Inside Child Start");
	}
	
}

class Vehicle
{
  public void start()
	{
		System.out.println("Inside Parent Start");
	}
		
}

