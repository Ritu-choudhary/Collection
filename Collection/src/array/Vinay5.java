package array;

import java.util.Set;
import java.util.TreeSet;

public class Vinay5 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Grapes");
		set.add("Mango");
		set.add("Orange");
		set.add("Pine-Apple");

		for (String value : set) {
			System.out.println(value);
		}

	}

}
