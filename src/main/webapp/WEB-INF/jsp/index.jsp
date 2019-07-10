<%--
  Created by IntelliJ IDEA.
  User: Sakura
  Date: 2019/7/9
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>入门案例</title>
</head>

<body>
<h2>Hello World!</h2>
<hr>
<h3>byebye</h3>

<a href="hello">点我进入</a>
<a href="param/testParam?username=张三&age=18">入门案例 传参</a>

<hr>
<form action="/param/saveAccount" method="post">
    账号：<input type="text" name="name"/><br>
    密码：<input type="text" name="password"/><br>
    金额：<input type="text" name="money"/><br>
    用户姓名：<input type="text" name="user.username"/><br>
    用户年龄：<input type="text" name="user.age"/><br>
    用户姓名（list)：<input type="text" name="list[0].username"/><br>
    用户年龄（list)：<input type="text" name="list[0].age"/><br>
    用户姓名（list)：<input type="text" name="list[1].username"/><br>
    用户年龄（list)：<input type="text" name="list[1].age"/><br>

    用户姓名（map)：<input type="text" name="map['one'].username"/><br>
    用户年龄（map)：<input type="text" name="map['one'].age"/><br>
    用户姓名（map)：<input type="text" name="map['two'].username"/><br>
    用户年龄（map)：<input type="text" name="map['two'].age"/><br>

    <input type="submit" value="提交"/>
</form>

</body>
</html>
