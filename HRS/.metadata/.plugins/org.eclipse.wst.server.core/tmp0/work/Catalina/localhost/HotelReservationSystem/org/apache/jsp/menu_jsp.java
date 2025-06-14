/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.102
 * Generated at: 2025-05-27 20:44:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>호텔 회원가입 시스템</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body { font-family: Arial, sans-serif; text-align: center; margin: 30px; }\r\n");
      out.write("        img.logo { width: 200px; }\r\n");
      out.write("        img.room { width: 200px; margin-top: 20px; border-radius: 10px; }\r\n");
      out.write("        ul { list-style-type: none; padding: 0; }\r\n");
      out.write("        li { margin: 15px 0; font-size: 18px; }\r\n");
      out.write("        a { text-decoration: none; color: #3366cc; font-weight: bold; }\r\n");
      out.write("                body {\r\n");
      out.write("            background-color: #f0f0f0; /* 연한 회색 배경 */\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("        img.logo {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("        }\r\n");
      out.write("        img.room {\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        ul {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        li {\r\n");
      out.write("            margin: 15px 0;\r\n");
      out.write("        }\r\n");
      out.write("        a {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            background-color: #444444;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            transition: background-color 0.2s ease;\r\n");
      out.write("        }\r\n");
      out.write("        a:hover {\r\n");
      out.write("            background-color: #222222;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <img src=\"images/hotel.jpg\" alt=\"호텔 로고\" class=\"logo\">\r\n");
      out.write("    <h1>호텔 회원가입 시스템</h1>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"register.jsp\">회원가입</a></li>\r\n");
      out.write("        <li><a href=\"deleteAccount.jsp\">회원 탈퇴</a></li>\r\n");
      out.write(" 		<li><a href=\"findAccount.jsp\">아이디 비밀번호 찾기</a></li>   \r\n");
      out.write("    </ul>\r\n");
      out.write("    <img src=\"images/hotel2.jpg\" alt=\"객실 사진\" class=\"room\">\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
