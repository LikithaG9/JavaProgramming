package polymorphism;

public class Methodoverldng {
	
	int x,y,z;
	
	void add()
	{
		x=10;
		y=20;
		System.out.println(x+y);
		
	}
	
	void add(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void add(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);
	}

	public static void main(String[] args)
	{
		Methodoverldng m=new Methodoverldng();
		
		m.add();
		m.add(20,21);
		m.add(21,23,12);

	}

}
