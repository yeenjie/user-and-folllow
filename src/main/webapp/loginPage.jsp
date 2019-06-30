<%--
  Created by IntelliJ IDEA.
  User: yej
  Date: 2019/6/24
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <script src="http://how2j.cn/study/jquery.min.js"></script>
</head>
<script>
    $(function(){
        $("#login").click(function(){
            alert("TET");
            var name=$("#name").val();
            var password=$("#password").val();
            $.ajax({
                type:"post",
                data:{"name":name,"password":password},
                url:"login",
                success:function(result){
                    alert(result)
                    if(result == "Success"){
                        window.location.href="listUsers";
                    }
                }
            });
        });

    });
</script>

<body>


        <input id="name" type="text" name="name">
        <input id="password" type="password" name="password">
        <button id="login" onclick="" name="login">ajax登陆</button>>
            <%--<input type="submit" name="普通方法">--%>


</body>
</html>
