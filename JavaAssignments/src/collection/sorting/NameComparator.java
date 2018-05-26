package collection.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		Employee e1=(Employee)arg0;
		Employee e2=(Employee)arg1;
		return e1.name.compareToIgnoreCase(e2.name);
	}

}
