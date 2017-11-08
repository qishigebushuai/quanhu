<%@page pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>查询全部部门</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="../css/style.css" />
		<script type="text/javascript">
			function deleteCheck(a){
				alert("22222");
				confirm("确定删除吗?同时删除部门下面全部员工!"){
					href="${pageContext.request.contextPath }/dept/dept_delete?id="+a;
				}
			}
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
						Welcome!我是低端局封混沌积分换
					</h1>
					<jsp:include page="/user/logo.jsp"></jsp:include>
					<table class="table">
						<tr class="table_header">
							<th>
								部门编号
							</th>
							<th>
								部门名称
							</th>
							<th>
								操作
							</th>
						</tr>
						<s:iterator value="list" >
						<tr class="row2">
							<th>
								<s:property value="id"/>
							</th>
							<th>
								<s:property value="name"/>
							</th>
							<th>
								<a id="dele" onclick="deleteCheck(${id})" >删除部门</a> 
								&nbsp;<a href='<s:url action="dept_selectOne" namespace="/dept" ></s:url>?id=<s:property value="id"/>'>修改部门名称</a>
								&nbsp;<a href='<s:url action="dept_queryAllEmpts" namespace="/dept"></s:url>?id=<s:property value="id"/>'>查询部门员工</a>
							</th>
						</tr>
						</s:iterator>
						
					</table>
					
					<s:if test="!#session.Mymap.isEmpty()">
						您已经删除一下部门,如想恢复请点击.<br>
						<table class="table">
							<tr  class="table_header">
									<th >部门</th>
									<th >操作</th>
							</tr>
							<s:iterator value="#session.Mymap.values()" >
								
								<tr class="row2">
									<th >
										<s:property value="name"/>
									</th>
									<th >
										<a id="a1" href="${pageContext.request.contextPath }/dept/dept_huifu?id=${id}" onclick="getElementById('a1').disabled=true;return true ">恢复</a>
									</th>
								</tr>
							
							
							</s:iterator>
						</table>
					</s:if>
					
					<p>
						<a href='<s:url value="/dept/addDept.jsp"></s:url>'>Add Dept</a>
					</p>
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
