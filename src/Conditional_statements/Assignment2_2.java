package Conditional_statements;

public class Assignment2_2 {

	public static void main(String[] args) 
	{
		int a=21,b=10,c=30;
		if(a<b && a<c)
		{
			System.out.println("a is smallest");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest");
		}
		else
		{
			System.out.println("c is smallest");
		}

	}

}
