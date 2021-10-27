public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private Student[] info;
	private int numStudents;

	public StudentScores() {
		info = new Student[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		info[numStudents] = new Student(name, score);
		numStudents++;
	}

	public String getHighest() {
		if (numStudents == 0)
			return null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (info[i].scores > info[highest].scores)
				highest = i;

		return info[highest].names;
	}

	public String getLowest() {
		if (numStudents == 0)
			return null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (info[i].scores < info[lowest].scores)
				lowest = i;

		return info[lowest].names;
	}
}
