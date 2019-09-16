/*create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/



class Q5
{
	public static void main(String argsp[])
	{
		
		Shape S[]=new Shape[3];
		S[0]=new Triangle();
		S[1]=new Polygon();
		S[2]=new Circle();	
		
		S[0].draw();
		S[1].draw();	
		S[2].draw();		
	}
}

 abstract class Shape
 {
	 abstract public void draw();
 }
 
 class Triangle extends Shape
 {
	 public void draw(){
		 System.out.println("Triangle shape");
	 }
 }
 
 
 class Polygon extends Shape
 {
	 public void draw(){
		 System.out.println("Polygon shape");
	 }
 }
 
 class Circle extends Shape
 {
	 public void draw(){
		 System.out.println("Circle shape");
	 }
 }