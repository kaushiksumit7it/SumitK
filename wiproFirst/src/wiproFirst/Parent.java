package wiproFirst;

public class Parent {
	
	Parent()
	{
		System.out.println("Parent Class Constructor is called");
	}

	public int age = 3;
	
	public String name = "Ram";

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void compute123() {
		System.out.println("Compute method from the parnet class");
	}

}
