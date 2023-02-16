package classObjects;

public class ClassObj {
	
	int empid;
	String ename;
	int esal;
	String job;

	public static void main(String[] args)
	{
		ClassObj emp1=new ClassObj();
		emp1.empid=1001;
		emp1.ename="John";
		emp1.esal=45000;
		emp1.job="Enineer";
		
		System.out.println(emp1.empid);
		System.out.println(emp1.ename);
		System.out.println(emp1.esal);
		System.out.println(emp1.job);

	}

}
