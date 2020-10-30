/**
 * 
 */
package model;

/**
 * @author debrax
 *
 */
public class Payroll {

	private int idPayroll;
	private String dni;
	private int salary;

	// CONSTRUCTOR USING ALL FIELDS:
	/**
	 * @param idPayroll
	 * @param dni
	 * @param salary
	 */
	public Payroll(int idPayroll, String dni, int salary) {
		super();
		this.idPayroll = idPayroll;
		this.dni = dni;
		this.salary = salary;
	}

	// CONSTRUCTOR USING FIELDS:
	/**
	 * @param dni
	 * @param salary
	 */
	public Payroll(String dni, int salary) {
		super();
		this.dni = dni;
		this.salary = salary;
	}

	// GETTERS & SETTERS:
	/**
	 * @return the idPayroll
	 */
	public int getIdPayroll() {
		return idPayroll;
	}

	/**
	 * @param idPayroll the idPayroll to set
	 */
	public void setIdPayroll(int idPayroll) {
		this.idPayroll = idPayroll;
	}

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

	// TOSTRING:	
	@Override
	public String toString() {
		return "Payroll [idPayroll=" + idPayroll + ", dni=" + dni + ", salary=" + salary + "]";
	}

}
