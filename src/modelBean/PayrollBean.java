package modelBean;

import model.Payroll;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase PayrollBean que implementa el objeto Bean que representa a la
 *         nómina de un empleado.
 */
public class PayrollBean {

	// ATTRIBUTES:
	/** Biblioteca de sueldos base */
	private static final int BASE_SALARY[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };
	/** Id de la nómina */
	private int idPayroll;
	/** DNI del empleado */
	private String dni;
	/** Sueldo del empleado */
	private int salary;

	// CONSTRUCTORS:
	/**
	 * Constructor sobrecargado que recibe por parámetros el DNI y el sueldo de un
	 * empleado.
	 * 
	 * @param dni    El DNI del empleado
	 * @param salary El sueldo del empleado
	 */
	public PayrollBean(String dni, int salary) {
		super();
		this.dni = dni;
		this.salary = salary;
	}

	/**
	 * Constructor sobrecargado que recibe por parámetros un objeto de tipo Payroll
	 * a partir del cual inicializa todos sus atributos.
	 * 
	 * @param payroll
	 */
	public PayrollBean(Payroll payroll) {
		super();
		this.dni = payroll.getDni();
		this.salary = payroll.getSalary();
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

	// SALARY CALC METHOD:
	/**
	 * Método que calcula el sueldo de un empleado a partir del sueldo base
	 * correspondiente según su categoría y teniendo en cuenta la antiguedad de
	 * dicho empleado
	 * 
	 * @param category La categoría del empleado
	 * @param years Los años trabajados por el empleado
	 * @return salary El sueldo del empleado
	 */
	public int salary(int category, int years) {
		int salary;
		int baseSalary = BASE_SALARY[category - 1];

		salary = baseSalary + (5000 * years);

		return salary;
	}
}
