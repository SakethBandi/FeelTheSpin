import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import java.util.Enumeration; 
  
@SuppressWarnings({ "unused", "serial" })
public class DemoServlet extends GenericServlet {

  Enumeration<String> e=null;



  public void service(ServletRequest request, ServletResponse response)
        throws ServletException, IOException {

   ServletConfig sc=getServletConfig();
   e=sc.getInitParameterNames();

   PrintWriter pwriter = response.getWriter();

    String str;
      while(e.hasMoreElements()) {
        str=e.nextElement();
        pwriter.println("<br>Param Name: "+str);
        pwriter.println(" value: "+sc.getInitParameter(str));
  }
}
}
