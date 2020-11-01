package servicios;

import java.util.ArrayList;
import beans.EmpleadoBean;
import beans.NominaBean;


/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public interface IServicio {

	public ArrayList<EmpleadoBean> lista(String nombre, String dni, char sexo, int categoria, int anyosTrabajados);

	public NominaBean salario(String dni);
	
}
