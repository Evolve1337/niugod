package top.flobby.requst;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Requst  extends HttpServlet {
 protected void   doGet(HttpServletRequest req, HttpServletResponse resp){
    System.out.println(req.getMethod());
     System.out.println(req.getRequestURI());
     System.out.println(req.getRequestURL());
 }

}
