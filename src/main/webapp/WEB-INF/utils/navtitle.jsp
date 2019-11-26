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
            <a class="navbar-brand" href="<%=path%>/admin/">后台管理</a><%-- 显示的主页 --%>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <c:forEach items="${sessionScope.adminMenuVoList}" var="adminMenuLi">
                    <li class="dropdown ${adminMenuLi.adminMenu.adminMenuId == adminMenuActive?"active":""}">
                        <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                            <span class="${adminMenuLi.adminMenu.adminMenuIconClass}"></span> ${adminMenuLi.adminMenu.adminMenuName} <span
                                class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <c:forEach items="${adminMenuLi.adminMenuList}" var="adminMenuLi2">
                                <li role="separator" class="divider"></li>
                                <li><a href="<%=path%>${adminMenuLi2.adminMenuUrl}" target="_blank">
                                    <span class="${adminMenuLi2.adminMenuIconClass}"></span> ${adminMenuLi2.adminMenuName}
                                </a></li>
                            </c:forEach>
                        </ul>
                    </li>
                </c:forEach>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true"
                       aria-expanded="false"><span class="glyphicon glyphicon-user"></span> 用户 <span
                            class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span
                                class="glyphicon glyphicon-user"></span> ${sessionScope.adminUser.adminAccount}
                        </a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="<%=path%>/admin/out"><span
                                class="glyphicon glyphicon-log-out"></span> 退出登录 </a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>