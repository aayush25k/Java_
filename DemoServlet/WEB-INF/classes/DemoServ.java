import jakarta.servlet.*;
import java.io.*;
public class DemoServ extends GenericServlet{

  @Override
  public void service(ServletRequest req, ServletResponse res ) throws ServletException,IOException{

    PrintWriter pw = res.getWriter();
    pw.println("Hello Aayush Keshri.. Congrats...You have successfully made your first Sevlet Project");
    pw.close();
  }

  @Override
  public void init() throws ServletException{

  }

  @Override
  public void destroy(){

  }
}