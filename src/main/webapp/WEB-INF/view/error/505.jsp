<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head> 	
	<title>adanac</title>
	<base href="<%=basePath%>"></base>
	<link href="images/head_pic.png" type="image/png" rel="icon"></link>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
</head>
<body>
	<p class="error">服务器内部错误，错误代码：505<a href="article/index.htm">返回首页</a></p>
	<!-- container ---->	
</body>
</html>
