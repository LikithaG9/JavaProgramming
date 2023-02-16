package classObjects;

public class Class2
{
	int orderid;
	String location;
	int amt;

	Class2(int o,String l,int a)
	{
		orderid=o;
		location=l;
		amt=a;
	}
	
	void details()
	{
		System.out.println(orderid);
		System.out.println(location);
		System.out.println(amt);
	}

}
