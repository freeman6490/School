package school.manage;

import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		//each teacher is their own object
		//goes id, salary, name
		Teacher mike = new Teacher(1, 500, "Mike");
		Teacher melissa = new Teacher(2, 700, "Melissa");
		Teacher david = new Teacher(3, 900, "David");
		List <Teacher> teacherList = new ArrayList<>();
		teacherList.add(mike);
		teacherList.add(melissa);
		teacherList.add(david);
		//student goes id, name, year in school (grade)
		Student billy = new Student(1, "Billy", 10);
		Student luke = new Student(3, "Luke", 9);
		Student kathy = new Student(2, "Kathy", 11);
		List <Student> studentList = new ArrayList<>();
		studentList.add(billy);
		studentList.add(luke);
		studentList.add(kathy);
		
    //sets the school
		School PCHS = new School(teacherList, studentList);
		billy.payFees(5000);
		luke.payFees(7000);
		System.out.println("PCHS has earned $" + PCHS.getTotalMoneyEarned());
		System.out.println("-------------------");
		david.receiveSalary(david.getSalary());
		mike.receiveSalary(mike.getSalary());
		melissa.receiveSalary(melissa.getSalary());
    //say how much the school pays out
		System.out.printf("PCHS has paid %s, %s, and %s and now has %d dollars left"
				+ "",david.getName(), mike.getName(), melissa.getName(),PCHS.getTotalMoneyEarned());
	}

}
