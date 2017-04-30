package gcexample;

import com.Item;

public class GarbageCollector extends Object{

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("Total memory: "+runtime.totalMemory());
		System.out.println("Free space before objects: "+runtime.freeMemory());
		
		for(int i=0; i<40000; i++){
			new Item(i+1,"item"+i, 300);
		}
		
		System.out.println("Free memory after objects: "+runtime.freeMemory());
		System.out.println("calling gc....");
		
		runtime.gc();
		System.out.println("Free memory after gc is called..."+runtime.freeMemory());
		
		runtime.gc();
		System.out.println("Free memory after gc is called..."+runtime.freeMemory());
		
		runtime.gc();
		System.out.println("Free memory after gc is called..."+runtime.freeMemory());
	}

}
