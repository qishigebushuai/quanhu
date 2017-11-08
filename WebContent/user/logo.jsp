<%@page pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

当前用户:<s:property value="#session.Myuser.realName"/>
&nbsp;&nbsp;<a href='<s:url action="user_esc" namespace="/user"></s:url>'>安全退出</a><br><br>





