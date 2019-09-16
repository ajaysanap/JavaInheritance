/*Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.*/




class Q6
{
	public static void main(String argsp[])
	{
		
		C c1 = new C();
		c1.disp1();
		c1.disp2();
	}
}

interface A
{ 
	void disp1();
}

interface B extends A
{
	void disp2();
}

class C implements B
{
	 public void disp2()
	{
		System.out.println("In Disp2");
	}
	public void disp1()
	{
		System.out.println("In Disp1");
	}
}

