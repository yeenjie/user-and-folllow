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
    用户：${param.userid}
    <table width="200px" align="center" border="1" cellspacing="0">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>删除</td>
            <td>编辑</td>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td><a href="deleteProduct?id=${product.id}">删除</a></td>
                <td><a href="editProduct?id=${product.id}">编辑</a></td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
