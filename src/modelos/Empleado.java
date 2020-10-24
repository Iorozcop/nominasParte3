package modelos;

/**
 * 2DAW - ejercicio nóminas
 * 
 * @author Isabel Orozco
 * 
 */

public class Empleado extends Persona{
	
	//Atributos
	private int categoria =1;
	public int anyosTrabajados =0;
	

	//Constructores sobrecargados
	
	/**Constructor que recibe los atributos de Persona y los propios de Empleado
	 * 
	 * @param nombre
	 * @param dni
	 * @param sexo
	 * @param categoria
	 * @param anyosTrabajados
	 * @throws DatosNoCorrectosException
	 */
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyosTrabajados) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		
		setCategoria(categoria);
		setAnyosTrabajados(anyosTrabajados);
		
	}
	
	/**Constructor que recibe los atributos propios de Persona
	 * 
	 * @param nombre
	 * @param dni
	 * @param sexo
	 * @throws DatosNoCorrectosException
	 */

	public Empleado(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
	}


	//Métodos
	
	/**Método que devuelve el nombre
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**Método que devuelve el dni
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}
	
	/**Método que devuelve el sexo
	 * 
	 * @return
	 */
	public char getSexo() {
		return sexo;
	}
	
	/**Método que devuelve la categoría
	 * 
	 * @return
	 */
	public int getCategoria() {
		return categoria;
	}
	


	/**Método para cambiar la categoría
	 * 
	 * @param categoria
	 * @throws DatosNoCorrectosException 
	 */
	public void setCategoria(int categoria) throws DatosNoCorrectosException {
		if (categoria<=0 || categoria>10) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
			this.categoria= categoria;
		}
	}
	
	/**Método para modificar los años trabajados
	 * 
	 * @param anyosTrabajados
	 * @throws DatosNoCorrectosException 
	 */
	public void setAnyosTrabajados(int anyosTrabajados) throws DatosNoCorrectosException {
		if(anyosTrabajados<0) {
			throw new DatosNoCorrectosException("Datos no correctos");
		}else {
		this.anyosTrabajados = anyosTrabajados;
		}
	}
	
	/**Método para obtener los años trabajados de un empleado
	 * 
	 * @return
	 */
	public int getAnyosTrabajados() {
		return anyosTrabajados;
	}
	
	

	/**Método que incremente en uno los años trabajados
	 * 
	 * @throws DatosNoCorrectosException 
	 */
	public void incrAnyo() throws DatosNoCorrectosException {	
		setAnyosTrabajados(getAnyosTrabajados() +1);
	}
	
	/**Método que imprime todos los datos del empleado
	 * 
	 */
	
	@Override
	public void imprime() {
		System.out.println("categoria=" + categoria + "-anyosTrabajados=" + anyosTrabajados + "-nombre=" + nombre
				+ "-dni=" + dni + "-sexo=" + sexo ); 
	}

	
}

