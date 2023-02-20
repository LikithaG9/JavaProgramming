package inheritance;

class Abc
{
	int a;
	int b;

	void m1(int a,int b)
	{
		System.out.println(a*b);
	}
}

class Mno extends Abc
{
	void m1(int a,int b)
	{
		System.out.println(a+b);
	}
	
}

public class Overriding {

	public static void main(String[] args) 
	{
		Mno obj=new Mno();
		obj.m1(12, 23);

	}

}
