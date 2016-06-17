package array;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class Ritu5 {

	public static void main(String[] args) {
		Map<String,Integer> info =new HashMap<>();
		info.put("Ritu", 21);
		info.put("Veenu", 19);
		info.put("Yashasvi", 20);
		info.put("Parisha", 15);
		
		//System.out.println(info);
		
		Set<String> names=info.keySet();
		
		/*for(String i:names)
		{
			System.out.println("Name = "+i+"  "+"Age = "+info.get(i));
		}*/
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()){
			String key=itr.next();
			System.out.print("Name = "+key+"  ");
			System.out.println("Age = "+info.get(key));
		}
	}

}
