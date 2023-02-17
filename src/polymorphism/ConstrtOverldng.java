package polymorphism;

public class ConstrtOverldng {
	
	int x,y;
	String s;
	
	ConstrtOverldng()
	{
		x=10;
		y=12;
		s="java";
	}
	ConstrtOverldng(int a,int b)
	{
		x=a;
		y=b;
	}
	ConstrtOverldng(int a,String c)
	{
		x=a;
		s=c;
	}
	ConstrtOverldng(String c,int b)
	{
		y=b;
		s=c;
	}
	ConstrtOverldng(int a,int b,String c)
	{
		x=a;
		y=b;
		s=c;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		ConstrtOverldng c=new ConstrtOverldng();
		//ConstrtOverldng c1=new ConstrtOverldng(12,13);
		//ConstrtOverldng c2=new ConstrtOverldng(10,"welcome");
		//ConstrtOverldng c=new ConstrtOverldng("java",76);
		//ConstrtOverldng c4=new ConstrtOverldng(12,45,"automation");
		
		
		c.display();

	}

}
