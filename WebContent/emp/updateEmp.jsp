<%@page pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>update Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="../css/style.css" />
			<script type="text/javascript" src='<s:url value="/js/jquery-1.8.3.js"></s:url>'></script>
		<script type="text/javascript">
			$(function(){
				$.ajax({
					type:"get",
					url:"${pageContext.request.contextPath}/dept/dept_queryDept",
					dataType:"JSON",
					success:function(list){
						//遍历
						$.each(list,function(i,p){
							var option=$("<option></option>").text(p.name).val(p.id);
							$("#dep").append(option);
						});
					}
					
				})
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
						$("#tap1").html("员工名不能为空");
						return false;					
					}else{
						$("#tap1").html("");
						return true;
					}
				}
				function checkSalary(){
					if(checkisEmpty($("#salary").val())){
						$("#tap2").html("薪水不能为空");
						return false;
					}else if(isNaN($("#salary").val())){
						$("#tap2").html("薪水必须为数字");
						return false;
					}else{
						$("#tap2").html("");
						return true;
					}
				}
				function checkAge(){
					if(checkisEmpty($("#age").val())){
						$("#tap3").html("年龄不能为空");
						return false;
					}else if(isNaN($("#age").val())||$("#age").val>150||$("#age").val()<0){
						$("#tap3").html("年龄必须为数字且在0~150范围之内");
						return false;
					}else{
						$("#tap3").html("");
						return true;
					}
				}
					function checkDd(){
					if(checkisEmpty($("#dd").val())){
						$("#tap4").html("部门编号不能为空");
						return false;
					}else if(isNaN($("#dd").val())){
						$("#tap4").html("部门编号必须为数字");
						return false;
					}else{
						$("#tap4").html("");
						return true;
					}
				}
				$("#name").blur(checkUsername);
				$("#salary").blur(checkSalary);
				$("#age").blur(checkAge);
				$("#dd").blur(checkDd);
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
						update Emp info:
					</h1>
					<jsp:include page="/user/logo.jsp"></jsp:include>
					<form action='<s:url action="empt_update" namespace="/empt"></s:url>' method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									id:
								</td>
								<td valign="middle" align="left">
									<s:property value="empt.id"/>
									<input hidden name="empt.id" value="<s:property value="empt.id"/>"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									name:
								</td>
								<td valign="middle" align="left">
									<input id="name" type="text" class="inputgri" name="empt.name" value='<s:property value="empt.name"/>'/>
									<span id="tap1"></span>
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									部门编号:
								</td>
								<td valign="middle" align="left">
									<select name="empt.dept.id" id="dep">
									</select>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="Confirm" />
							<a href='<s:url action="dept_queryAll" namespace="/dept"></s:url>'>返回部门信息</a>
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
