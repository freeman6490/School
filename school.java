package school.manage;

import java.util.List;

/*
 * school can have many teachers, students, etc.
 * so we can use ArrayList instead...for when you dont know the number of something from the start
 *
 */
public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School (List<Teacher>teachers, List<Student>students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	//returns list of teachers in the school
	public List<Teacher> getTeachers() {
		return teachers;
	}
	//
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudent() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	//total money earned by the school
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	//adds total money earned
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	//money spent by the school...salary, rent, etc. 
	public static void updateTotalMoneySpent(int totalMoneySpent) {
		totalMoneyEarned -= totalMoneySpent;
	}
}
