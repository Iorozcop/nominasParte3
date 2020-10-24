package modelos;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public class DatosNoCorrectosException extends Exception {
	
	/**Método que recibe un mensaje de error
	 * 
	 * @param msg
	 */
	public DatosNoCorrectosException(String msg) {
		super(msg);	
		}
}
