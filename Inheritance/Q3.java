/*Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.*/

public class Q3 
{
	public static void main(String[] args) 
	{
		sub1 s1 = new sub1();
		sub2 s2 = new sub2(50);
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
		System.out.println("Inside Sub1");
	}
	
	sub1(int x)
	{
		super();
		System.out.println("Inside Sub1 Class Arguments Const");
	}
	
}




class sub2 extends base
{
	sub2()
	{
		super(50);
		System.out.println("Inside Sub2");
	}
	
	sub2(int x)
	{
		super();
		System.out.println("Inside Sub2 Class Arguments Const");
	}
	
}
