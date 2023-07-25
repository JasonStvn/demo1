<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<script src="webjars/jquery/3.5.1/jquery.min.js"> </script>
<script>
    $(function () {
        $.ajax({
            type: "post",
            url: 'getUserPageList',
            dataType: "json",
            data: {
                userName: "李师傅",
                accountNo: "666333"
            },
            async: false,
            success: function(result) {
                alert("我是返回内容");
            },
            error: function(e) {
                alert("错误信息:" + e);
            }
        })
    })
</script>
    <table border="1">
        <tr>
            <td>账号</td>
            <td>用户名</td>
            <td>性别</td>
            <td>手机号</td>
            <td>角色</td>
            <td>状态</td>
            <td>创建时间</td>
            <td>操作</td>
        </tr>
        <c:if test="${not empty userList}" >
            <c:forEach items="${userList}" var="user" varStatus="vs">
                <tr>
                    <td>${user.accountNo}</td>
                    <td>${user.userName}</td>
                    <td>
                        <c:if test="${user.sex == 0}">
                            未知
                        </c:if>
                        <c:if test="${user.sex == 1}">
                            男
                        </c:if>
                        <c:if test="${user.sex == 2}">
                            女
                        </c:if>
                    </td>
                    <td>${user.phone}</td>
                    <td>${user.roleId}</td>
                    <td>
                        <a href="UpdateStatus?id=${user.id}&status=${user.status}">
                            <c:if test="${user.status == 1}">
                                正常
                            </c:if>
                            <c:if test="${user.status == 0}">
                                锁定
                            </c:if>
                        </a>
                    </td>
                    <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${user.createTime}"/></td>
                    <td><a href="DeleteById?id=${user.id}">删除</a><a href="ViewUser?id=${user.id}">修改</a></td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</body>

</html>