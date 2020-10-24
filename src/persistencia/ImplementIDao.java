package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import modelos.Empleado;
import modelos.Nomina;



public class ImplementIDao implements iDao {

	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/nominas";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	
	/**
	 * Método para establecer conexión con la base de datos
	 * */
		public Connection conectar() {
			// creamos un objeto de tipo conexion
			Connection conexion = null;

			try {
				Class.forName(CONTROLADOR);
				conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
				System.out.println("------ Conexión establecida ------\n");

			} catch (ClassNotFoundException e) {
				System.out.println("Error al cargar el controlador");
				e.printStackTrace();

			} catch (SQLException e) {
				System.out.println("Error en la conexión");
				e.printStackTrace();
			}

			return conexion;
		}
		
		/** 
		 * Método que muestra un listado de empleados
		 * */
		public ArrayList<Empleado> listaEmpleados() {
			
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			
			try {
				Connection conexion = conectar();
				Statement consulta = conexion.createStatement();
				ResultSet rs = consulta.executeQuery("SELECT * FROM empleados");

				while (rs.next()) {
					
					Empleado emp = new Empleado(rs.getString(1),rs.getString(2),rs.getString(3).charAt(0) ,rs.getInt(4), rs.getInt(5));
					
					empleados.add(emp);

				}
			
				conexion.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			return empleados;
		}
		
		/** 
		 * Método que muestra el salario de un empleado pasandole dni por parametro
		 *@param String dni
		 * */
		public Nomina mostrarSalario(String dni) {
			
			Nomina nom = null;
			try {
				Connection conexion = conectar();
				Statement consulta = conexion.createStatement();
				ResultSet rs = consulta.executeQuery("SELECT * FROM nomina WHERE dni= '" + dni + "'");
				while (rs.next()) {
					nom = new Nomina(rs.getInt(1),rs.getString(2)); 
				}
				conexion.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			return nom;
		}
		
		/** 
		 * Método que muestra un listado de empleados
		 * */
		public ArrayList<Empleado> busquedaPorDni(String dni) {
			
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			
			try {
				Connection conexion = conectar();
				Statement consulta = conexion.createStatement();
				ResultSet rs = consulta.executeQuery("SELECT * FROM empleados WHERE dni= '" + dni + "'");

				while (rs.next()) {
					
					Empleado emp = new Empleado(rs.getString(1),rs.getString(2),rs.getString(3).charAt(0) ,rs.getInt(4), rs.getInt(5));
					
					empleados.add(emp);

				}
			
				conexion.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			return empleados;
		}
}
