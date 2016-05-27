

abstract class Shape implements Printable{
	double width,height,radius;
	double base;
	final float pi=3.14f;
	double area;
	abstract void area(); //abstract method for calculating the area
	public void print()
	{
		System.out.println("Printing");
	}
	public String toString(){
		return "Shape object";
	}
}
class Circle extends Shape{
	Circle(double radius1) //one argument parametere constructor
	{
		radius=radius1;
	}
	@Override
	void area() //overriden method for calculating area
	{
		area=pi*radius*radius;
		System.out.println("Area of circle is "+area);
	}
	}

class Rectangle extends Shape{
	Rectangle(double a1,double a2) //two arguments constructor
	{
		width=a1;
		height=a2;
	}
	
	@Override
	void area() //overriden method for calculating area
	{
		area=width*height;
		System.out.println("Area of rectangle is "+area);
	}
}

class Triangle extends Shape{
	Triangle(double a,double a2)//two arguments constructor
	{
		base=a;
		height=a2;
	}
	@Override
	void area() //overriden method for calculating are
	{
		area=base*height;
		System.out.println("Area of triangle is "+area);
	}
}
public class Calc {
		public static void main(String args[])
		{
			Shape a[]={new Circle(12.5),new Rectangle(5.6,9.4),new Triangle(8.4,9.12)}; // referance array containing objects of subclasses
			for(int i=0;i<a.length;i++) //loop for traversing the Obejcts
			{
				a[i].area();
			}
		}
}
