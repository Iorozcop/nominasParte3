package servicios;

import java.util.ArrayList;

import beans.EmpleadoBean;
import beans.NominaBean;

public interface IServicio {

	public ArrayList<EmpleadoBean> lista();

	public NominaBean salario(String dni);
	
}
