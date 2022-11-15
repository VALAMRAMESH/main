package Five;


import java.util.Collections;
import java.util.Vector;

/* WAP to store data related to item in Vector and after that sort the data.*/ 
 
 
public class Test {

	public static void main(String[] args) {

		Vector<Items> v = new Vector<Items>();
		v.add(new Items(101, "pepsi", 90));
		v.add(new Items(105, "coke", 65));
		v.add(new Items(103, "Fanta", 80));
		v.add(new Items(102, "Redbull", 100));
		v.add(new Items(104, "Fruity", 30));

		Collections.sort(v, new IdComparator());

		for (Items i : v)

			System.out.println(
					"Items Id: " + i.getItemId() + "  Items NAME:  " + i.getName() + "  Item price:  " + i.getPrice());
	}

}
