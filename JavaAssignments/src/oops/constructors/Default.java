/**
 * 
 */
package oops.constructors;

/**
 * @author panka
 *
 */
public class Default extends Parametrized{
	
	public Default() {
		//super(name);
		System.out.println("Default");
	}
	
	public Default(String name) {
		this();
		//super(name); // comment this to call default constractor of parent class
		System.out.println("Default name "+name);
	}
	public Default(String name,int age) {
		//super(name); // comment this to call default constractor of parent class
		this(name);
		System.out.println("Default age "+age);
	}
	

}
