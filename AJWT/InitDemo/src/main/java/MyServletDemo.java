import javax.servlet.http.*; 
import javax.servlet.*; 
import java.io.*; 
@SuppressWarnings("serial")
public class MyServletDemo extends HttpServlet{ 
   public void doGet(HttpServletRequest req,HttpServletResponse res) 
   throws ServletException,IOException 
   {  
     res.setContentType("text/html"); 
     PrintWriter pwriter=res.getWriter(); 

     String name = req.getParameter("uname");
     String age = req.getParameter("uage");
     pwriter.println("<br><br>");
     pwriter.println("<strong> Name: </strong> "+"<em>"+name+"</em>"); 
     pwriter.println("<br>");
     pwriter.println("<strong> Age: </strong> "+age); 
     pwriter.println("<br>");
     pwriter.close(); 
  }
}

