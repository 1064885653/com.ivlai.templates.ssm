<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/21
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>管理</title>
    <%-- Script --%>
    <script rel="script" src="<%=path%>/public/utils/jquery/jquery-3.4.1.min.js"></script>
    <script rel="script" src="<%=path%>/public/utils/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <%-- CSS --%>
    <link rel="stylesheet" href="<%=path%>/public/utils/bootstrap-3.3.7-dist/css/bootstrap.min.css">

    <%-- Style --%>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        body {
            background: #eeeeee;
        }

        .box {
            background: white;
            width: 400px;
            padding: 50px 50px;
            margin: calc(25% - 150px) auto;
            overflow: hidden;
            border-radius: 5px;
        }
    </style>
</head>
<body class="row">
<div class="box">
    <form action="<%=path%>/admin/" method="post" class="col-xs-12">
        <div class="form-group">
            <label for="adminAccount"><i class="fa fa-user"></i> 用户名</label>
            <input id="adminAccount" type="text" class="form-control" name="adminAccount" autocomplete="off" required
                   minlength="4" maxlength="16">
        </div>
        <div class="form-group">
            <label for="adminPassword"><i class="fa fa-unlock-alt"></i> 密&nbsp;&nbsp;&nbsp;码</label>
            <input id="adminPassword" type="password" class="form-control" name="adminPassword" autocomplete="off" required
                   minlength="4" maxlength="16">
        </div>
        <input type="submit" class="form-control btn-success" value="登录">
    </form>
    <div></div>
</div>
<script>
    if (${!empty info}) {
        alert("${info}");
    }
    console.log("${info}")
</script>
</body>
</html>
