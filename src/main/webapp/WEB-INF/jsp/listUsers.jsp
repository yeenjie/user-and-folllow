<%--
  Created by IntelliJ IDEA.
  User: yej
  Date: 2019/6/27
  Time: 21:10
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
欢迎用户：${username}
欢迎用户：${userid}
<a href="jump">新增</a>
<form method="post" action="searchUser">
    <input type="text" name="name">
    <input type="submit" value="搜索">
</form>
<a href="listFollows?id=${userid}"> 我的关注</a>
<table width="200px" align="center" border="1" cellspacing="0">
    <tr>
        <td>用户名称</td>
        <td>密码</td>
        <td>删除</td>
        <td>关注</td>
        <td>编辑</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td><a href="deleteUser?id=${user.id}">删除</a></td>
            <td><a href="followUser?fid=${user.id}&pid=${userid}">关注</a></td>
            <td><a href="editUser?id=${user.id}">编辑</a></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
