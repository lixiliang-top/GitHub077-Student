<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/9/26
  Time: 14:59
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
<h2 align="center" style="color: red">学生信息列表</h2>
<table border="1px" align="center">
    <tr>
        <td colspan="7" align="right"><a href="/add">添加学员</a></td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>电话</td>
        <td>email</td>
        <td>班级</td>
    </tr>
    <c:forEach items="${ Student }" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.gender}</td>
            <td>${list.age}</td>
            <td>${list.telephone}</td>
            <td>${list.email}</td>
            <td>
                <c:if test="${list.classid==1}">
                    s2188
                </c:if>
                <c:if test="${list.classid==2}">
                    s2192
                </c:if>
                <c:if test="${list.classid==3}">
                    s2134
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
