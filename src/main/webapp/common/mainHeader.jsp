<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<div class="navbar">
    <div class="container">
        <a class="navbar-brand" href="/"><img src="/public/images/logo.png" width="48" alt="Inc"></a>
        <ul class="nav navbar-nav">
            <li class=<%if(request.getAttribute("controllerName").equals("index")){%>active <%}%>
            ><a href="/features/" class="nav-features">主页</a></li>
            <li><a href="/pricing/" class="nav-pricing">案例</a></li>
            <li><a href="/about/" class="nav-about">套餐</a></li>
            <li class="sep"></li>
            <li><a href="http://blog.sendtoinc.com/">关于我们</a>
            <li class="sep"></li>
            <%if(request.getAttribute("user") !=null){ %>
            <li><a href="/admin"><%= request.getAttribute("user") %></a></li>
            
            <%}else{ %>
            <li><a href="/accounts/login/">登录</a></li>
            <li class="signup"><a href="/accounts/signup/" class="btn signup-link">注册</a></li>
            <%} %>
            
        </ul>
    </div>
</div>