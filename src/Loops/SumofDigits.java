package Loops;

public class SumofDigits {

	public static void main(String[] args) 
	{
		int n=1234;
		int rem,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of Digits is: "+sum);

	}

}
