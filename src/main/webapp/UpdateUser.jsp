<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
    <form action="UpdateById">
        <input type="hidden" name="id" value="${user.id}">
        <table border="1">
            <tr><td>账号</td><td><input type="text" name="accountNo" value="${user.accountNo}"/></td></tr>
            <tr><td>用户名</td><td><input type="text" name="userName" value="${user.userName}"/></td></tr>
            <tr><td>性别</td><td><input type="text" name="sex" value="${user.sex}"/></td></tr>
            <tr><td>手机号</td><td><input type="text" name="phone" value="${user.phone}"/></td></tr>
            <tr><td>角色名称</td><td><input type="text" name="roleName" value="${user.roleName}"/></td></tr>
            <tr><td>角色部门</td><td><input type="text" name="department" value="${user.department}"/></td></tr>
            <tr><td>角色描述</td><td><textarea rows="5" cols="25" style="width: 170px;height:80px" name="remark" >${user.remark}</textarea></td></tr>
            <tr><td><input type="submit" value="提交"></td></tr>
        </table>
    </form>
</body>
</html>