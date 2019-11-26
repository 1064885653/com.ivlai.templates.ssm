<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath(); %>
<% request.setAttribute("adminMenuActive", 1);%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>管理员列表</title>

    <!-- jQuery -->
    <script src="<%=path%>/public/utils/jquery/jquery-3.4.1.min.js" rel="script"></script>
    <!-- Bootstrap -->
    <link href="<%=path%>/public/utils/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="<%=path%>/public/utils/bootstrap-3.3.7-dist/js/bootstrap.js" rel="script"></script>

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->

    <!-- font-awesome-4.7.0 -->
    <link href="<%=path%>/public/utils/font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet">
    <link href="<%=path%>/public/css/admin.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid ">
    <div class="row">
        <%-- 引入开始菜单 --%>
        <jsp:include page="../utils/navtitle.jsp"/>
        <div class="col-lg-12">
            <div class="col-xs-12">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr class="bg-primary">
                        <td colspan="6">管理员列表</td>
                        <td colspan="1">共 ${adminUserList.size()} 条</td>
                    </tr>
                    <tr class="bg-info">
                        <th>账号</th>
                        <th>密码</th>
                        <th>名称</th>
                        <th>对应用户</th>
                        <th>联系方式</th>
                        <th>菜单</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${adminUserList}" var="adminUserLi">
                        <tr>
                            <td title="${adminUserLi.adminAccount}">${adminUserLi.adminAccount}</td>
                            <td title="${adminUserLi.adminPassword}">${adminUserLi.adminPassword}</td>
                            <td title="${adminUserLi.adminName}">${adminUserLi.adminName}</td>
                            <td title="${adminUserLi.adminUser}">${adminUserLi.adminUser}</td>
                            <td title="${adminUserLi.adminContact}">${adminUserLi.adminContact}</td>
                            <td title="${adminUserLi.adminMenu}">${adminUserLi.adminMenu}</td>
                            <td><a href="<%=path%>/admin/do/admin?adminAccount=${adminUserLi.adminAccount}" class="btn btn-danger">删除</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                    <tfoot>
                    <tr>
                        <td colspan="99" class="bg-info"> 添加</td>
                    </tr>
                    <tr>
                        <form action="">
                            <td><input class="form-control" aria-label="" type="text" minlength="4" maxlength="32" name="adminAccount" autocomplete="off"
                                       placeholder="账号" required></td>
                            <td><input class="form-control" aria-label="" type="text" minlength="4" maxlength="32" name="adminPassword" autocomplete="off"
                                       placeholder="密码" required></td>
                            <td><input class="form-control" aria-label="" type="text" minlength="2" maxlength="32" name="adminName" autocomplete="off"
                                       placeholder="名称" required></td>
                            <td><input class="form-control" aria-label="" type="number" min="1" max="99999999" name="adminUser" autocomplete="off"
                                       placeholder="对应用户"></td>
                            <td><input class="form-control" aria-label="" type="text" minlength="" maxlength="64" name="adminContact" autocomplete="off"
                                       placeholder="联系方式"></td>
                            <td><input class="form-control" aria-label="" type="text" minlength="" maxlength="256" name="adminMenu" autocomplete="off"
                                       placeholder="菜单" required></td>
                            <td><input class="form-control btn-success" aria-label="adminMenu" type="submit" value="提交"></td>
                        </form>
                    </tr>
                    </tfoot>
                </table>
            </div>

        </div>
    </div>
</div>
<c:if test="${null != info}">
    <script>
        alert("${info}");
    </script>
</c:if>
</body>
</html>
