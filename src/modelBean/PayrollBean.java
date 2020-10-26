/**
 * 
 */
package modelBean;

/**
 * @author debrax
 *
 */
public class PayrollBean {

	private static final int BASE_SALARY[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };
	private int idPayroll;
	private String dni;
	private int salary;

	// CONSTRUCTOR USING FIELDS:
	/**
	 * @param dni
	 * @param salary
	 */
	public PayrollBean(String dni, int salary) {
		super();
		this.dni = dni;
		this.salary = salary;
	}

	// GETTERS & SETTERS:
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int salary(int category, int years) {
		int salary;
		int baseSalary = BASE_SALARY[category - 1];

		salary = baseSalary + (5000 * years);

		return salary;
	}
}
