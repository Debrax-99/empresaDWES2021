/**
 * 
 */
package model;

/**
 * @author debrax
 *
 */
public class Person {

	// ATTRIBUTES:
	/** Nombre de la persona */
	private String name;
	/** DNI de la persona */
	private String dni;
	/** Género de la persona */
	private char sex;

	/**
	 * Constructor genérico
	 */
	// CONSTRUCTOR:
	public Person() {

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

	public Person(String name, String dni, char sex) {
		super();
		this.name = name;
		this.dni = dni;
		this.sex = sex;
	}
}
