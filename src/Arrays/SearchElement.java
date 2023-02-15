package Arrays;

public class SearchElement {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		int n=30,Count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				Count++;
			}
		}
		if(Count>0)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}

	}

}
