package modelBean;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase PersonBean que implementa el objeto Bean que representa a una persona.
 */
public class PersonBean {

	// ATTRIBUTES:
	/** Nombre de la persona */
	private String name;
	/** DNI de la persona */
	private String dni;
	/** Género de la persona */
	private char sex;

	// CONSTRUCTORS:
	/**
	 * Constructor genérico
	 */
	public PersonBean() {

	}

	/**
	 * Constructor sobrecargado que recibe por parámetros todos los atributos de una
	 * persona.
	 * 
	 * @param name Nombre de la persona
	 * @param dni  DNI de la persona
	 * @param sex  Género de la persona
	 */
	public PersonBean(String name, String dni, char sex) {
		super();
		this.name = name;
		this.dni = dni;
		this.sex = sex;
	}

	// GETTERS & SETTERS:
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

}
