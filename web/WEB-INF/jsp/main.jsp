<%--
  Created by IntelliJ IDEA.
  User: 19784
  Date: 2020/9/7
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>

<form action="/user/login"  method="post">
    帐号：<input type="text" name="account"><br>
    密码：<input type="text" name="pass"><br>
    <input type="submit" value="登录"><br>
</form>

</body>

</html>
