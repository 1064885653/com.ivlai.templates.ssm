<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html; charset=utf-8" %>
<c:set var="langMap" value="${sessionScope.langMap}"/>
<c:set var="langObj" value="${sessionScope.langObj}"/>
<c:set var="lang" value="${sessionScope.lang}"/>
<c:set var="menuActive" value="8"/> <%-- 选中的菜单 --%>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>测试页面</title>
    <meta charset="UTF-8">
    <meta name="keywords" content="关键词,关键字">
    <meta name="description" content="网页描述">
    <meta name="viewport" content="width=device-width,initial=1.0,user-scalable=0,initial-scale=1">
    <%--  user-scalable: 禁止缩放 --%>
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%-- 是ie的一个专有属性，它告诉ie需要用何种版本去渲染网页 --%>

    <%-- CSS --%>
    <link rel="stylesheet" href="<%=path%>/public/utils/bootstrap-4.3.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=path%>/public/css/index.css">

    <%-- SCRIPT --%>
    <script>var lang = "${!empty lang?lang:"zh_CN"}";</script>
    <script rel="script" src="<%=path%>/public/utils/jquery/jquery-3.4.1.min.js" charset="UTF-8"></script>
    <script rel="script" src="<%=path%>/public/js/i18n.js"></script>
    <script rel="script" src="<%=path%>/public/utils/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>

    <%-- 路径 --%>
    <base href="http://localhost">
</head>
<body>
<div class="container-fluid contact">
    <div class="row">
        <nav class="navbar navbar-expand-md bg-dark navbar-dark col-xl-12 col-sm-12">
            <div class="container">
                <a class="navbar-brand" href="/"><img src="http://www.acconsulting.com.cn/images/logo.png" alt="logo"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="nav navbar-nav justify-content-end ml-auto">
                        <c:forEach items="${menuList}" var="menuLi">
                            <li class="nav-item ${menuLi.menuId == menuActive?"active":""}">
                                <a class="nav-link" href="${menuLi.menuUrl}">${langMap.get(menuLi.menuNameForI18n)}</a></li>
                        </c:forEach>
                        <li class="nav-item"><a class="nav-link"><select id="languageList" aria-label="Language List"></select></a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <%-- 轮播 --%>
        <div id="carouselExampleIndicators" class="carousel slide w-100" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <a href="">
                        <img src="https://static.runoob.com/images/mix/img_fjords_wide.jpg" class="d-block w-100" alt="...">
                    </a>
                </div>
                <div class="carousel-item">
                    <img src="https://static.runoob.com/images/mix/img_nature_wide.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="https://static.runoob.com/images/mix/img_mountains_wide.jpg" class="d-block w-100" alt="...">
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        <%-- 联系方式 - form --%>
        <div class="container contact-form">
            <form id="form_contact" class="row" onsubmit="mySubmit(this);return false;">
                <div class="col-sm-4 col-12">
                    <h1>${langMap.contact_contactUs}</h1>
                    <label class="w-100">TEL：<input type="text" name="messageUserPhone" minlength="7" maxlength="16" required></label>
                    <label class="w-100">Email：<input type="text" name="messageUserEmail" minlength="6" maxlength="128"></label>
                    <label class="w-100">Add：<input type="text" name="messageUserAddressNow" minlength="6" maxlength="128"></label>
                    <label class="w-100"><input type="submit" value="${langMap.form_submit}"></label>
                </div>
                <div class="col-sm-8 col-12">
                    <div class="row">
                        <input type="text" name="messageUserName" aria-label="${langObj.form.userName}" class="col-4"
                               placeholder="${langObj.form.userName}" minlength="2" maxlength="16">
                        <input type="text" name="messageUserAppellation" aria-label="${langObj.form.userAppellation}" class="col-4"
                               placeholder="${langObj.form.userAppellation}" minlength="2" maxlength="16">
                        <input type="text" name="messageUserCompanyPost" aria-label="${langObj.form.userCompanyPost}" class="col-4"
                               placeholder="${langObj.form.userCompanyPost}" minlength="2" maxlength="16">
                    </div>
                    <div class="row">
                        <input type="text" name="messageUserCompanyName" aria-label="${langObj.form.userCompanyName}" class="col-7"
                               placeholder="${langObj.form.userCompanyName}" minlength="2" maxlength="64">
                        <input type="text" name="messageUserCompanyAddress" aria-label="${langObj.form.userCompanyAddress}" class="col-7"
                               placeholder="${langObj.form.userCompanyAddress}" minlength="2" maxlength="64">
                    </div>
                    <div class="row">
                        <textarea aria-label="${langObj.form.demand}" class="col-12" style="resize: none;height: 80px;" placeholder="${langObj.form.demand}"
                                  minlength="2" maxlength="1024"  ></textarea>
                    </div>
                </div>
            </form>
            <div class="row">
                <img class="w-100" src="http://www.acconsulting.com.cn/userfiles/PPT-40(7).jpg" alt="map">
            </div>
        </div>

        <%-- 底部模块 --%>
        <div class="col-xl-12 h-25 bg-danger"></div>
        <jsp:include page="pageModules/footer.jsp"/>
    </div>
</div>
<script rel="script">
    function mySubmit() {
        $.ajax({
            url: "<%=path%>/user/lam",
            type: "post",
            dataType: "json",
            data: $("#form_contact").serialize(),
            success: function (e) {
                if (e.code) {
                    alert("保存成功");
                } else {
                    alert("保存失败")
                }
            }, error: function (e) {
                alert("网络异常");
            }
        });
        return false;
    }
</script>
</body>
</html>
