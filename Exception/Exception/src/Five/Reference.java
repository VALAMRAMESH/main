package Five;

import java.time.LocalTime;

public class Reference {
	public static void main(String[] args) {
		// create a LocalTime object

		LocalTime time = LocalTime.now();

		// get Hour field using getHour()
		int Hour = time.getHour();

		// print result
		System.out.println("Hour Field: " + Hour);
	}
}
