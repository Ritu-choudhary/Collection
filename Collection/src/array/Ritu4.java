package array;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ritu4 {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("empId", "100");
		map.put("empName", "Sachin");

		System.out.println(map);

		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("Key   : " + key);
			System.out.println("Value : " + map.get(key));
			System.out.println("==========================");
		}

	}

}
