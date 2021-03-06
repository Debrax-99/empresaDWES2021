package model;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase Employee que implementa el objeto que representa a un empleado.
 */
public class Employee extends Person {

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
	public Employee() {
		super();
	}

	/**
	 * Constructor sobrecargado que recibe por parámetros todos los atributos de un
	 * empleado.
	 * 
	 * @param idEmployee El Id del empleado
	 * @param name       El nombre del empleado
	 * @param dni        El DNI del empleado
	 * @param sex        El sexo del empleado
	 * @param category   La categoría del empleado
	 * @param years      Los años trabajados por el empleado
	 */
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

	// TO STRING:
	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", category=" + category + ", years=" + years + super.toString()
				+ "]";
	}

}
