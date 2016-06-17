package array;

import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class Ritu3 {

	public static void main(String[] args)
	{
		Map<String,String> phonebook=new LinkedHashMap<>();
		
		phonebook.put("Yashasvi", "8901149099");
		phonebook.put("Ritu", "8901085781");
		phonebook.put("Kriti", "9466716295");
		phonebook.put("Simran", "8901755052");
		phonebook.put("Simran", "8901755052");

		
		/*System.out.println(phonebook);
		Set<String> keys=phonebook.keySet();
		for(String x:keys){
			System.out.println("key : "+x+" " +"Value : "+phonebook.get(x));
		}*/
		
		Set<String> keys=phonebook.keySet();
		
		Iterator iterator= keys.iterator();
		
                   while(iterator.hasNext())
                      {
                	 String key=(String) iterator.next();
                	   System.out.println("Key = "+key);
                	   System.out.println("Value= "+phonebook.get(key));
}
	}
}
