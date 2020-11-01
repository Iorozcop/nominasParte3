package servicios;

import java.util.ArrayList;

import beans.EmpleadoBean;
import beans.NominaBean;
import modelos.Empleado;
import modelos.Nomina;
import persistencia.ImplementIDao;


/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public class Servicio implements IServicio{

	/**
	 * Método para crear una lista de empleados y pasarla a un array de empleadoBean
	 * @return
	 */
	public ArrayList<EmpleadoBean> lista(String nombre, String dni, char sexo, int categoria, int anyosTrabajados) {
		
		ImplementIDao imp = new ImplementIDao();
		
		ArrayList<Empleado> empleados = imp.busqueda(nombre, dni, sexo, categoria, anyosTrabajados);
		ArrayList<EmpleadoBean> listaEmpBean = new ArrayList<EmpleadoBean>();
		
		for (Empleado empleado : empleados) {
			EmpleadoBean empBean = new EmpleadoBean(empleado.getNombre(),empleado.getDni(),empleado.getSexo(),empleado.getCategoria(),empleado.getAnyosTrabajados());
			
			listaEmpBean.add(empBean);
		}
		
		return listaEmpBean;
	}
	
	/**
	 * Método para recibir un dni, calcular salario y almacenarlo en objeto Nomina
	 * que luego se pasa a un objeto NominaBean
	 * @return
	 */
	public NominaBean salario(String dni) {
		
		NominaBean nomBean= null;
		ImplementIDao imp = new ImplementIDao();
		Nomina nom = imp.mostrarSalario(dni);
		
		if(nom!= null) {
			nomBean = new NominaBean(nom);
		}
		
		return nomBean;
	}
}
