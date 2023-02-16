package string;

public class SwapStrings {

	public static void main(String[] args) 
	{
		String s1="John";
		String s2="David";
		
		System.out.println("String1: "+s1);
		System.out.println("String2: "+s2);
		
		s1=s1.concat(s2);
		s2=s1.replace("David","");
		s1=s1.replace("John","");
	
		System.out.println("String1: "+s1);
		System.out.println("String2: "+s2);

	}

}
