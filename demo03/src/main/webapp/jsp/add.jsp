
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/9/26
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/statics/js/jquery-1.12.4.js"></script>
</head>
<body>
<h2 align="center" style="color: red;">学生信息添加</h2>
<form action="/insertStudent" method="post">
    <table border="1px" align="center">
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="gender"></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="telephone"></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>班级</td>
            <td>
                <select name="classid">
                    <option value="0">请选择</option>
                    <c:forEach items="${Classes}" var="list">
                        <option value="${list.id}">${list.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="保存"><input type="button" value="返回"></td>
        </tr>
    </table>
</form>
<script type="text/javascript">
    $("[type='button']").click(function () {
        location.href="/";
    })
    $("form").submit(function () {
        var classid=$("[name='classid']").val();
        if(classid==0){
            alert("请选择班级！");
            return false;
        }
        return true;
    })
</script>
</body>
</html>
