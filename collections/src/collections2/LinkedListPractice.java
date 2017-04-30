package collections2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Roommates> LinkList = new LinkedList<Roommates>();
		LinkList.add(new Roommates("Geethika",20000));
		LinkList.add(new Roommates("Viharika",19000));
		LinkList.add(new Roommates("Anvitha",19000));
		LinkList.add(new Roommates("Kavya",18000));
		LinkList.add(new Roommates("Dheeraj",18000));
		LinkList.add(new Roommates("Rohini",5000));
		Collections.shuffle(LinkList);
		//Collections.sort(LinkList, new Comp());
		System.out.println("Sorted items....");
		for(Roommates r:LinkList){
			System.out.println(r);
		}
	}
}

//class Comp implements Comparator<Roommates>{
//	public int compare(Roommates r1, Roommates r2){
//		if(r1.getSalary() < r2.getSalary())
//		{
//			return 1;
//		}
//		else 
//		return -1;
//		
//	}
//}

class Roommates {
	String name;
	int salary;
	
	public Roommates(String n, int s){
		this.name = n;
		this.salary = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return "name: "+this.name+", Salary: "+this.salary;
		
	}
	
}