interface Printable
{
	void print(); //abstract method for print 
}

class Utility implements Printable{
	
	void printAll(Printable p[]) //method for printing all objects
	{
		for(int i=0;i<p.length;i++) //loop for traversing the array
		{
			System.out.println(p[i].toString());
		}
	}
	@Override
	public void print() //overriden method
	{
		System.out.println("Printing");
	}
}


public class Printing {
		
	public static void main(String args[])
	{
		Printable p[]={new Cat(),new Lion(),new Dog(),new Circle(12.5),new Rectangle(5.6,9.4),new Triangle(8.4,9.12)};// referance array of Printable containing animal and shape class objects
		Utility u=new Utility();//Creating object of utility class
		u.printAll(p);
	}
}
