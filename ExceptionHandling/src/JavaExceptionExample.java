public class JavaExceptionExample {
	public static void main(String args[]) {
		try 
		{
			// code that may raise exception
			int data = 100 / 0;

		} 
		catch (ArithmeticException u){
			System.out.println(u);
		}
		// rest code of the program
		System.out.println("rest of the code1...");
		System.out.println("rest of the code.2..");
		System.out.println("rest of the code..3.");
		System.out.println("rest of the code...4");
		System.out.println("rest of the code...5");
		System.out.println("rest of the code..6.");
	}
}
