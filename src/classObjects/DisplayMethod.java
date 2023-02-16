package classObjects;

public class DisplayMethod
{
	int stuid;
	String name;
	int fees;
	char grade;
	
	void display()
	{
		System.out.println(stuid);
		System.out.println(name);
		System.out.println(fees);
		System.out.println(grade);
	}
	
	public static void main(String[] args)
	{
		DisplayMethod std=new DisplayMethod();
		std.stuid=123;
		std.name="David";
		std.fees=25000;
		std.grade='A';
		std.display();
		
	}

	
}
