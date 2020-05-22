package school.manage;

/*
 * this is the teacher class
 * This keeps track of all the teachers in a school
 * holds name, id, and salary
 */
public class Teacher {
	private int id;
	private int salary;
	private String name;
	private int salaryEarned;
	
	/*
	 * creates a new teacher object
	 * id, name, and slary of teacher are set below
	 */
	public Teacher(int id, int salary, String name) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/*
	 * get functions 'get' and return the values for each
	 * The ID for current teacher, name, and salary too
	 * 
	 * the set salary function assigns the values to salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return this.name;
	}
	public int getID() {
		return this.id;
	}	
	public int getSalary() {
		return this.salary;
	}
	
	//adds to the salary
	//removes from total money earned to the school
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
}
