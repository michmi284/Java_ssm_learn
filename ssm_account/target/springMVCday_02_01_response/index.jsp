<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<body>
<h2>欢迎来到Java9 银行</h2>
<a href="account/findAll">查询所有账户</a>
<br>
<hr>
<br>
添加账户 <br>
<form action="/account/save">
    姓名： <input type="text" name="name"> <br>
    余额： <input type="text" name="money"> <br>
    <input type="submit" value="提交">
</form>
<br>
<hr>
<br>
修改账户 <br>
<form action="/account/update">
    id：<input type="text" name="id"> <br>
    姓名：<input type="text" name="name"> <br>
    余额：<input type="text" name="money"> <br>
    <input type="submit" value="提交">
</form>
<br>
<hr>
<br>
删除账户 <br>
<form action="account/delete">
    id： <input type="text" name="id">
    <input type="submit" value="再见">
</form>
</body>
</html>
