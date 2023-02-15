package Conditional_statements;

public class Elseif {

	public static void main(String[] args) {
		//Largest of 3 numbers
		
		int a=10,b=20,c=15;
		
		if(a>b &&a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	}

}
