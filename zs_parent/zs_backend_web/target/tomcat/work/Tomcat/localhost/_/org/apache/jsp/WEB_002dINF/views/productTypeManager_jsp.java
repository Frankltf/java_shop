/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-21 03:50:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productTypeManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <title>backend</title>\r\n");
      out.write("    <link rel=\"stylesheet\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/index.css\" />\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/userSetting.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"panel panel-default\" id=\"userSet\">\r\n");
      out.write("    <div class=\"panel-heading\">\r\n");
      out.write("        <h3 class=\"panel-title\">商品类型管理</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"panel-body\">\r\n");
      out.write("        <input type=\"button\" value=\"添加商品类型\" class=\"btn btn-primary\" id=\"doAddProTpye\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"show-list\">\r\n");
      out.write("            <table class=\"table table-bordered table-hover\" style='text-align: center;'>\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr class=\"text-danger\">\r\n");
      out.write("                    <th class=\"text-center\">编号</th>\r\n");
      out.write("                    <th class=\"text-center\">类型名称</th>\r\n");
      out.write("                    <th class=\"text-center\">状态</th>\r\n");
      out.write("                    <th class=\"text-center\">操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody id=\"tb\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>1</td>\r\n");
      out.write("                    <td>aaaa</td>\r\n");
      out.write("                    <td>启用</td>\r\n");
      out.write("                    <td class=\"text-center\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-warning btn-sm doProTypeModify\" value=\"修改\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-warning btn-sm doProTypeDelete\" value=\"删除\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-danger btn-sm doProTypeDisable\" value=\"禁用\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>1</td>\r\n");
      out.write("                    <td>aaaa</td>\r\n");
      out.write("                    <td>启用</td>\r\n");
      out.write("                    <td class=\"text-center\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-warning btn-sm doProTypeModify\" value=\"修改\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-warning btn-sm doProTypeDelete\" value=\"删除\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-success btn-sm doProDisable\" value=\"启用\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 添加商品类型 start -->\r\n");
      out.write("<div class=\"modal fade\" tabindex=\"-1\" id=\"ProductType\">\r\n");
      out.write("    <!-- 窗口声明 -->\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <!-- 内容声明 -->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <!-- 头部、主体、脚注 -->\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">添加商品类型</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <div class=\"row text-right\">\r\n");
      out.write("                    <label for=\"productTypeName\" class=\"col-sm-4 control-label\">类型名称：</label>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"productTypeName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button class=\"btn btn-primary addProductType\">添加</button>\r\n");
      out.write("                <button class=\"btn btn-primary cancel\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 添加商品类型 end -->\r\n");
      out.write("\r\n");
      out.write("<!-- 修改商品类型 start -->\r\n");
      out.write("<div class=\"modal fade\" tabindex=\"-1\" id=\"myProductType\">\r\n");
      out.write("    <!-- 窗口声明 -->\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <!-- 内容声明 -->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <!-- 头部、主体、脚注 -->\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">修改商品类型</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <div class=\"row text-right\">\r\n");
      out.write("                    <label for=\"proTypeNum\" class=\"col-sm-4 control-label\">编号：</label>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"proTypeNum\" readonly>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"row text-right\">\r\n");
      out.write("                    <label for=\"proTypeName\" class=\"col-sm-4 control-label\">类型名称</label>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"proTypeName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button class=\"btn btn-warning updateProType\">修改</button>\r\n");
      out.write("                <button class=\"btn btn-primary cancel\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 修改商品类型 end -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
