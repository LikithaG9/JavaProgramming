package Loops;

public class Palindrome {

	public static void main(String[] args) 
	{
		int n=121;
		int rem,rev=0,i=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==i)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}

	}

}
