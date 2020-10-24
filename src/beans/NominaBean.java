package beans;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

import java.io.Serializable;

import modelos.Nomina;

public class NominaBean implements Serializable {

	private int sueldo;
	private String dni;
	
	public NominaBean(int sueldo, String dni) {
		this.sueldo=sueldo;
		this.dni=dni;
	}

	public NominaBean(Nomina nom) {
		this.dni = nom.getDni();
		this.sueldo = nom.getSueldo();
	}

	/**
	 * @return the sueldo
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
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
	
}

