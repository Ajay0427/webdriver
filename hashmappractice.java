package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmappractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> map1 = new HashMap<String,String>();
		
		map1.put("1", "ajay");
		map1.put("2", "ajay");
		map1.put("3", "ajay");
		map1.put("4", "ajay");
		
		String existing = map1.get("4");
		String extraContent = ",new content";
		map1.put("key", existing == null ? extraContent : existing + extraContent);
		
		Iterator itr = map1.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me2 = (Map.Entry) itr.next();
			System.out.println(me2.getKey()+"     "+ me2.getValue());
			
		}
		
	}
	}
		
