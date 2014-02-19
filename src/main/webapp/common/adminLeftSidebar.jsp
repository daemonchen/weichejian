<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<aside class="left-side sidebar-offcanvas" style="min-height: 375px;">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/public/images/logo.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><%= session.getAttribute("user") %>，欢迎您</p>

                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="treeview <%if(session.getAttribute("controllerName").equals("/admin")){%>active <%}%>">
                <a href="#">
                    <i class="fa fa-dashboard"></i>
                    <span>账号设置</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li class= <%if(session.getAttribute("actionName").equals("mp_info")){%>active <%}%>>
                    	<a href="/admin/mp_info" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 微信公众 账号</a>
                    </li>
                    <li class= <%if(session.getAttribute("actionName").equals("show_change_pwd")){%>active <%}%>>
                    	<a href="/admin/show_change_pwd" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 修改密码</a>
                    </li>
                    <li class= <%if(session.getAttribute("actionName").equals("show_usr_info")){%>active <%}%>>
                    	<a href="/" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 修改个人信息</a>
                    </li>
                    <li class= <%if(session.getAttribute("actionName").equals("show_usr_permission")){%>active <%}%>>
                    	<a href="/" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 查看权限</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="/">
                    <i class="fa fa-calendar"></i> <span>基础模块</span>
                    <small class="badge pull-right bg-red">3</small>
                </a>
            </li>
            <li>
                <a href="/">
                    <i class="fa fa-envelope"></i> <span>微网站</span>
                    <small class="badge pull-right bg-yellow">12</small>
                </a>
            </li>
            
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>