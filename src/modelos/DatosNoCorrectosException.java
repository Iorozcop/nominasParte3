package modelos;

/**
 * 2DAW - ejercicio n�minas
 * 
 * @author Isabel Orozco
 * 
 */

public class DatosNoCorrectosException extends Exception {
	
	/**M�todo que recibe un mensaje de error
	 * 
	 * @param msg
	 */
	public DatosNoCorrectosException(String msg) {
		super(msg);	
		}
}
