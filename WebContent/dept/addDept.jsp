<%@page pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>add Dept</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="../css/style.css" />
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
					if(checkisEmpty($("#name").val())){
						$("#tap1").html("部门名不能为空");
						return false;					
					}else{
						$("#tap1").html("");
						return true;
					}
				}
				
				$("#name").blur(checkUsername);
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
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						add Dept info:
					</h1>
					<jsp:include page="/user/logo.jsp"></jsp:include>
					<form action='<s:url action="dept_add" namespace="/dept"></s:url>' method="post" onsubmit="getElementById('sub').disabled=true;return true">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									name:
								</td>
								<td valign="middle" align="left">
									<input id="name" type="text" class="inputgri" name="dept.name" />
									<span><font id="tap1"></font></span><br>
								</td>
							</tr>
						</table>
						<p>
							<input id="sub" type="submit" class="button" value="Confirm" />
						</p>
					</form>
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
