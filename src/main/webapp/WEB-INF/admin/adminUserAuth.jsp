<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath(); %>
<% request.setAttribute("adminMenuActive", 9);%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>权限管理</title>

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
            <div class="col-lg-12">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                        <td>菜单列表</td>
                        <td colspan="99">共 ${adminMenuList.size()} 条</td>
                    </tr>
                    <tr>
                        <th>菜单ID</th>
                        <th>菜单名称</th>
                        <th>URL</th>
                        <th>上一级菜单(0为一级菜单)</th>
                        <th>图标</th>
                        <th>简介</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${adminMenuList}" var="adminMenuLi">
                        <tr>
                            <td title="${adminMenuLi.adminMenuId}">${adminMenuLi.adminMenuId}</td>
                            <td title="${adminMenuLi.adminMenuName}">${adminMenuLi.adminMenuName}</td>
                            <td title="${adminMenuLi.adminMenuUrl}">${adminMenuLi.adminMenuUrl}</td>
                            <td title="${adminMenuLi.adminMenuUpLv}">${adminMenuLi.adminMenuUpLv}</td>
                            <td title="${adminMenuLi.adminMenuIconClass}">${adminMenuLi.adminMenuIconClass}</td>
                            <td title="${adminMenuLi.adminMenuInfo}">${adminMenuLi.adminMenuInfo}</td>
                            <td></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                    <tr>
                        <td colspan="99">输入已有ID时为更新，输如其他ID为添加。二级菜单ID命名规则为： XY，X为上一级菜单ID，Y为1-9</td>
                    </tr>
                    <tr>
                        <form action="<%=path%>/admin/do/adminUserAuth" method="post" class="">
                            <td class="form-group">
                                <input type="number" name="adminMenuId" class="form-control" placeholder="ID" min="1" max="99" autocomplete="off"></td>
                            <td class="form-group">
                                <input type="text" name="adminMenuName" class="form-control" placeholder="菜单名称" maxlength="128" autocomplete="off"></td>
                            <td class="form-group">
                                <input type="text" name="adminMenuUrl" class="form-control" placeholder="URL" maxlength="256" autocomplete="off"></td>
                            <td class="form-group">
                                <input type="number" name="adminMenuUpLv" class="form-control" placeholder="上一级菜单" min="0" max="9" autocomplete="off"></td>
                            <td class="form-group">
                                <input type="text" name="adminMenuIconClass" class="form-control" placeholder="图标" maxlength="128" autocomplete="off"></td>
                            <td class="form-group">
                                <input type="text" name="adminMenuInfo" class="form-control" placeholder="简介" maxlength="64" autocomplete="off"></td>
                            <td class="form-group"><input type="submit" class="form-control btn-success" value="提交"></td>
                        </form>
                    </tr>
                    <tfoot>
                    </tfoot>
                </table>
            </div>
            <div class="col-xs-8">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                        <td>管理员列表</td>
                        <td colspan="99">共 ${adminUserList.size()} 条</td>
                    </tr>
                    <tr>
                        <th>账号</th>
                        <th>密码</th>
                        <th>名称</th>
                        <th>联系方式</th>
                        <th>留言</th>
                        <th>菜单(为空时有所有权限)</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${adminUserList}" var="adminUserLi">
                        <tr>
                            <td title="${adminUserLi.adminAccount}">${adminUserLi.adminAccount}</td>
                            <td title="${adminUserLi.adminPassword}">${adminUserLi.adminPassword}</td>
                            <td title="${adminUserLi.adminName}">${adminUserLi.adminName}</td>
                            <td title="${adminUserLi.adminContact}">${adminUserLi.adminContact}</td>
                            <td title="${adminUserLi.adminMessage}">${adminUserLi.adminMessage}</td>
                            <td title="${adminUserLi.adminMenu}">${adminUserLi.adminMenu}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                    <tfoot>
                    </tfoot>
                </table>
            </div>
            <div class="col-lg-4">
                <form class="panel panel-success" method="post" action="<%=path%>/admin/do/adminUserAuth">
                    <div class="panel-heading">权限修改</div>
                    <div class="panel-body">
                        <div class="form-group col-lg-4">
                            <label for="adminAccount">账号</label>
                            <select class="form-control" name="adminAccount" id="adminAccount">
                                <c:forEach items="${adminUserList}" var="adminUserLi">
                                    <option value="${adminUserLi.adminAccount}">${adminUserLi.adminAccount} : ${adminUserLi.adminName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group col-lg-8">
                            <label for="adminMenu">权限 - 添加2级菜单即可，默认拥有所有一级菜单</label>
                            <input type="text" name="adminMenu" id="adminMenu" class="form-control" required minlength="4" maxlength="250"
                                   autocomplete="off" placeholder="格式：[1,2,3,4,5],[]为所有权限">
                        </div>
                    </div>
                    <div class="panel-footer text-right">
                        <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-floppy-saved"></span> 提交</button>
                        <button type="button" class="btn btn-default" onclick="window.close()"><span class="glyphicon glyphicon-remove"></span> 取消</button>
                    </div>
                </form>
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
