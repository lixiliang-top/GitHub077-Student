<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/9/26
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAdd" method="post">
    <table align="center" border="1px">
        <tr>
            <td colspan="2" align="center">学员信息添加</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="gender"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="telephone"/></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>班级</td>
            <td>
                <select class="banji" name="classid">
                    <option value="0">请选择</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="保存"/>
                <input type="reset" value="返回">
            </td>
        </tr>
    </table>
    ${errot}
</form>
<script src="/statics/js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="/statics/js/add.js" type="text/javascript"></script>
</body>
</html>