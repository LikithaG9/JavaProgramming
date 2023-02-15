package Arrays;

public class EvenOddElements {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7};
		int c1=0,c2=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c1++;
			}
			else
			{
				c2++;
			}
		}
		System.out.println("No of Even elements is: "+c1);
		System.out.println("No of Odd elements is: "+c2);
	}

}
