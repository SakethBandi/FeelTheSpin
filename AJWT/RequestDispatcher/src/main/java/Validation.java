import java.io.*;   
import javax.servlet.*;  
import javax.servlet.http.*;      
@SuppressWarnings("serial")
public class Validation extends HttpServlet 
{    
   public void doGet(HttpServletRequest request, HttpServletResponse response) 
       throws ServletException, IOException 
   {        
       response.setContentType("text/html");      
       PrintWriter pwriter = response.getWriter();                
       String name=request.getParameter("uname");      
       String pass=request.getParameter("upass"); 
               
       if(name.equals("Saketh") && 
          pass.equals("A0510"))
       {    
      
          RequestDispatcher dis=request.getRequestDispatcher("welcome");          
          dis.forward(request, response);  
    
       }     
       else
       {     
 
          pwriter.print("Incorrect User name or password!");          
          RequestDispatcher dis=request.getRequestDispatcher("index.html");          
          dis.include(request, response);                                
       }      
   }    
}