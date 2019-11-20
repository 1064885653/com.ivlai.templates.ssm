<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${contentMenuList}" var="menuLi">
    <a style="font-size: 20px" href="/content/${type}/${menuLi.contentMenuTitleUrl}/">${menuLi.contentMenuTitle}</a> <br>
    <c:if test="${menuLi.contentMenuTitleUrl.equals(title)}">
        <c:forEach items="${contentList}" var="contentLi">
            <a href="/content/${type}/${menuLi.contentMenuTitleUrl}/${contentLi.contentId}">${contentLi.contentTitle}</a> <br>
        </c:forEach>
    </c:if>
</c:forEach>

<hr>
<h1>${contentInfo.contentTitle}</h1>
${contentInfo.contentInfo}
</body>
</html>
