import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class LifeCycle extends HttpServlet
{
public LifeCycle()
{
System.out.println("Default constructor");
}

public void init(ServletConfig config)
{
System.out.println("Init method...!");
}


public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
pw.println("LifeCycle of a service");
pw.close();
}

public void destroy()
{
System.out.println("Am from destroy method:");
}
}