package one;

public class StudentResult {

	int mathMarks;
	int scienceMarks;
	int englishMarks;
	int chemistryMarks;

	public StudentResult(int mathMarks, int scienceMarks, int englishMarks, int chemistryMarks) {
		super();
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.englishMarks = englishMarks;
		this.chemistryMarks = chemistryMarks;
	}

	@Override
	public String toString() {
		return "StudentResult [mathMarks=" + mathMarks + ", scienceMarks=" + scienceMarks + ", englishMarks="
				+ englishMarks + ", chemistryMarks=" + chemistryMarks + "]";
	}

}
