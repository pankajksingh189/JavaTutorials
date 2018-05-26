package collection.sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;

		if(e1.age==e2.age) {
			System.out.println(e1.age +"="+e2.age);
			return 0;  
		}
//		else if(e1.age%10>e2.age%10) {  // will short based on last digit
		else if(e1.age>e2.age) {
			System.out.println(e1.age +">"+e2.age);
			return 1;  
		}
		else {
			System.out.println(e1.age +"<"+e2.age);
			return -1;  
		}
			
	}
}
