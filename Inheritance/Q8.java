/*Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/


class Q8
{
	public static void main(String argsp[])
	{
		sub1 s=new sub1(54,890);
		s.disp(50,500);
	}
}

class Base1 
{
	Base1(int a,int b)
	{
		System.out.println("Value of: "+a +"\n"+"Value of b is:"+ b);
	}
}
 
class sub1 extends Base1
{

	sub1()
	{ 
		super(10,20);
		System.out.println("IN sub1 no args constructor");
	}
	
	sub1(int k)
	{	super(30,40);
		System.out.println("In sub1 ONE Args constructor");
	}
	
	sub1(int x,int y)
	{
		super(50,60);
		System.out.println("IN sub1 Two args constructor");
	}

	public void disp(int a,int b)
	{
	System.out.println("Inside Disp Value of: "+a +"\n"+"Value of b is:"+ b);

}
}