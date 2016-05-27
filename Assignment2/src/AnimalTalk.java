
abstract class Animal implements Printable
{
	void respiration() //method for respiration
	{
		System.out.println("Animal Respiration");
	}
	abstract void talk();//abstract method for talk
	public void print()//method of Printable interface
	{
		
	}
	public String toString(){
		return "Animal Object";
	}
}
class Cat extends Animal
{
	@Override
	void talk() //overriden method
	{
		System.out.println("Cat is talking");
	}
}
class Dog extends Animal
{
	@Override
	void talk()//overriden method
	{
		System.out.println("Dog is talking");
	}
}
class Lion extends Animal
{
	@Override
	void talk()//overriden method
	{
		System.out.println("lionn is talking");
	}
}
public class AnimalTalk {
	public static void main(String args[])
	{
		Animal a[]={new Cat(),new Dog(),new Lion()}; //Referance array of containing objects of subclasses
		for(int i=0;i<a.length;i++) //loop for traversing the Obejcts
		{
			a[i].talk();
			a[i].respiration();
		}
	}
}
