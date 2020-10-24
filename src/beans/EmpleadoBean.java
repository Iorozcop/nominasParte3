package beans;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

import java.io.Serializable;


public class EmpleadoBean implements Serializable {

	private int categoria =1;
	private int anyosTrabajados =0;
	private String nombre;
	private String dni;
	private char sexo;
	
	
	public EmpleadoBean() {
		
	}
	
	public EmpleadoBean(String nombre, String dni, char sexo, int categoria, int anyosTrabajados) {
		
		this.nombre=nombre;
		this.dni=dni;
		this.sexo=sexo;
		this.categoria=categoria;
		this.anyosTrabajados=anyosTrabajados;
		
	}

	/**
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the anyosTrabajados
	 */
	public int getAnyosTrabajados() {
		return anyosTrabajados;
	}

	/**
	 * @param anyosTrabajados the anyosTrabajados to set
	 */
	public void setAnyosTrabajados(int anyosTrabajados) {
		this.anyosTrabajados = anyosTrabajados;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}

