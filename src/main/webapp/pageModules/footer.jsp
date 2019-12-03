<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="langObj" value="${sessionScope.langObj}"/>
<div class="col-xl-12 yqlj">
    <div class="container">
        <a href="">${langObj.footer.friendLink[0]}</a>
        <a href="">${langObj.footer.friendLink[1]}</a>
        <a href="">${langObj.footer.friendLink[2]}</a>
        <a href="">${langObj.footer.friendLink[3]}</a>
    </div>

</div>
<footer class="col-xl-12 footer bg-dark">
    <div class="container">
        <p class="info">${langObj.footer.info}</p>
        <p class="logo text-right"><img src="http://www.acconsulting.com.cn/images/logo.png" alt="logo"></p>
        <p class="copyright text-center text-white">© Copyright A.C.Consulting Co.,Ltd All rights reserved</p>
    </div>
</footer>