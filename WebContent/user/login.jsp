<%@page pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>用户登录</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="../css/style.css" />
		<script type="text/javascript" src='<s:url value="/js/jquery-1.8.3.js"></s:url>'></script>
		<script type="text/javascript">
			$(function(){
				// 检查输入框是否有内容
				function checkisEmpty(value){// 如果为null或者'' ,'  ','    '
					if(value==null||value==""){
						return true;
					}else{
						return false;
					}
				}
			
				function checkUsername(){
					if(checkisEmpty($("#un").val())){
						$("#tap1").html("用户名不能为空");
						return false;					
					}else{
						$("#tap1").html("");
						return true;
					}
				}
				
				function checkPassword(){
					if(checkisEmpty($("#pw").val())){
						$("#tap2").html("密码不能为空");
						return false;
					}else{
						$("#tap2").html("");
						return true;
					}
				}
				function checkImage(){
					if(checkisEmpty($("#image").val())){
						$("#tap3").html("验证码不能为空");
						return false;
					}else if($("#image").val().length!=4){
						$("#tap3").html("验证码必须为4位");
						return false;
					}else{
						$("#tap3").html("");
						return true;
					}
				}
				
				$("#un").blur(checkUsername);
				$("#pw").blur(checkPassword);
				$("#image").blur(checkImage);
			})
		</script>
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								2009/11/20
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						<img src='<s:url value="/img/header_logo.gif"></s:url>'/>
					</h1>
					<form action="<s:url action='user_login' namespace='/user'></s:url>" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									username:
								</td>
								<td valign="middle" align="left">
									<input id="un" type="text" class="inputgri" name="user.userName" />
									<span><font id="tap1"></font></span><br>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									password:
								</td>
								<td valign="middle" align="left">
									<input id="pw" type="password" class="inputgri" name="user.password" />
									<span><font id="tap2"></font></span><br>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									验证码:
									<img id="num" src="../user/image" />
									<a href="javascript:;" onclick="document.getElementById('num').src = '../user/image'">换一张</a> 
								</td>
								<td valign="middle" align="left">
									<input id="image" type="text" class="inputgri" name="image" />
									<span><font id="tap3"></font></span><br>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="Submit &raquo;" />
							<a href='<s:url value="/user/regist.jsp"></s:url>'>注册账户</a>
						</p>
					</form><s:property value="mess"/>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
