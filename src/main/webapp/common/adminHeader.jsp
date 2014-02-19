<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<header class="header">
     <a href="/" class="logo">
         <!-- Add the class icon to your logo image or logo icon to add the margining -->
         Wei Che Jian
     </a>
     <!-- Header Navbar: style can be found in header.less -->
     <nav class="navbar navbar-static-top" role="navigation">
         <!-- Sidebar toggle button-->
         <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
             <span class="sr-only">Toggle navigation</span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
         </a>
         <div class="navbar-right">
             <ul class="nav navbar-nav">
                 <!-- User Account: style can be found in dropdown.less -->
                 <li class="dropdown user user-menu">
                     <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                         <i class="glyphicon glyphicon-user"></i>
                         <span> <%= request.getAttribute("user") %> <i class="caret"></i></span>
                     </a>
                     <ul class="dropdown-menu">
                         <!-- User image -->
                         <li class="user-header bg-light-blue">
                             <img src="/public/images/logo.png" class="img-circle" alt="User Image">
                             <p>
                                 <%= request.getAttribute("user") %>
                                 <div>
                                 <% 
                                 SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                                 Date date = new Date();
								 %>
								 <%=s.format(date)%>
								 </div>
                             </p>
                         </li>
                         <!-- Menu Body -->
                         <li class="user-body">
                             <div class="col-xs-12 text-center">
                                 <a href="#">有疑问，需要帮助？</a>
                             </div>
                            
                         </li>
                         <!-- Menu Footer-->
                         <li class="user-footer">
                             <div class="pull-left">
                                 <a href="#" class="btn btn-default btn-flat">个人信息</a>
                             </div>
                             <div class="pull-right">
                                 <a href="/accounts/signout" class="btn btn-default btn-flat">注销</a>
                             </div>
                         </li>
                     </ul>
                 </li>
             </ul>
         </div>
     </nav>
 </header>