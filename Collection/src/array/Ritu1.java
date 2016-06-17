package array;
import java.util.HashSet;
import java.util.Set;


public class Ritu1 {
 	public static void main(String[] args) {
		Set<String> a=new HashSet<String>();
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
