import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
@SuppressWarnings({ "unused", "serial" })
public class DemoServlet extends GenericServlet {

  protected String myParam = null;
   

  public void init(ServletConfig servletConfig) throws ServletException{

    this.myParam = servletConfig.getInitParameter("anvesh"); // parameter value is retrived with name

  }

  public void service(ServletRequest request, ServletResponse response)
        throws ServletException, IOException {

    response.getWriter().write("<html><body>parmValue = " +
            this.myParam + "</body></html>");
  }
}
