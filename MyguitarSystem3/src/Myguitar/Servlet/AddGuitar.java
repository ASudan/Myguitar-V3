package Myguitar.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Myguitar.Dao.DaoFactory;
import Myguitar.Dao.IGuitarDaoFactory;
import Myguitar.Model.Guitar;
import Myguitar.Model.GuitarSpec;


/**
 * Servlet implementation class AddGuitar
 */
@WebServlet("/AddGuitar")
public class AddGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");


		
		String serialNumber = request.getParameter("serialNumber");
		String price = request.getParameter("price");
		String builder = request.getParameter("builder");
		String type = request.getParameter("type");
		String backWood = request.getParameter("backWood");
		String topWood = request.getParameter("topWood");

		System.out.println(builder);
		System.out.println(type);
		System.out.println(price);

		Guitar guitar = new Guitar();
		GuitarSpec guitarspec = new GuitarSpec();
		
		guitar.setSerialNumber(serialNumber);
		guitar.setPrice(price);
		guitarspec.setBuilder(builder);
		guitarspec.setType(type);
		guitarspec.setBackWood(backWood);
		guitarspec.setTopWood(topWood);
		guitar.setSpec(guitarspec);
		
		IGuitarDaoFactory dao = DaoFactory.createGuitarDao();
		dao.addGuitar(guitar);
		request.setAttribute("list", dao.searchallGuitar());
		request.getRequestDispatcher("Addguitar.jsp").forward(request, response);

	}		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
