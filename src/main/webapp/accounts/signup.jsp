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
<body class="login signup">
    

    
<div id="login">
    <img src="/public/images/logo.png" height="72" width="72">
    <h1>注册微车间</h1>
    <div>
        <form action="/accounts/signuppost" method="POST">
            <input type='hidden' name='csrfmiddlewaretoken' value='GpfVAYNT0V2kB4TpWUgKoNiAK3LKZbz4' />
            <tr>
            	<th><label for="id_email">账号:</label></th>
            	<td><input id="id_email" maxlength="75" name="email" placeholder="Email" type="text" /></td>
            </tr>
			<tr>
				<th><label for="id_password">密码:</label></th>
				<td>
				<input id="id_password" name="password" placeholder="Password" type="password" />
				<input id="id_invitation_key" name="invitation_key" type="hidden" /></td>
			</tr>
            <p><input type="submit" value="Sign up" class="btn btn-primary"></p>
        </form>
    </div>
</div>
<p class="small"><a href="/accounts/login/">已经有账号了? 登陆</a></p>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript" charset="utf-8">
</script>

  <script src="/public/js/main.js" type="text/javascript" charset="utf-8"></script>

</body>
</html>


