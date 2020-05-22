package school.manage;

public class Student {

	private int grade, id, feesPaid, feesTotal;
	private String name;

	//constructor
	//creates a new student object by initializing the values
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	//does not alter students name or id in any way
	//so no need for a 'SetName' function
	/*
	 * used to update students grade...year in school
	 * @param grade = new grade of student
	 */
	public void setGrade(int grade) {
		this.grade = grade;	
	}
	public void payFees(int fees) {
		this.feesPaid = feesPaid + fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	public String getName() {
		return name;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public int getId() {
		return id;
	}
	public int getGrade() {
		return grade;
	}
	//returns the remaining fees left to pay
	public int getFeesLeft() {
		return feesTotal - feesPaid;
	}
	
}
