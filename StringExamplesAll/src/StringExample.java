public class StringExample {
	public static void main(String args[]) {
		String s1 = "java";// creating string by Java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		char ch1[]= {'a','n','i','l'};
		String s6=new String(ch);
		String s5 = new String(ch1);
	//	String s4=new String(ch);
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating Java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s5);
	}
}