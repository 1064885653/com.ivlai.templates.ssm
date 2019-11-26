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
    <title>用户信息列表</title>

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
            <div id="toolBar" class="col-lg-12 btn-group text-right">
                <button id="btn" class="btn btn-danger"><i class="glyphicon glyphicon-remove"></i> 删除选中</button>
            </div>
            <div class="col-xs-12">
                <table id="table" class="table table-bordered table-hover">
                    <thead class="bg-primary"></thead>
                    <tbody></tbody>
                    <tfoot>
                    <tr>
                        <td>

                        </td>
                    </tr>
                    </tfoot>
                </table>
            </div>
        </div>
    </div>
</div>
<script>
    $(function () {

        var $table = $("#table");

        $table.bootstrapTable({
            url: "<%=path%>/admin/do/message/json",
            pagination: true,
            search: true,
            sortable: true,
            toolbar: "#toolbar",
            uniqueId: "userId",
            clickToSelect: true,
            columns: [
                {field: "state", checkbox: true}
                , {field: "messageUserId", title: "ID", sortable: true}
                , {field: "messageUserName", title: "姓名", sortable: true}
                , {field: "messageUserType", title: "分类", sortable: true}
                , {field: "messageUserAppellation", title: "称谓", sortable: true}
                , {field: "messageUserAge", title: "年龄", sortable: true}
                , {field: "messageUserGender", title: "性别", sortable: true}
                , {field: "messageUserNation", title: "民族", sortable: true}
                , {field: "messageUserNationality", title: "国籍", sortable: true}
                , {field: "messageUserAddress", title: "住址", sortable: true}
                , {field: "messageUserAddressNow", title: "现住址", sortable: true}
                , {field: "messageUserPhone", title: "电话号码", sortable: true}
                , {field: "messageUserQq", title: "QQ", sortable: true}
                , {field: "messageUserWechat", title: "微信", sortable: true}
                , {field: "messageUserEmail", title: "邮箱", sortable: true}
                , {field: "messageUserCompanyName", title: "公司名称", sortable: true}
                , {field: "messageUserCompanyPost", title: "职位", sortable: true}
                , {field: "messageUserCompanyAddress", title: "年龄", sortable: true}
                , {field: "messageUserCompanyPhone", title: "电话号码", sortable: true}
                , {field: "messageUserCompanyPhoneFix", title: "固定电话", sortable: true}
                , {field: "messageUserCompanyEmail", title: "公司邮箱", sortable: true}
                , {field: "messageUserInfoRemark", title: "备注", sortable: true}
                , {field: "messageUserInfoMessage", title: "留言", sortable: true}
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
                    url: "/admin/do/message/json",
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
        })

    })
</script>
</body>
</html>
