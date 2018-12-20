package oops.constructors;

/**
 * @author panka
 *
 */
public class Parametrized {
	private String name;
	
	public Parametrized() {
		System.out.println(this.name + " Parametrized class default");
	}
	
	public Parametrized(String name) {
		//this();
		this.name = name;
		System.out.println(this.name + " Parametrized class");
	}
}
