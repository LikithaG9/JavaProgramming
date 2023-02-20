package inheritance;

class Parent
{
	int x=10;
	void display()
	{
		System.out.println(x);
	}
}
class Child extends Parent
{
	int y=12;
	void show()
	{
		System.out.println(y);
	}
	
}
public class Single {

	public static void main(String[] args)
	{
		Child ch=new Child();
		ch.display();
		ch.show();

	}

}
