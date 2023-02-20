package exceptions;

public class Checked_exception {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("first statement");
		System.out.println("second statement");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Thread.sleep(5000);
		System.out.println("main method ending");
	}

}
