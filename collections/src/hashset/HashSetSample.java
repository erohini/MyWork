package hashset;

import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Geethika");
		hs1.add("Anvitha");
		hs1.add("Kavya");
		hs1.add("Dheeraj");
		hs1.add("Rohini");
		System.out.println(hs1);
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("Viharika");
		hs2.add("Rohini");
		hs1.retainAll(hs2);
		System.out.println("RetainAll: "+hs1);
		hs1.addAll(hs2);
		System.out.println(hs2);
		System.out.println(hs1);
		String[] str=new String[hs2.size()];
		hs2.toArray(str);
		for(String s:str){
		System.out.println(s);
		}
	}

}
