<%@page pageEncoding="utf-8" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="../css/style.css" />
		<link href="../css/common.css" type="text/css" rel="stylesheet" />
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
						Welcome<s:property value="dept.name"/>!
					</h1>
					<jsp:include page="/user/logo.jsp"></jsp:include>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Operation
							</td>
						</tr>
						<s:if test="list2.isEmpty()">
							<tr><th colspan="5">暂无数据!</th></tr>
						</s:if>
						<s:else>
							<s:iterator value="list2">
								<tr class="row1">
									<td>
										<s:property value="id"/>
									</td>
									<td>
										<s:property value="name"/>
									</td>
									<td>
										<a href='<s:url action="empt_delete" namespace="/empt"></s:url>?id=<s:property value="id"/>'>delete emp</a>
										&nbsp;<a href="<s:url action="empt_selectOne" namespace="/empt"></s:url>?id=<s:property value="id"/>">update emp</a>
									</td>
								</tr>
							</s:iterator>
						</s:else>
						
						
					</table>
					<div class="pagination">
						<span class="firstPage">&nbsp;</span> <span class="previousPage">&nbsp;</span>
						<span class="currentPage">1</span> <a
							href="javascript:$.pageSkip(2);">2</a> <a
							href="javascript:$.pageSkip(3);">3</a> <span class="pageBreak">...</span>
						<a class="nextPage" href="javascript: $.pageSkip(2);">&nbsp;</a>
						<a class="lastPage" href="javascript: $.pageSkip(6);">&nbsp;</a>
						<span class="pageSkip"> 共6页 到第<input id="pageNumber"
							name="pageNumber" value="1" maxlength="9"
							onpaste="return false;">页
								<button type="submit">&nbsp;</button>
						</span>
					</div>
					<p>
						<input type="button" class="button" value="Add Employee" onclick="location='${pageContext.request.contextPath}/emp/addEmp.jsp'"/>
						<a href='<s:url action="dept_queryAll" namespace="/dept"></s:url>'>返回</a>
						
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
