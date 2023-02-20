package inheritance;

class Class1
{
	void m1()
	{
		System.out.println("m1 method in class1");
	}
}

class Class2 extends Class1
{
	void m1()
	{
		System.out.println("m1 method in class2");
		super.m1();
	}
	
}

public class Super_keyword {

	public static void main(String[] args)
	{
		Class2 c=new Class2();
		c.m1();

	}

}
