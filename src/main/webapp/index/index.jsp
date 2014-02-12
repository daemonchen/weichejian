<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="wei che jian.">
  <title>Wei Che Jian</title>
  <link rel="shortcut icon" type="image/png" href="public/images/logo.ico">
  <link rel="stylesheet" href="public/css/index.css" type="text/css" />
</head>
<body class="landing site">

<div class="navbar">
    <div class="container">
        <a class="navbar-brand" href="/"><img src="/public/images/logo.png" width="48" alt="Inc"></a>
        <ul class="nav navbar-nav">
            <li><a href="/features/" class="nav-features">主页</a></li>
            <li><a href="/pricing/" class="nav-pricing">案例</a></li>
            <li><a href="/about/" class="nav-about">套餐</a></li>
            <li class="sep"></li>
            <li><a href="http://blog.sendtoinc.com/">关于我们</a>
            <li class="sep"></li>
            
            <li><a href="/accounts/login/">登录</a></li>
            <li class="signup"><a href="/accounts/signup/" class="btn signup-link">注册</a></li>
            
        </ul>
    </div>
</div>

    <header>
        <div class="bg"></div>
        <div class="container">
            <div class="col col-xs-5 col-md-offset-1">
                <div class="text">
                    <h1>微车间</h1>
                    <p>创新 专注</p>
                </div>
            </div>
            <div class="col col-xs-5 col-md-offset-1">
                <div class="box">
                <h3>注册</h3>
                <a href="/login/google-oauth2/" class="gapps"><span>使用微信账号</span></a>
                <form action="." method="POST"><input type='hidden' name='' value='' />
                    <label>或者用邮箱注册</label>
                    <input type="text" name="email" placeholder="Enter your email">
                    <input type="submit" class="btn" value="Sign Up">
                </form>
                </div>
            </div>
        </div>
    </header>
    <footer>

    <div class="container">
        <div class="row">
            <div class="col col-lg-10">
                <img src="public/images/logo.png" alt="Inc" width="42" style="opacity:0.65">
                <a href="/about/">About</a>
                <a href="http://blog.sendtoinc.com/">Blog</a>
                <a href="/pricing/">Pricing</a>
                <a href="/apps/">Apps</a>
                <a href="/help/">Help</a>
                <a href="/terms/">Terms</a>
                <a href="/privacy/">Privacy</a>
                <a href="mailto:hello@sendtoinc.com">Contact Us</a>
                <div style="padding:0 20px; vertical-align:middle; display:inline-block"><a href="https://twitter.com/sendtoinc" class="twitter-follow-button" data-show-count="false">Follow @sendtoinc</a>
                </div>
            </div>
            <div class="col col-lg-2">
                <span>&copy 2014 - Kippt Inc.</span>
                <div class="mixpanel">
                    <a href="https://mixpanel.com/f/partner"><img src="//cdn.mxpnl.com/site_media/images/partner/badge_light.png" alt="Mobile Analytics" /></a>
                </div>
            </div>
        </div>
    </div>

</footer>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript" charset="utf-8">
</script>

  <script src="/public/js/main.js" type="text/javascript" charset="utf-8"></script>

</body>
</html>


