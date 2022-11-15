package one;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter marks in maths");

		int mathMarks = scanner.nextInt();

		if (mathMarks < 0) {
			throw new NegativeMarksException("Marks enter negative in number");
		}

		System.out.println("Enter marks in science");

		int scienceMarks = scanner.nextInt();

		if (scienceMarks < 0) {
			throw new NegativeMarksException("Marks enter negative in number");
		}

		System.out.println("Enter marks in english");

		int englishMarks = scanner.nextInt();

		if (englishMarks < 0) {
			throw new NegativeMarksException("Marks enter negative in number");
		}

		System.out.println("Enter marks in chemistry");

		int chemistryMarks = scanner.nextInt();

		if (chemistryMarks < 0) {
			throw new NegativeMarksException("Marks enter negative in number");
		}

		StudentResult sr = new StudentResult(mathMarks, scienceMarks, englishMarks, chemistryMarks);

		Student std = new Student(40, "Ram", "Pune", sr);

		System.out.println(std);

		if ((mathMarks & scienceMarks) < 40 || (scienceMarks & englishMarks) < 40
				|| (chemistryMarks & englishMarks) < 40 || (chemistryMarks & mathMarks) < 40
				|| (mathMarks & englishMarks) < 40 || (scienceMarks & chemistryMarks) < 40

		) {

			System.out.println("Student Failed in Exam");

		}
		int average = (mathMarks + scienceMarks + englishMarks + chemistryMarks) / 4;

		try {
			if (average < 40) {

				throw new FailException("Average is less than 40 percent");
			}

		}

		catch (Exception e) {
			System.out.println(e);

		}

	}
}
