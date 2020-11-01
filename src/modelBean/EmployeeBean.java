/**
 * 
 */
package modelBean;

import model.Employee;

/**
 * @author debrax
 *
 */
public class EmployeeBean extends PersonBean {

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
	public EmployeeBean() {
		super();
	}

	public EmployeeBean(String name, String dni, char sex, int idEmployee, int category, int years) {
		super(name, dni, sex);
		this.idEmployee = idEmployee;
		this.category = category;
		this.years = years;
	}
	
	public EmployeeBean(Employee employee) {
		super(employee.getName(), employee.getDni(), employee.getSex());
		this.idEmployee = employee.getIdEmployee();
		this.category = employee.getCategory();
		this.years = employee.getYears();
	};

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

}
