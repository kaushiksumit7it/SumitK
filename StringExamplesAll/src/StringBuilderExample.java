class StringBuilderExample{  
public static void main(String args[]){  
StringBuilder sb=new StringBuilder("Hello ");  


sb.append("Java");//now original string is changed  
sb.append("Java");// now original string is changed
sb.append(" is");
sb.append("a Great");
sb.append(" Language");
sb.append(" AweSome");
System.out.println(sb);//prints Hello Java  
}  
}  