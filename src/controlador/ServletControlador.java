package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.EmpleadoBean;
import beans.NominaBean;
import servicios.IServicio;
import servicios.Servicio;



/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// nos devuelve el action del form que tenemos en el index.jsp
		
				String action= (String) request.getParameter("action");
				
				if(action != null) {
				System.out.println(action);
				
				switch (action) {
				case "1":	
					infoEmpleados(request, response);
					break;
				case "2":
					mostrarSalario(request,response);
					//request.getRequestDispatcher("/vista/error.jsp").forward(request, response);
					break;
				case "3":
					request.getRequestDispatcher("/vista/busquedaEmpleado.jsp").forward(request, response);
				    break;
				default:
					break;
				}
			}else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
				
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action= request.getParameter("action");
		switch (action) {
		case "Consultar":
				consultarSalario(request, response);
			break;
		case "nombre":
			request.getRequestDispatcher("/vista/error.jsp").forward(request, response);
		break;
		case "dni":
			request.getRequestDispatcher("/vista/error.jsp").forward(request, response);
		break;
		case "sexo":
			request.getRequestDispatcher("/vista/error.jsp").forward(request, response);
		break;
		case "categoria":
			request.getRequestDispatcher("/vista/error.jsp").forward(request, response);
		break;
		case "anyos":
			request.getRequestDispatcher("/vista/error.jsp").forward(request, response);
		break;	
		default:
			break;
		}

	}

// MÉTODOS
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void infoEmpleados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Desde un nuevo servicio llamamos al metodo lista() que devuelve un arrayList de 
		//empleadosBean que es lo que mandamos a la vista
	
		IServicio servicio = new Servicio();
		ArrayList<EmpleadoBean> empleados = servicio.lista();
		
		
		request.setAttribute("empleado", empleados);
		
		request.getRequestDispatcher("/vista/mostrarInfoEmpleados.jsp").forward(request, response);
	}
	
	private void mostrarSalario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setAttribute("error", ""); //esta página espera una variable error, de momento se la pasamos vacía
		request.getRequestDispatcher("/vista/formularioDni.jsp").forward(request, response);
		
	}
	
	private void consultarSalario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IServicio servicio = new Servicio();
		String error= "";
		
		String DNI =request.getParameter("dni");
		
		if(DNI =="") {
			error = "El DNI no puede estar vacío";
			request.setAttribute("error", error);
			request.getRequestDispatcher("/vista/formularioDni.jsp").forward(request, response);
		}		
			NominaBean nomBean = servicio.salario(DNI);					
			
			if(nomBean == null) {
				
				error = "No existe el dni";
				request.setAttribute("error", error);
				request.getRequestDispatcher("/vista/formularioDni.jsp").forward(request, response);
			}
			
			request.setAttribute("nomina", nomBean);
			request.getRequestDispatcher("/vista/mostrarSalario.jsp").forward(request, response);
				
		}
	
}
