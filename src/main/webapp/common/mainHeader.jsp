<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<div class="navbar">
    <div class="container">
        <a class="navbar-brand" href="/"><img src="/public/images/logo.png" width="48" alt="Inc"></a>
        <ul class="nav navbar-nav">
            <li class=<%if(session.getAttribute("controllerName").equals("/")){%>active <%}%>
            ><a href="/features/" class="nav-features">主页</a></li>
            <li><a href="/pricing/" class="nav-pricing">案例</a></li>
            <li><a href="/about/" class="nav-about">套餐</a></li>
            <li class="sep"></li>
            <li><a href="http://blog.sendtoinc.com/">关于我们</a>
            <li class="sep"></li>
            <%if(session.getAttribute("user") !=null){ %>
            <li><a href="/admin"><%= session.getAttribute("user") %></a></li>
            
            <%}else{ %>
            <li><a href="/login/">登录</a></li>
            <li class="signup"><a href="/register" class="btn signup-link">注册</a></li>
            <%} %>
            
        </ul>
    </div>
</div>