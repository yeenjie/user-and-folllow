<%--
  Created by IntelliJ IDEA.
  User: yej-win
  Date: 2019/6/30
  Time: 14:49
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
<a href="listUsers?id=${userid}">返回用户列表</a>
<table width="200px" align="center" border="1" cellspacing="0">
    <tr>
        <td>用户名称</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td><a href="unFollow?pid=${userid}&fid=${user.id}">取消关注</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
