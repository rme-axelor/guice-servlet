package com.axelor.guice.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.inject.Singleton;

@Singleton
public class Servlet2 extends HttpServlet {

  /** */
  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    PrintWriter pw = resp.getWriter();
    pw.println("Inside another servlet");

    pw.println(req.getMethod());

    super.service(req, resp);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.err.println("Hi");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String username = req.getParameter("username");
    String password = req.getParameter("password");

    System.out.println("username: " + username);
    System.out.println("password: " + password);

    // do some processing here...

    // get response writer
    PrintWriter writer = resp.getWriter();

    // build HTML code
    String htmlRespone = "<html>";
    htmlRespone += "<h2>Your username is: " + username + "<br/>";
    htmlRespone += "Your password is: " + password + "</h2>";
    htmlRespone += "</html>";

    // return response
    writer.println(htmlRespone);
  }
}
