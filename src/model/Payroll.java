package model;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase Payroll que implementa el objeto que representa a la nómina de
 *         un empleado.
 */
public class Payroll {

	// ATTRIBUTES:
	/** Id de la nómina */
	private int idPayroll;
	/** DNI del empleado */
	private String dni;
	/** Sueldo del empleado */
	private int salary;

	// CONSTRUCTORS:
	/**
	 * Constructor sobrecargado que recibe por parámetros todos los atributos de una
	 * nómina.
	 * 
	 * @param idPayroll El Id de la nómina
	 * @param dni       El DNI del empleado
	 * @param salary    El sueldo del empleado
	 */
	public Payroll(int idPayroll, String dni, int salary) {
		super();
		this.idPayroll = idPayroll;
		this.dni = dni;
		this.salary = salary;
	}

	/**
	 * Constructor sobrecargado que recibe por parámetros el DNI y el sueldo de un
	 * empleado.
	 * 
	 * @param dni    El DNI del empleado
	 * @param salary El sueldo del empleado
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

	// TO STRING:
	@Override
	public String toString() {
		return "Payroll [idPayroll=" + idPayroll + ", dni=" + dni + ", salary=" + salary + "]";
	}

}
