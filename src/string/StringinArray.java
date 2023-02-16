package string;

public class StringinArray {

	public static void main(String[] args) 
	{
		//Search a string in string array
		
		String a[]= {"abc","def","ghi","jkl"};
		String s="ghi";
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("String found");
		}
		else
		{
			System.out.println("String not found");
		}

	}

}
