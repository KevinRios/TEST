package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ar.com.KevinRios.java.objetos.Persona;
import java.util.ArrayList;

public final class listadoPersonas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template_superior.jsp", out, false);
      out.write("    \n");
      out.write("\n");
      out.write("    <h1>Lista Personas  </h1>\n");
      out.write("\n");
      out.write("    <form method=\"POST\" action=\"BuscarPersonasServlet\">\n");
      out.write("        <input type=\"text\" name= \"textoBuscar\" placeholder=\"Buscador...\">\n");
      out.write("        <button type=\"submit\"> Buscar </button>\n");
      out.write("    </form>\n");
      out.write("\n");

    ArrayList<Persona> personas = (ArrayList<Persona>) request.getAttribute("personas");

      out.write("\n");
      out.write("\n");
      out.write("<table class=\"table table-bordered table-hover table-striped\">\n");
      out.write("    <tr>\n");
      out.write("        <th> Id </th>\n");
      out.write("        <th> Nombre </th>\n");
      out.write("        <th> Apellido </th>\n");
      out.write("        <th> Email </th>\n");
      out.write("    </tr>\n");
      out.write("    ");
 for (Persona p : personas) { 
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td> ");
      out.print( p.getIdPersona());
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print( p.getNombre());
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print( p.getApellido());
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print( p.getEmail());
      out.write(" </td>\n");
      out.write("    </tr>\n");
      out.write("    ");
 } 
      out.write("   \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template_inferior.jsp", out, false);
      out.write("   \n");
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
