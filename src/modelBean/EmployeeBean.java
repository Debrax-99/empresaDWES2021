package modelBean;

import model.Employee;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase EmployeeBean que implementa el objeto Bean que representa a un empleado.
 */
public class EmployeeBean extends PersonBean {

	// ATTRIBUTES:
	/** Id del empleado */
	private int idEmployee;
	/** Categoría del empleado */
	private int category;
	/** Años trabajados por el empleado */
	private int years;

	// CONSTRUCTORS:
	/**
	 * Constructor genérico.
	 */
	public EmployeeBean() {
		super();
	}

	/**
	 * Constructor sobrecargado que recibe por parámetros todos los atributos de
	 * un empleado.
	 * 
	 * @param idEmployee El Id del empleado
	 * @param name       El nombre del empleado
	 * @param dni        El DNI del empleado
	 * @param sex        El sexo del empleado
	 * @param category   La categoría del empleado
	 * @param years      Los años trabajados por el empleado
	 */
	public EmployeeBean(String name, String dni, char sex, int idEmployee, int category, int years) {
		super(name, dni, sex);
		this.idEmployee = idEmployee;
		this.category = category;
		this.years = years;
	}

	/**
	 * Constructor sobrecargado que recibe por parámetros un objeto de tipo Employee
	 * a partir del cual inicializa todos sus atributos.
	 * 
	 * @param employee
	 */
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
