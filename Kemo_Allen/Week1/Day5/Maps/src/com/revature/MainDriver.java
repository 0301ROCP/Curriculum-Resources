package com.revature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.revature.models.User;

public class MainDriver {
	
	public static void main(String[] args) {
		
		/*
		 * MAPS: are NOT part of the collection hierarchy 
		 * 
		 * Map (I) - > HashMap(C), TreeMap(C), LinkedHashMap(C)
		 * 
		 * 
		 * Method: 
		 * 		putAll, clear, put, etc..
		 * 
		 * HashMap: 
		 * 		Allows duplicate values, not duplicate keys. 
		 * 		Allows a single "null" value as a key, and multiple null values 
		 * 		Does not guarantee order!
		 * 
		 * TreeMap: 
		 * 
		 * LinkedHashMap: 
		 * 
		 * Is an object that connects "keys" to "values" (also known as a dictionary in other languages). 
		 * 
		 * Each key has to be unique, but you may have duplicate values. 
		 */
		
		
		Map<Integer,String> aIntAndStringMap = new HashMap<>();
		Map<Integer,String> aIntAndStringMap2 = new HashMap<>();
		
		aIntAndStringMap.put(0, "My string that is mapped to 0");
		aIntAndStringMap.put(0, "Another value !");
//		aIntAndStringMap.put(12, "Whatever I want");
//		aIntAndStringMap.put(02, "mapped to 02");
//		aIntAndStringMap.put(60, "My string ");
//		aIntAndStringMap.put(55, "My string that is mapped to 0");
		
		System.out.println(aIntAndStringMap);
		
		aIntAndStringMap2.putAll(aIntAndStringMap);
		
		
		User u = new User("Bob", 10);
		User u1 = new User("Bobby", 8);
		User u2 = new User("McBob", 12);
		User u3 = new User("McBobby", 6);
		User u4 = new User("Frank", 2);
		
		
		Map<String,User> userMap = new HashMap<>();
		
		userMap.put(u.getUsername(), u);
		userMap.put(u1.getUsername(), u1);
		userMap.put(u2.getUsername(), u2);
		userMap.put(u3.getUsername(), u3);
		userMap.put(u4.getUsername(), u4);
		
//		System.out.println(userMap.get("Frank"));
		
		Map<List<Object>,Map<String, Set<User>>> complicatedDataStructre;
		/*
		 * First level map has a key being: list of Objects, with the value being another map
		 * Map : key being a string and a value being a Set of users!
		 */
		
		//Cannot use the enhanced for loop with maps, because it's not an iterable!
		//Maps have useful methods to handle this a bit, by returning collection data structures. 
		
//		for(String s: userMap.keySet()) {
//			System.out.println(s);
//		}
//		
//		for(User users: userMap.values()) {
//			System.out.println(users);
//		}
		
		
	}

}
