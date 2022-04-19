class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		sb.append(" is");
		sb.append("something");
		sb.append("a Great");
		sb.append("Language");
		System.out.println(sb);// prints Hello Java
	}
}