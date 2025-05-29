package operations_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Kevil");
		map.put(12, "Soham");
		map.put(14, "Tejas");
		map.put(16, "Shinde");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());

//		Set<Map.Entry<Integer, String>> set = map.entrySet();
//		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

//		while (iterator.hasNext()) {
//			Map.Entry<Integer, String> entry = iterator.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

//		map.forEach((key, value ) -> System.out.println(key+ " "+ value));

		Map<Integer, String> map2 = new Hashtable<Integer, String>();
		map2.put(10, "Kevil");
		map2.put(12, "Soham");
		map2.put(14, "Tejas");
		map2.put(16, "Shinde");
//		System.out.println(map2);

//		Set set = map2.entrySet();
//		Iterator iterator = set.iterator();
//		while (iterator.hasNext()) {
//			Map.Entry entry = (Map.Entry) iterator.next();
//			System.out.println(entry.getKey()+ " * "+entry.getValue());
//			
//		}

		Properties properties = new Properties();
		properties.put("India", "Delhi");
		properties.put("India2", "Delhi2");
		properties.put("India3", "Delhi3");
		properties.put("India4", "Delhi4");
//		System.out.println(properties.keySet());

		Set set = properties.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str + "  " + properties.getProperty(str));

		}
		
		String string = properties.getProperty("India23", "not found");
		System.out.println(string);

	}
}
