<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath(); %>
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
                <c:forEach var="" items="${}">

                </c:forEach>
                <li class="dropdown active">
                    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-user"></span> 管理员 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-user"></span> 管理员管理 </a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-list-alt"></span> 资源 <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-list-alt"></span> 资源列表 </a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-plus"></span> 添加资源 </a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-cog"></span> 参数 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-sort"></span> 资源价格区间 </a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-filter"></span> 资源规格 </a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-users"></i> 用户 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=path%>/admin/" target="_blank"><i class="fa fa-users"></i> 用户列表 </a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-cog"></span> 程序 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-picture"></span> Banner列表 </a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-cog"></span> 参数设置 </a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="<%=path%>/admin/" target="_blank"><span class="glyphicon glyphicon-question-sign"></span> 问题列表 </a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <span class="glyphicon glyphicon-list-alt"></span> 项目资源 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=path%>/util/" target="_blank"><span class="glyphicon glyphicon-picture"></span> 上传图片 </a></li>
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