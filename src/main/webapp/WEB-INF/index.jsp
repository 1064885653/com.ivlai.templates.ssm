<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>资源列表</title>

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
<div class="container-fluid reourceList">
    <div class="row">
        <nav class="navbar navbar-default col-xs-12">
            <div class="container-fluid">
                <%-- 手机端/小屏幕显示的隐藏按钮 --%>
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">后台管理</a><%-- 显示的主页 --%>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <c:forEach items="${adminMenuList}" var="adminMenuLi">
                            <li class="dropdown ${adminMenuLi.adminMenu.adminMenuId == adminMenuActive?"active":""}">
                                <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                    <span class="glyphicon glyphicon-user"></span> 管理员 <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="<%=path%>/admin/do/admin" target="_blank"><span class="glyphicon glyphicon-user"></span> 管理员管理 </a></li>
                                </ul>
                            </li>
                        </c:forEach>
                        <li class="dropdown active">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                <span class="glyphicon glyphicon-user"></span> 管理员 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="<%=path%>/admin/do/admin" target="_blank"><span class="glyphicon glyphicon-user"></span> 管理员管理 </a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                <span class="glyphicon glyphicon-list-alt"></span> 资源 <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="<%=path%>/admin/do/resources" target="_blank"><span class="glyphicon glyphicon-list-alt"></span> 资源列表 </a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="<%=path%>/admin/do/resources/add" target="_blank"><span class="glyphicon glyphicon-plus"></span> 添加资源 </a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                <span class="glyphicon glyphicon-cog"></span> 参数 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="<%=path%>/admin/do/price" target="_blank"><span class="glyphicon glyphicon-sort"></span> 资源价格区间 </a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="<%=path%>/admin/do/specification" target="_blank"><span class="glyphicon glyphicon-filter"></span> 资源规格 </a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                <i class="fa fa-users"></i> 用户 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="<%=path%>/admin/do/user" target="_blank"><i class="fa fa-users"></i> 用户列表 </a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                <span class="glyphicon glyphicon-cog"></span> 程序 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="<%=path%>/admin/do/banner" target="_blank"><span class="glyphicon glyphicon-picture"></span> Banner列表 </a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="<%=path%>/admin/do/parameter" target="_blank"><span class="glyphicon glyphicon-cog"></span> 参数设置 </a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="<%=path%>/admin/do/problem" target="_blank"><span class="glyphicon glyphicon-question-sign"></span> 问题列表 </a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                <span class="glyphicon glyphicon-list-alt"></span> 项目资源 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="<%=path%>/util/upload" target="_blank"><span class="glyphicon glyphicon-picture"></span> 上传图片 </a></li>
                            </ul>
                        </li>
                    </ul>
                    <%--<form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>--%>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true"
                               aria-expanded="false"><span class="glyphicon glyphicon-user"></span> 用户 <span
                                    class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><span
                                        class="glyphicon glyphicon-user"></span> ${sessionScope.admin.account}
                                </a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="<%=path%>/admin/?account=${sessionScope.admin.account}"><span
                                        class="glyphicon glyphicon-log-out"></span> 退出登录 </a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="col-lg-12">
            <div class="col-xs-6">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                        <td>管理员列表</td>
                        <td colspan="99">共 ${adminList.size()} 条</td>
                    </tr>
                    <tr>
                        <th>账号</th>
                        <th>密码</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${adminList}" var="admin">
                        <tr>
                            <td title="${admin.account}">${admin.account}</td>
                            <td title="${admin.password}">${admin.password}</td>
                            <td>
                                <a href="<%=path%>/admin/do/admin?account=${admin.account}"
                                   title="删除" onclick="return confirm('你确定删除吗？该操作不可逆！请谨慎操作！')">
                                    <span class="glyphicon glyphicon-trash btn btn-sm btn-danger"></span></a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                    <tfoot>
                    <tr>
                        <td colspan="99" class="text-center" style="color: red;">
                            <span class="glyphicon glyphicon-warning-sign"></span> 严重警告！如果删除的管理员账号为最后一个管理员账号，在删除之前必须添加另一个可用账号，否则将无法登录后台。
                        </td>
                    </tr>
                    </tfoot>
                </table>
            </div>
            <div class="col-lg-6">
                <form class="panel panel-success" method="get">
                    <div class="panel-heading">添加管理员账号</div>
                    <div class="panel-body">
                        <div class="form-group col-lg-6">
                            <label for="account">账号</label>
                            <input type="text" name="account" id="account" class="form-control" required minlength="4" maxlength="32" autocomplete="off">
                        </div>
                        <div class="form-group col-lg-6">
                            <label for="password">密码</label>
                            <input type="text" name="password" id="password" class="form-control" required minlength="4" maxlength="32" autocomplete="off">
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
