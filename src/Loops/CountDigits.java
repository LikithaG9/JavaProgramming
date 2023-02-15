package Loops;

public class CountDigits {

	public static void main(String[] args) 
	{
		int n=423424;
		int rem,count=0;
		while(n>0)
		{
			rem=n%10;
			count++;
			n=n/10;
		}
		System.out.println("No of digits: "+count);

	}

}
