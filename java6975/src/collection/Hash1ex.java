package collection;

import java.util.HashMap;
public class Hash1ex
{
public static void main(String args[ ])
 {
HashMap<String,String> map = new HashMap<String,String>();
map.put("Martyn", "A");
map.put("Nelson", "F");
map.put("Davis", "B");
System.out.println("Name: " +map.get("Martyn"));
System.out.println("ID: " + map.get("Nelson"));
System.out.println("Address: " + map.get("Davis"));
}
}
