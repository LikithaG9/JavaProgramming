package encapsulation;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Login l=new Login();
		
		System.out.println("enter username");
		String s=sc.next();
		System.out.println("enter password");
		int p=sc.nextInt();
		
		if(s.equals(l.getUser()) && p==l.getPass())
		{
			l.display();
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	

	}

}
