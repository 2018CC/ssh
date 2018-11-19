<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'book.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>BOOK站</h1> <br>
    <s:property value="id"/>
    <h3><s:property value="#msg"/></h3>
    <table border="1px" width="520px">
    		<tr>
    			<th>编号</th>
    			<th>名称</th>
    			<th>作者</th>
    			<th>价格</th>
    		</tr>
    			<s:iterator value="%{#request.books}" var="book">
    				<tr>
	    				<td>${id}</td>
	    				<td>${bookName}</td>
	    				<td>${isbn }</td>
	    				<td>${price }</td>
    				</tr>
    			</s:iterator> 
   </table>
    <s:debug></s:debug>
  </body>
</html>
