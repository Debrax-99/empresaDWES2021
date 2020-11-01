/**
 * 
 */
package model;

/**
 * @author debrax
 *
 */
public class Employee extends Person {

	// ATTRIBUTES:
	private int idEmployee;
	/** Categoría del empleado */
	private int category;
	/** Años trabajados por el empleado */
	private int years;

	/**
	 * Constructor genérico.
	 */
	// CONSTRUCTOR:
	public Employee() {
		super();
	}

	public Employee(int idEmployee, String name, String dni, char sex, int category, int years) {
		super(name, dni, sex);
		this.idEmployee = idEmployee;
		this.category = category;
		this.years = years;
	}

	// GETTERS & SETTERS:
	/**
	 * @return the idEmployee
	 */
	public int getIdEmployee() {
		return idEmployee;
	}

	/**
	 * @param idEmployee the idEmployee to set
	 */
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * @return the year
	 */
	public int getYears() {
		return years;
	}

	/**
	 * @param year the year to set
	 */
	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", category=" + category + ", years=" + years + super.toString()
				+ "]";
	}

}
