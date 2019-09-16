/* Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/



class Q7
{
	public static void main(String argsp[])
	{
		Child c=new Child();
		c.disp1();
		System.out.println("Value of K is : "+ c.k);
		c.disp2();

	}
}

 class Parent1
 {
	 int k;
	void disp1()
	{
		 this.k=10;
		System.out.println("In parent disp1:  "+k);
	}
 }
 
 interface Parent2 
 {
	 void disp2();
 }
 
 class Child  extends Parent1 implements  Parent2
 {
	public void disp2() 
	{
		System.out.println("Inside Disp2");	
	}	 
 }
