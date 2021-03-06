<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="cn.weichejian.model.MpAccount"%>
<!doctype html>
<html lang="en">
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="wei che jian.">
  <title>Wei Che Jian</title>
  <link rel="shortcut icon" type="image/png" href="/public/images/logo.ico">
  <link rel="stylesheet" href="/public/css/bootstrap.css" type="text/css" />
  <link rel="stylesheet" href="/public/css/admin.css" type="text/css" />
  <link rel="stylesheet" href="/public/css/font.css" type="text/css" />
   <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
   <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
   <!--[if lt IE 9]>
     <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
     <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
   <![endif]-->
</head>
<body class="skin-blue wysihtml5-supported" style="min-height: 375px;">
        <!-- header logo: style can be found in header.less -->
        <%@ include file="/common/adminHeader.jsp" %>
        <div class="wrapper row-offcanvas row-offcanvas-left" style="min-height: 375px;">
            <!-- Left side column. contains the logo and sidebar -->
            <%@ include file="/common/adminLeftSidebar.jsp" %>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">
                <!-- Content Header (Page header) -->
                <%@ include file="/common/adminInnerHeader.jsp" %>

                <section class="content">

                    <div class="row">
                        <div class="col-lg-12 ">
                        	<div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">修改个人信息</h3>
                                </div>
                                <div class="table-responsive">
                                    <!-- .table - Uses sparkline charts-->
                                    <table class="table table-striped">
                                        <tbody>
	                                        <tr>
	                                            <td>手机</td>
	                                            <td><input  type="text"/></td>
	                                        </tr>
	                                        <tr>
	                                            <td>邮箱</td>
	                                            <td><input  type="text"/></td>
	                                        </tr>
	                                        <tr>
	                                            <td>QQ</td>
	                                            <td><input  type="text"/></td>
	                                        </tr>
                                        </tbody>
                                     </table>
                                 </div>
                               <div class="box-footer">
                                    <button class="btn btn-info">
                                    	<i class="fa fa-edit"></i>
                                     	保存
                                     </button>
                                </div>
                            </div>
                        </div>
                     </div>
                 </section>
                <!-- /.content -->
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->

        <!-- add new calendar event modal -->     
<script src="/public/js/jQuery.js" type="text/javascript" charset="utf-8">
</script>
<script src="/public/js/bootstrap.js" type="text/javascript" charset="utf-8"></script> 

<script src="/public/js/admin.js" type="text/javascript" charset="utf-8"></script> 

</body>
</html>


