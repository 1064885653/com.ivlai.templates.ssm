<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath(); %>
<% request.setAttribute("adminMenuActive", 2);%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>注册用户列表</title>

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

    <!-- bootstrap-table -->
    <link href="<%=path%>/public/utils/bootstrap-table-v1.15.5/bootstrap-table.min.css" rel="stylesheet">
    <script src="<%=path%>/public/utils/bootstrap-table-v1.15.5/bootstrap-table.min.js"></script>
    <script src="<%=path%>/public/utils/bootstrap-table-v1.15.5/bootstrap-table-zh-CN.min.js"></script>

    <style>
        .bootstrap-table .fixed-table-container .fixed-table-body {
            height: auto !important;
        }
    </style>
</head>
<body>
<div class="container-fluid ">
    <div class="row">
        <%-- 引入开始菜单 --%>
        <jsp:include page="../utils/navtitle.jsp"/>
        <div class="col-lg-12">
            <div id="toolbar" class="col-lg-12 btn-group text-right">
                <button id="btn" class="btn btn-danger"><i class="glyphicon glyphicon-remove"></i> 删除选中</button>
            </div>
            <div class="col-xs-12">
                <table id="table" class="table table-bordered table-hover">
                    <thead class="bg-primary">
                    <tr>
                        <th data-field="userId">ID</th>
                        <th data-field="userName">姓名</th>
                        <th data-field="userType">分类</th>
                        <th data-field="userAppellation">称谓</th>
                        <th data-field="userAge">年龄</th>
                        <th data-field="userGender">性别</th>
                        <th data-field="userNation">民族</th>
                        <th data-field="userNationality">国籍</th>
                        <th data-field="userAddress">住址</th>
                        <th data-field="userAddressNow">现住址</th>
                        <th data-field="userPhone">电话号码</th>
                        <th data-field="userQq">QQ</th>
                        <th data-field="userWechat">微信</th>
                        <th data-field="userEmail">邮箱</th>
                        <th data-field="userCompanyName">公司名称</th>
                        <th data-field="userCompanyPost">职位</th>
                        <th data-field="userCompanyAddress">年龄</th>
                        <th data-field="userCompanyPhone">电话号码</th>
                        <th data-field="userCompanyPhoneFix">固定电话</th>
                        <th data-field="userCompanyEmail">公司邮箱</th>
                        <th data-field="userInfoRemark">备注</th>
                    </tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script>

    $(function () {

        var $table = $("#table");

        $table.bootstrapTable({
            url: "<%=path%>/admin/do/user/json",
            pagination: true,
            search: true,
            sortable: true,
            toolbar: "#toolbar",
            uniqueId: "userId",
            clickToSelect: true,
            columns: [
                {field: "state", checkbox: true}
                , {field: "userId", title: "ID", sortable: true}
                , {field: "userName", title: "姓名", sortable: true}
                , {field: "userType", title: "分类", sortable: true}
                , {field: "userAppellation", title: "称谓", sortable: true}
                , {field: "userAge", title: "年龄", sortable: true}
                , {field: "userGender", title: "性别", sortable: true}
                , {field: "userNation", title: "民族", sortable: true}
                , {field: "userNationality", title: "国籍", sortable: true}
                , {field: "userAddress", title: "住址", sortable: true}
                , {field: "userAddressNow", title: "现住址", sortable: true}
                , {field: "userPhone", title: "电话号码", sortable: true}
                , {field: "userQq", title: "QQ", sortable: true}
                , {field: "userWechat", title: "微信", sortable: true}
                , {field: "userEmail", title: "邮箱", sortable: true}
                , {field: "userCompanyName", title: "公司名称", sortable: true}
                , {field: "userCompanyPost", title: "职位", sortable: true}
                , {field: "userCompanyAddress", title: "年龄", sortable: true}
                , {field: "userCompanyPhone", title: "电话号码", sortable: true}
                , {field: "userCompanyPhoneFix", title: "固定电话", sortable: true}
                , {field: "userCompanyEmail", title: "公司邮箱", sortable: true}
                , {field: "userInfoRemark", title: "备注", sortable: true}
            ]
        });

        /* 获取选中的列表 */
        function getSelectList() {
            return $table.bootstrapTable("getSelections").map(function (item, index, li) {
                return item.userId;
            });
        }

        /* 删除选中 */
        function del(data) {
            if (null != data && data.length > 0 && confirm("确定删除么？该操作不可逆！")) {
                $.ajax({
                    url: "/admin/do/user/json",
                    type: "post",
                    data: {
                        "userId": data.toString()
                    },
                    success: function (res) {
                        if (res) {
                            $table.bootstrapTable("refresh");
                        } else {
                            alert("删除失败")
                        }
                    }, fail: function () {
                        console.log("NO")
                    }
                })
            }

        }

        $("#btn").click(function () {
            del(getSelectList());
        });
    });

</script>
</body>
</html>
