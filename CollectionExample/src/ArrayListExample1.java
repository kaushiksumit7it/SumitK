
import java.util.*;

class ArrayListExample1 {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist

		list.add("Patrick");
		list.add("RAMShyam");
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");

		list.add("Harash");
		list.add("Alex");
		list.add("Harash");
		list.add("Alex");
	///	list.get(3);
		System.out.println("list size is as -->" + list.size());
//Traversing list through Iterator  
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
