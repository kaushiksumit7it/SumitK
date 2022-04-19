package wiproFirst;

public class Child extends Parent {

	public String extra = "test";

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public void m21() {
		System.out.println("m2 method from Child class");
	}

}
