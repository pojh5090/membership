/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.103
 * Generated at: 2020-04-06 07:01:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("\t<title>JSP Ajax 실시간 회원제 채팅 서비스</title>\r\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		if (userID != null) {
			session.setAttribute("messageType", "오류메시지");
			session.setAttribute("messageContent", "이미 로그인이 되어있는 상태입니다.");
			response.sendRedirect("index.jsp");
			return;
		}
	
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"collapse\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\r\n");
      out.write("\t\t\t\taria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\">실시간 회원제 채팅 서비스</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">메인</a>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t");

				if(userID == null) {						
			
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\">접속하기<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"join.jsp\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<form method=\"post\" action=\"./userLogin\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered table-hover\" style=\"text-align: center; border: 1px solid #dddddd\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\"><h4>로그인 양식</h4></th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 110px;\"><h5>아이디</h5></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"form-control\" type=\"text\" name=\"userID\" maxlength=\"20\" placeholder=\"아이디를 입력하세요.\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 110px;\"><h5>비밀번호</h5></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input class=\"form-control\" type=\"password\" name=\"userPassword\" maxlength=\"20\" placeholder=\"비밀번호를 입력하세요.\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"text-align: left\" colspan=\"2\"><input class=\"btn btn-primary pull-right\" type=\"submit\" value=\"로그인\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

			String messageContent = null;
			if(session.getAttribute("messageContent") != null) {
				messageContent = (String) session.getAttribute("messageContent");
			}
			String messageType = null;
			if(session.getAttribute("messageType") != null) {
				messageType = (String) session.getAttribute("messageType");
			}
			if(messageContent != null) {
		
      out.write("\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"messageModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"vertical-alignment-helper\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-dialog vertical-align-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-content ");
 if(messageType.equals("오류 메시지")) out.println("panel-warning"); else out.println("panel-success"); 
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Close</span>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( messageType );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( messageContent );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">확인</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$('#messageModal').modal(\"show\");\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t");
 
			session.removeAttribute("messageContent");
			session.removeAttribute("messageType");
			}
		
      out.write("\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"checkModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"vertical-alignment-helper\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-dialog vertical-align-center\">\r\n");
      out.write("\t\t\t\t\t<div id=\"checkType\" class=\"modal-content pannel-info\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-header panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Close</span>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"modal-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t확인 메시지\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"checkMessage\" class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">확인</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
