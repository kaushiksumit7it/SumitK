
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1,"Ram"));
		employeeList.add(new Employee(2,"Sita"));
		employeeList.add(new Employee(3,"Laxman"));
		employeeList.add(new Employee(4,"Laxmi"));
		employeeList.add(new Employee(5,"Sravanthi"));
		int i=3;
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Maruti");
		System.out.println(cars.size());
		System.out.println(employeeList.size());
		
		Iterator itr = employeeList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
