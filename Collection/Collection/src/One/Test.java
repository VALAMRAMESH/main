package One;

// WAP to sort Collection elements in ascending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**

 *
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(42);
		al.add(16);
		al.add(65);
		al.add(34);
		al.add(25);

		Collections.sort(al);
		System.out.println(al);

		for (int a : al) {
			System.out.println(a);

		}

		System.out.println("By using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// Descending Order

		Collections.reverse(al);
		System.out.println("By using iterator");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);
		}
	}

}
