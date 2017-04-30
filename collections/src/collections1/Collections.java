package collections1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		ListIterator<String> listI = null;
//		list.add(0, "Geethika");
//		list.add(1,"Rohini");
//		list.add(2, "Kavya");
//		list.add(3,"Dheeraj");
//		list.add(4,"Anvitha");
//		list.add(5,"Viharika");
//		System.out.println("Besties: "+list);
		//Iterator
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()){
//			System.out.println("Besties: "+iterator.next());
//			if("Rohini".equals(iterator.next()))
//			{
//				iterator.remove();
//				System.out.println("Rohini has been removed");
//			}
//		}
		//ListIterator
//		listI = list.listIterator();
//		System.out.println("Forword_List...");
//		while(listI.hasNext()){
//			System.out.println("\t"+listI.next());
//		}
//		System.out.println("Backword_List...");
//		while(listI.hasPrevious()){
//			System.out.println("\t"+listI.previous());
//		}
		//System.out.println("Besties: "+list);
		Vector<String> vector = new Vector<String>();
		Enumeration<String> enumeration = null;
		vector.add(0, "Geethika");
		vector.add(1,"Rohini");
		vector.add(2, "Kavya");
		vector.add(3,"Dheeraj");
		vector.add(4,"Anvitha");
		vector.add(5,"Viharika");
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.get(4));
		System.out.println("empty?: "+vector.isEmpty());
		enumeration = vector.elements();
		while(enumeration.hasMoreElements()){
		System.out.println("\t"+enumeration.nextElement());
		}
		Vector<String> copy = (Vector<String>) vector.clone();
		String[] arr = new String[copy.size()];
		copy.copyInto(arr);
		for(String str:arr){
			System.out.println("Array: "+str);
		}
		copy.remove(1);
		System.out.println("copy: "+copy);
		System.out.println(copy.containsAll(vector));
	}

}
