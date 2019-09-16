/*Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how will u invoke parent class constructor from child class ?*/



public class Q1 
{
	public static void main(String[] args) 
	{
		sub1 s1 = new sub1();
		sub1 s2 = new sub1(50);
	}

}

class base
{
	base ()
	{
		System.out.println("Inside Parent class No Args");
	}
	
	base (int x)
	{
		System.out.println("Inside Parent Arguments Const");
	}
}

class sub1 extends base
{
	sub1()
	{
		super(50);
		System.out.println("Inside Child");
	}
	
	sub1(int x)
	{
		super();
		System.out.println("Inside Child Class Arguments Const");
	}
	
}
