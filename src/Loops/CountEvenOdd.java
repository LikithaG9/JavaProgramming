package Loops;

public class CountEvenOdd {

	public static void main(String[] args) 
	{
		int n=23456;
		int rem,count1=0,count2=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
			n=n/10;
		}
		System.out.println("No of Even numbers: "+count1);
		System.out.println("No of Odd numbers: "+count2);

	}

}
