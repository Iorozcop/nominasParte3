package modelos;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public class Persona {
	
	// Atributos
	
	public String nombre;
	public String dni;
	public char sexo;
	
	
	// Constructores sobrecargados
	
	/**Constructor que recibe nombre, dni y sexo
	 * 
	 * @param nombre
	 * @param dni
	 * @param sexo
	 * @throws DatosNoCorrectosException
	 */
	public Persona(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
		
		this.nombre = nombre;
		setDni(dni);
		comprobarSexo(sexo);	
	}
	
	/**Constructor que recibe nombre y sexo
	 * 
	 * @param nombre
	 * @param sexo
	 * @throws DatosNoCorrectosException
	 */
	public Persona(String nombre, char sexo) throws DatosNoCorrectosException {
		
		this.nombre = nombre;
		comprobarSexo(sexo);
	}


	// métodos
	

	/**
	 * Método para cambiar el dni de una persona
	 * @param dni
	 * @throws DatosNoCorrectosException 
	 */

	public void setDni(String dni) throws DatosNoCorrectosException {
		
		if (dni.length()<9 || dni.length()>9) {
			throw new DatosNoCorrectosException("Datos no correctos");
			
		}else if(dni.codePointAt(8) < 65 || dni.codePointAt(8) > 90 ) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
			this.dni= dni;
		}
	}
	
	/**Método para comprobar si el dato introducido en sexo es correcto
	 * 
	 * @param sexo
	 * @throws DatosNoCorrectosException
	 */
	public void comprobarSexo(char sexo) throws DatosNoCorrectosException {
		if(sexo == 'M' || sexo == 'F') {
			this.sexo= sexo;	
		}else {
			throw new DatosNoCorrectosException("Datos no correctos");
		}
	}

	/**Método para impirmir el nombre y el dni
	 * 
	 */	
	public void imprime() {
		System.out.println("Persona [nombre=" + nombre + ", dni=" + dni + "]");
		}

	
}
