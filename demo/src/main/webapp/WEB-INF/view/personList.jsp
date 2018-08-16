<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>>
<html>
<head>
    <title>showPerson</title>
    <style type="text/css">
        tr{
            text-align: center;
        }
    </style>

</head>
<body>
<table border="1" width="500" align="center" cellpadding="0" cellspacing="1">
    <thead>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${personList}" var="p">

        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.age}</td>
            <td>
                <a href="">编辑</a>|
                <a href="/person/${p.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<hr>
<a href="addPerson.jsp">添加信息</a>
</body>
</html>
