package interface1;

public class Class1 extends Class2 implements Interface1,Interface2 {

	public static void main(String[] args)
	{
		Class1 c=new Class1();
		
		System.out.println(a);
		System.out.println(c.b);
		c.m1();
		c.m2();
		c.m3();
		
	}

	@Override
	public void m2() {
		System.out.println("this is m2 from Interface2");
		
	}

	@Override
	public void m1() {
		System.out.println("this is m1 from Interface1");
		
	}

}
