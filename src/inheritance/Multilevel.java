package inheritance;

class A
{
	int a=15;
	void display()
	{
		System.out.println("display method in class A");
	}
	
}

class B extends A
{
	int b=12;
	void show()
	{
		System.out.println("show method in class B");
	}
	
}

class C extends B
{
	int c=20;
	void print()
	{
		System.out.println("print method in class C");
	}
}

public class Multilevel {

	public static void main(String[] args)
	{
		C c=new C();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
        c.display();
        c.print();
        c.show();

	}

}
