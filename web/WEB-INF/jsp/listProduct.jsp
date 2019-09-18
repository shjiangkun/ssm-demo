<%--
  Created by IntelliJ IDEA.
  User: CRIC-JK
  Date: 2019/9/17
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width:500px;margin:0px auto;text-align:center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>price</td>
        </tr>
        <c:forEach items="${ps}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.price}</td>
                <td><a href="editCategory?id=${c.id}">编辑</a></td>
                <td><a href="deleteProduct?id=${c.id}&cid=${c.cid}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align:center">
        <a href="?cid=${cid}&start=0">首  页</a>
        <a href="?cid=${cid}&start=${page.start-page.count}">上一页</a>
        <a href="?cid=${cid}&start=${page.start+page.count}">下一页</a>
        <a href="?cid=${cid}&start=${page.last}">末  页</a>
    </div>

</div>
</body>
</html>
