package array;

import java.util.ArrayList;
import java.util.Iterator;


public class arraylist extends ArrayList  {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(3);
		
		//list.add("Mango");
		//list.add(new Integer(20));
	//list.add("Apple");
	list.add("Mang");
	list.add(new Integer(200));
	list.add("Man");
	list.add(new Integer(207));
	

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
		//Integer value =(Integer) iterator.next();
			System.out.println(iterator.next());
		}
		System.out.println("size ofarray="+list.size());

	}

}
