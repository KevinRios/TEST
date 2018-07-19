package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template_superior.jsp", out, false);
      out.write("       \n");
      out.write("            <h1> Formulario</h1>\n");
      out.write("\n");
      out.write("            <form id=\"formPersona\" method=\"post\" action=\"AltaPersonaServlet\" class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nombre\" class=\"col-sm-2 control-label\">Nombre</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input name=\"nombre\" type=\"text\" class=\"form-control\" id=\"nombre\" placeholder=\"Nombre\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"apellido\" class=\"col-sm-2 control-label\">Apellido</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input name=\"apellido\" type=\"text\" class=\"form-control\" id=\"apellido\" placeholder=\"Apellido\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input name=\"email\" type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"localidad\" class=\"col-sm-2 control-label\">Localidad</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <select name=\"localidad\" class=\"form-control\" id=\"localidad\">\n");
      out.write("                            <option>1</option>\n");
      out.write("                            <option>2</option>\n");
      out.write("                            <option>3</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"notas\" class=\"col-sm-2 control-label\">Notas</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <textarea name=\"notas\" class=\"form-control\" id=\"notas\" rows=\"3\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"sueldo\" class=\"col-sm-2 control-label\">Sueldo</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input name=\"sueldo\" type=\"text\" class=\"form-control\" id=\"apellido\" placeholder=\"Sueldo\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template_inferior.jsp", out, false);
      out.write("    ");
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
