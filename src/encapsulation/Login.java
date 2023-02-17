package encapsulation;

public class Login {
	
	private String username="abcd";
	private int passwd=1234;
	
	public String getUser()
	{
		return username;
	}
	public int getPass()
	{
		return passwd;
	}
	public void setPass(int passwd)
	{
		this.passwd=passwd;
	}
	
	public void display()
	{
		System.out.println("Welcome");
	}

}
