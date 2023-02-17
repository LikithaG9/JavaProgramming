package polymorphism;

public class This_keyword {
	
	int a,b;
	
	void set(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		This_keyword t=new This_keyword();
		t.set(12, 10);
		t.display();

	}

}
