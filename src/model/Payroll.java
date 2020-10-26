/**
 * 
 */
package model;

/**
 * @author debrax
 *
 */
public class Payroll {

	private static final int BASE_SALARY[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };
	private int idPayroll;
	private String dni;
	private int salary;

	public int salary(int category, int years) {
		int salary;
		int baseSalary = BASE_SALARY[category - 1];

		salary = baseSalary + (5000 * years);

		return salary;
	}
}
