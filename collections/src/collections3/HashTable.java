package collections3;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("Sister1", "Geethika");
		ht.put("Friend1", "Viharika");
		ht.put("Friend2", "Anvitha");
		ht.put("Sister2", "Kavya");
		ht.put("Brother", "Dheeraj");
		ht.put("Me", "Rohini");
		System.out.println("KeySet(): "+ht.keySet());
////		System.out.println(ht);
////		System.out.println(ht.get("Friend1"));
////		System.out.println("original Size: "+ht.size());
////		System.out.println("Is hashtable empty? "+ht.isEmpty());
//		System.out.println(ht.remove("Me"));
////		System.out.println(ht.size());
////		System.out.println(ht);
//		System.out.println("containsKey? "+ht.containsKey("Sister1"));
//		System.out.println("containsValue?"+ht.containsValue("Rohini"));
//		Set<String> keys = ht.keySet();
//		System.out.println(keys);
//		for(String key: keys){
//			System.out.println(key+ ": "+ht.get(key));
//		}
		Set<Entry<String,String>> entries = ht.entrySet();
		for(Entry<String,String> ent:entries){
			System.out.println(ent.getKey()+"=>"+ent.getValue());
		}
	}

}
