package Four;

/**
 * WAP to store elements in List and remove all duplicates names of items. After 
duplicates are removed print all elements in descending order. 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("akash");
		al.add("Sarang");
		al.add("Ketan");
		al.add("akshay");
		al.add("Akash");
		al.add("Ketan");

		Set<String> set = new HashSet<>(al);

		ArrayList<String> list = new ArrayList<String>(set);

		Collections.sort(list);
		
		Collections.reverse(list);
		
		System.out.println(list);

	}
}
