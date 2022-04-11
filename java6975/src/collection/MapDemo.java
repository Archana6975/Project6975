package collection;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> map = new TreeMap<String,String>();
		
		map.put("keerthi","mohan");
		map.put("Archana","jayakumar");
		map.put("Viji","   lakshmi");
		
		System.out.println("Print the map content :"+map);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry map1 = (Map.Entry)itr.next();
			System.out.println(map1.getKey()+"     "+map1.getValue());
		}
		
		
	}

}
