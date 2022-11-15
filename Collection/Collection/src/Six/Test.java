package Six;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	// This map stores unsorted values
	static Map<String, Integer> map = new HashMap<>();

	// Function to sort map by Key
	public static void sortbykey() {
		// TreeMap to store values of HashMap
		TreeMap<String, Integer> sorted = new TreeMap<>();

		// Copy all data from hashMap into TreeMap
		sorted.putAll(map);

		// Display the TreeMap which is naturally sorted
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	// Driver Code
	public static void main(String args[]) {
		// putting values in the Map
		map.put("Pune", 5000);
		map.put("Mumbai", 4000);
		map.put("Shegaon", 8000);
		map.put("Nagpur", 3000);
		map.put("Nashik", 9000);

		// Calling the function to sortbyKey
		sortbykey();

	}
}
