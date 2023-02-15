package Loops;

public class JumpingStatements {
	public static void main(String[] args)
	{
		for(int i=1;i<=15;i++)
		{
			if(i%3==0)
			{
				continue;
			}
			System.out.println(i);
			if(i==10)
			{
				break;
			}
		}
	}

}
