package jar.business;

public class Person {
	//Attribute
	
	String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		this.name = name;
	}

	
	//Get & Set
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//Display
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
