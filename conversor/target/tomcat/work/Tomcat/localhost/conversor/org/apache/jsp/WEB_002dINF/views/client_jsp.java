/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-04-27 22:52:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Início</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 style=\"color: #5e9ca0;\">Bem vindo(a) à Ferramenta de Conversão Online!</h1>\r\n");
      out.write("\t<h2 style=\"color: #5e9ca0;\">Conversão de Euro para Iene e vice-versa.</h2>\r\n");
      out.write("\t<h3 style=\"color: #5e9ca0;\">Cotação utilizada: 27/04/2021</h3>\r\n");
      out.write("\t\r\n");
      out.write("\t<p>Exercício referente a composição da prova1 da Disciplina de Programação\r\n");
      out.write("\tAvançada para Web <br />Prof Msc Angelo F. Dias Gonçalves <br />\r\n");
      out.write("\tAluno:  Jennerson Barbosa <br />\r\n");
      out.write("\tP6-CC NOITE.&nbsp;</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<p>Clique no botão <span style=\"background-color: #5e9ca0; color: #fff; \r\n");
      out.write("\tdisplay: inline-block; padding: 3px 10px; font-weight: bold; border-radius: \r\n");
      out.write("\t5px;\">Acessar</span> para ir até a página.</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<p> <br /> </p>\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"http://localhost:9090/conversor/get\"><button style=\"background: #5e9ca0; \r\n");
      out.write("\tborder-radius: 6px; padding: 15px; cursor: pointer; color: #fff; border-radius: \r\n");
      out.write("\t5px; font-size: 16px; font-weight: bold\">ACESSAR</button></a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
