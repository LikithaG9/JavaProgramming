package exceptions;

import java.util.Scanner;
public class Unchecked_exception {

	public static void main(String[] args)
	{
		int a=100;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int b=s.nextInt();
		
		try
		{
		System.out.println(a/b);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Arithmetic exception thrown");
			System.out.println("Exception handled");
		}
		/*catch(Exception e)
		 * {
		 * System.out.println("Exception thrown");
		 * }
		 */
		finally
		{
		System.out.println("Entered finally block ");
		}
		
		System.out.println("Exception ended... ");
		

	}

}
