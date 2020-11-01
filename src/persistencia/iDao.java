package persistencia;

import java.util.ArrayList;

import modelos.Empleado;
import modelos.Nomina;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public interface iDao {
	
	//public ArrayList<Empleado> listaEmpleados();
	public ArrayList<Empleado> busqueda(String nombre, String dni, char sexo, int categoria, int anyosTrabajados);
	public Nomina mostrarSalario(String dni);
	public ArrayList<Empleado> busquedaPorDni(String dni);

}

