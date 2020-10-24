package servicios;

import java.util.ArrayList;

import beans.EmpleadoBean;
import beans.NominaBean;
import modelos.Empleado;
import modelos.Nomina;
import persistencia.ImplementIDao;

public class Servicio implements IServicio{

	/**
	 * M�todo para crear una lista de empleados y pasarla a un array de empleadoBean
	 * @return
	 */
	public ArrayList<EmpleadoBean> lista() {
		
		ImplementIDao imp = new ImplementIDao();
		ArrayList<Empleado> empleados = imp.listaEmpleados();
		ArrayList<EmpleadoBean> listaEmpBean = new ArrayList<EmpleadoBean>();
		
		for (Empleado empleado : empleados) {
			EmpleadoBean empBean = new EmpleadoBean(empleado.getNombre(),empleado.getDni(),empleado.getSexo(),empleado.getCategoria(),empleado.getAnyosTrabajados());
			
			listaEmpBean.add(empBean);
		}
		
		return listaEmpBean;
	}
	
	/**
	 * M�todo para recibir un dni, calcular salario y almacenarlo en objeto Nomina
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
