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
  <link rel="stylesheet" href="/public/css/msgSender.css" type="text/css" />
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
                                    <h3 class="box-title">被添加自动回复</h3>
                                </div>
                                <div class="msg_sender small" id="js_msgSender"><div class="tab">
	<ul class="tab_navs">
	    
        <li class="tab_nav tab_text width4 selected" data-type="1" data-tab=".js_textArea">
		    <a href="javascript:void(0);"><i class="fa fa-fw fa-edit"></i>文字</a>
	    </li>
	    
        <li class="tab_nav tab_img width4" data-type="2" data-tab=".js_imgArea">
		    <a href="javascript:void(0);"><i class="fa fa-fw fa-picture-o"></i>图片</a>
	    </li>
	    
        <li class="tab_nav tab_audio width4" data-type="3" data-tab=".js_audioArea">
		    <a href="javascript:void(0);"><i class="fa fa-fw fa-volume-up"></i>语音</a>
	    </li>
	    
        <li class="tab_nav tab_video width4 no_extra" data-type="15" data-tab=".js_videoArea">
		    <a href="javascript:void(0);"><i class="fa fa-fw fa-video-camera"></i>视频</a>
	    </li>
	    
	</ul>
	<div class="tab_panel">
	    
	    <div class="tab_content">
	    	<div class="js_textArea inner no_extra"><div class="emotion_editor">
			    <div class="edit_area js_editorArea" style="display: none;"></div><div class="edit_area js_editorArea" contenteditable="true" style="overflow-y: auto; overflow-x: hidden;"></div>
			    <div class="editor_toolbar">
			        
			        <a href="javascript:void(0);" class="icon_emotion emotion_switch js_switch">表情</a>
			        
			        
			        <p class="editor_tip js_editorTip">还可以输入<em>600</em>字</p>
			        
			    </div>
			</div>
			
			</div>
	    </div>
	</div>
</div>
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


