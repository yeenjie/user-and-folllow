<%--
  Created by IntelliJ IDEA.
  User: yej
  Date: 2019/6/28
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="addUser">
    用户名称：<input name="name" type="text" ></br>
    用户密码：<input name="password" type="text" ></br>
    <input type="submit" value="submit">
</form>
</body>
</html>
