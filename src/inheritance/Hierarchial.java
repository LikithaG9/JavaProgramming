package inheritance;

class Parent1
{
	int a;
	void set1(int a)
	{
		this.a=a;
	}
	
}

class Child1 extends Parent1
{
	int b;
	void set2(int b)
	{
		this.b=b;
	}
}

class Child2 extends Parent1
{
	int c;
	void set3(int c)
	{
		this.c=c;
	}
	
}

public class Hierarchial {

	public static void main(String[] args) 
	{
		Child1 ch=new Child1();
		ch.set1(12);
		ch.set2(45);
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		
		Child2 ch1=new Child2();
		ch1.set1(34);
		ch1.set3(32);
		System.out.println(ch1.a);
		System.out.println(ch1.c);
		
		
	}

}
