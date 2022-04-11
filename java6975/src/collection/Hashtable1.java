package collection;

import java.util.Hashtable;

public class Hashtable1 {
public static void main(String args[ ])
{
 Hashtable table = new Hashtable( );
table.put("name", "Jody");
table.put("id", new Integer(1001));
table.put("address", new String("Manila"));
 
System.out.println("Table of Contents:" + table);
}
}

