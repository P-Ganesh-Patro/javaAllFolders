
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsArrayList {
	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList();
//		al.add("sagar");
//		al.add("bimal");
		al.add("144");
		al.add("ganesh");
		al.add("varma");
		al.add("up");
		al.add("down");
//		al.remove(1);
//		al.add("nayak");
//		System.out.println(al.get(1));
		System.out.println(al);
//		al.add(2, 8.6);
		Employee empObject = new Employee();
//		al.add(empObject);
		System.out.println(al.isEmpty());
		System.out.println(al);
//		Object data0 = al.get(1);
//		System.out.println(data0);
//		String orgValue = (String) data0;
//		Integer num = (Integer) data0;
//		System.out.println(num);
//		System.out.println(al.size());
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i) + " ");
//		}
//		System.out.println("**********************");
//		for (String el : al) {
//			System.out.print(el + " ");
//		}
//		String[] arr = { "ganesh", "sagar", "rudro", "amait" };
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println("Element data is next :- " + itr.next());
		}

		ListIterator<String> ali = al.listIterator();
		while (ali.hasNext()) {
			System.out.println("Next list iter:- " + ali.next());
		}
		System.out.println("previous value");
		while (ali.hasPrevious()) {
			System.out.println("previouse ^^^:- " + ali.previous());
		}
	}

}

class Employee {
	int id;
}
