/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-06-06 19:01:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Add Employee</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Segoe UI', sans-serif;\r\n");
      out.write("            background: linear-gradient(to right, #74ebd5, #ACB6E5);\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-container {\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            padding: 30px 40px;\r\n");
      out.write("            border-radius: 12px;\r\n");
      out.write("            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);\r\n");
      out.write("            width: 400px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            margin-bottom: 25px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("            color: #444;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"text\"],\r\n");
      out.write("        input[type=\"number\"] {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px 10px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            transition: border 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input:focus {\r\n");
      out.write("            border-color: #2980b9;\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px;\r\n");
      out.write("            background-color: #3498db;\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button:hover {\r\n");
      out.write("            background-color: #2c80b4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .back-link {\r\n");
      out.write("            display: block;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 15px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #2980b9;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .back-link:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"form-container\">\r\n");
      out.write("        <h2>Add New Employee</h2>\r\n");
      out.write("        <form method=\"post\" action=\"addEmployee\">\r\n");
      out.write("            <label for=\"name\">Name:</label>\r\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" required />\r\n");
      out.write("\r\n");
      out.write("            <label for=\"age\">Age:</label>\r\n");
      out.write("            <input type=\"number\" id=\"age\" name=\"age\" required />\r\n");
      out.write("\r\n");
      out.write("            <label for=\"department\">Department:</label>\r\n");
      out.write("            <input type=\"text\" id=\"department\" name=\"department\" required />\r\n");
      out.write("\r\n");
      out.write("            <label for=\"salary\">Salary:</label>\r\n");
      out.write("            <input type=\"number\" id=\"salary\" step=\"0.01\" name=\"salary\" required />\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\">Add Employee</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        <a href=\"viewEmployees\" class=\"back-link\">⬅ Back to Dashboard</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
