<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/8
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/anno/testRequestParam?username=pa">我要充值</a>

<form action="/anno/testRequestBody" method="post">
    name: <input type="text" name="username">
    age: <input type="text" name="age">
    <input type="submit" value="你充个锤子">

</form>
<a href="/anno/testPathVariable/33">testPathVariable</a>

</body>
</html>
