import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 

  
@SuppressWarnings("serial")
public class DemoServlet extends HttpServlet {

	
   @SuppressWarnings("unused")
protected void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException 
   {

      response.setContentType("text/html;charset=UTF-8");
      PrintWriter pwriter = response.getWriter();

      
	ServletConfig configuration = getServletConfig();
       ServletContext sc=configuration.getServletContext();

      String sName = sc.getInitParameter("uname");
      String sPassword = sc.getInitParameter("upass");
	
	
		String username = request.getParameter("txtuser");
		String password = request.getParameter("txtpass");

		

		if(username.equals(sName)&&password.equals(sPassword))
		{
			response.getWriter().print("Valid user!");
		}
		else
		{
			response.getWriter().print("InValid username or password");
		}


   }
}
