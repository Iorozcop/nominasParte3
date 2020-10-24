package persistencia;

import java.util.ArrayList;

import modelos.Empleado;
import modelos.Nomina;

public interface iDao {
	
	public ArrayList<Empleado> listaEmpleados();
	public Nomina mostrarSalario(String dni);
	public ArrayList<Empleado> busquedaPorDni(String dni);

}

