<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
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
                <%@ include file="/common/adminInnerHeader.jsp" %>

                <!-- Main content -->
                <section class="content">

                    <!-- Small boxes (Stat box) -->
                    <div class="row">
                        <div class="col-lg-12 ">
                        	<div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">修改密码</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                <form  method="POST" id="pwd_form">
                                    <div class="box-body">
                                        <div class="form-group">
                                            <label>旧密码</label>
                                            <input type="password" name="mp_account" class="form-control" id="origin_pwd" placeholder="旧密码">
                                        </div>
                                        <div class="form-group">
                                            <label>新密码</label>
                                            <input type="password" name="mp_account_name" class="form-control" id="new_pwd" placeholder="新密码">
                                        </div>
                                        <div class="form-group">
                                            <label>确认新密码</label>
                                            <input type="password" name="mp_account_name" class="form-control" id="" placeholder="新密码">
                                        </div>
                                    </div>
                                    <!-- /.box-body -->

                                    <div class="box-footer">
                                        <button type="submit" class="btn btn-primary" id="updatePassword">保存</button>
                                    </div>
                                </form>
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


