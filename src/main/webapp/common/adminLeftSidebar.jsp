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
            <li class="treeview <%if(session.getAttribute("controllerName").toString().contains("admin/")){%>active <%}%>">
                <a href="#">
                    <i class="fa fa-dashboard"></i>
                    <span>账号设置</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li class= <%if(session.getAttribute("controllerName").equals("/admin/mpinfo")){%>active <%}%>>
                    	<a href="/admin/mpinfo" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 微信公众 账号</a>
                    </li>
                    <li class= <%if(session.getAttribute("controllerName").equals("/admin/updatePassword")){%>active <%}%>>
                    	<a href="/admin/updatePassword" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 修改密码</a>
                    </li>
                    <li class= <%if(session.getAttribute("controllerName").equals("/admin/userinfo")){%>active <%}%>>
                    	<a href="/admin/userinfo" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 修改个人信息</a>
                    </li>
                    <li class= <%if(session.getAttribute("controllerName").equals("/admin/permission")){%>active <%}%>>
                    	<a href="/admin/permission" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 查看权限</a>
                    </li>
                </ul>
            </li>
            <li class="treeview <%if(session.getAttribute("controllerName").toString().contains("modules/")){%>active <%}%>">
                <a href="#">
                    <i class="fa fa-gears"></i>
                    <span>基础模块</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li class= <%if(session.getAttribute("controllerName").equals("/modules/welcome")){%>active <%}%>>
                    	<a href="/modules/welcome" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 被添加自动回复</a>
                    </li>
                    <li class= <%if(session.getAttribute("controllerName").equals("/modules/keywords")){%>active <%}%>>
                    	<a href="/modules/keywords" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 关键字回复</a>
                    </li>
                </ul>
            </li>
            <li class="treeview <%if(session.getAttribute("controllerName").toString().contains("mpsites/")){%>active <%}%>">
                <a href="#">
                    <i class="fa fa-sitemap"></i>
                    <span>微网站</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li class= <%if(session.getAttribute("controllerName").equals("/mpsites/foundation")){%>active <%}%>>
                    	<a href="/mpsites/foundation" style="margin-left: 10px;"><i class="fa fa-angle-double-right"></i> 基本设置</a>
                    </li>
                </ul>
            </li>
            
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>