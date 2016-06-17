package array;

import java.util.Set;
import java.util.TreeSet;


public class Ritu2 {

	public static void main(String[] args) {
		Set<String> a=new TreeSet<String>();
		 a.add("Green");
         a.add("Yellow");
         a.add("Blue");
         a.add("Orange");
         a.add("Blue");
         a.add("Orange");
         
         for(String x:a)
         {
        	 System.out.println(x);
         }

	}

}
