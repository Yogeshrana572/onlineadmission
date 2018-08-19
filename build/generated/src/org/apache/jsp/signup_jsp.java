package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    function myFunction() {\n");
      out.write("    var x = document.getElementById(\"myinput\");\n");
      out.write("    if (x.type === \"password\") {\n");
      out.write("        x.type = \"text\";\n");
      out.write("    } else {\n");
      out.write("        x.type = \"password\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form style=\"margin: auto; width: 50%;\" >\n");
      out.write("            <h1 style=\"text-align: center; border: 2px solid black; font-family: sans-serif, arial, verdana; background-color: whitesmoke\">\n");
      out.write("                Student Registration</h1>\n");
      out.write("            <input type=\"text\" name=\"fname\" placeholder=\"First Name\" class=\"form-control\" required=\"Mandatory to fill\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"lname\" placeholder=\"last Name\" class=\"form-control\" required=\"Mandatory to fill\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"Email\" name=\"mail\" placeholder=\"Email id\" class=\"form-control\" required=\"Mandatory to fill\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" name=\"pass\" placeholder=\"Password\" class=\"form-control\" id=\"myinput\" required=\"Mandatory to fill\">\n");
      out.write("            <input type=\"checkbox\" onclick=\"myFunction()\">Show Password\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"number\" name=\"cont\" placeholder=\"Mobile number\" class=\"form-control\" required=\"Mandatory to fill\">\n");
      out.write("            <br>\n");
      out.write("            <textarea name=\"address\" placeholder=\"Address\" class=\"form-control\" required=\"Mandatory to fill\"></textarea>\n");
      out.write("            <br>\n");
      out.write("            <button class=\"btn btn-success\" style=\"position: relative; left: 350px;\"> Submit </button>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
