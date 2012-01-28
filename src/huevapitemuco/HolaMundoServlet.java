package huevapitemuco;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class HolaMundoServlet extends HttpServlet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1818538424544555968L;

	public void doGet (HttpServletRequest req,
	                     HttpServletResponse res)
	    throws ServletException, IOException
	  {
	    PrintWriter out = res.getWriter();
	
	    out.println("Hello World!");
	    out.close();
	  }
}