<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="wei che jian.">
  <title>Wei Che Jian</title>
  <link rel="shortcut icon" type="image/png" href="/public/images/logo.ico">
  <link rel="stylesheet" href="/public/css/accounts.css" type="text/css" />
</head>
<body class="login">
<div id="login" style="">
    <img src="/public/images/logo.png" height="72" width="72">
    <h1>登陆</h1>
    <hr>
    <form action="/accounts" method="POST">
        <input type='hidden' name='csrfmiddlewaretoken' value='' />
        <tr>
        	<th><label for="id_email">账号:</label></th>
        	<td><input id="id_email" maxlength="75" name="email" placeholder="Email" type="text" /></td>
        </tr>
		<tr>
			<th><label for="id_password">密码:</label></th>
			<td><input id="id_password" name="password" placeholder="Password" type="password" /></td>
		</tr>
        <input type="submit" class="btn btn-primary" value="Log in">
        <a href="/accounts/passwordreset/" class="forgot" style="font-size:14px; padding:15px 0; color:#999; display:inline-block">忘记密码?</a>
    </form>
</div>
<p class="small"><a href="/accounts/signup/">还没有账号？注册一个</a></p>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript" charset="utf-8">
</script>

  <script src="/public/js/main.js" type="text/javascript" charset="utf-8"></script>

</body>
</html>


