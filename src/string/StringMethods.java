package string;

public class StringMethods {

	public static void main(String[] args)
	{
		String s="java";
		
		System.out.println(s.length());   //length() method
		
		String s1="programming";
		
		//System.out.println(s+s1);
		
		System.out.println(s.concat(s1));  //concat method
		
		String s2="   Automation   ";
		
		System.out.println(s2.length());
        System.out.println(s2.trim().length());  //trim() method
        
        System.out.println(s1.charAt(4));  //character at a particular index
        System.out.println(s1.charAt(9));
        
        System.out.println(s1.contains("mmin")); // search for a substring & returns boolean value
        System.out.println(s1.contains("ram"));
        
        s1="JAVA";
        
        System.out.println(s.equals(s1)); //compares two strings
        System.out.println(s.equalsIgnoreCase(s1));
        
        String s3="I'm programming in java";
        
        System.out.println(s3.replace("java","python"));  //replace() - can replace single/multiple chars
        System.out.println(s3.replace('i','u'));
        
        System.out.println(s3.substring(2,7));  //substring() method
        
        String a[]=s3.split(" ");  //split method
        
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
        
        System.out.println(s.toUpperCase());  
        System.out.println(s1.toLowerCase());
        
        String ss=new String("java");
        
        System.out.println(s);
        System.out.println(ss);
        System.out.println(s==ss);
        System.out.println(s.equals(ss));
        
        String sc=ss;
        
        System.out.println(s==sc);
        System.out.println(ss.equals(sc));
        System.out.println(ss==sc);
        

	}

}
