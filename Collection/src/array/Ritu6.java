package array;

import java.util.ArrayList; 

import java.util.Iterator;
import java.util.List;

public class Ritu6 {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		
		//a.add("Ritu");
		//a.add("Veenu");
		a.add(6);
		//a.add("Kriti");
		//a.add("Simran");
		//a.add("Kriti");
		//a.add("Simran");
		a.add(4);
		
		Iterator iterator=a.iterator();
		
		while(iterator.hasNext())
		{
			Integer value=(Integer)iterator.next();
			System.out.println(value);
			
		}
		
		//for(String x: a)
		//{
		//	System.out.println(x);
		//}
		//System.out.println("size of array="+a.size());
		
		}

}
