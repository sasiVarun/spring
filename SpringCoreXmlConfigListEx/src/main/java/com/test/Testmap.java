package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testmap {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(101, "Sam");
		map.put(102, "David");
		map.put(103, "Blake");
		map.put(104, "Cereal");
		
		Set set = map.entrySet();
		Iterator it =set.iterator();
		
		while(it.hasNext()) {
//			Map.Entry entry = (Map.Entry)it.next();
			Entry entry= (Map.Entry)it.next();
			System.out.println(entry.getClass().getName());
//			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
	}
}
