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
    function selectUser () {
        $.ajax({
            type: "post",
            url: 'getUserPageList',
            dataType: "json",
            data: $("#selectUser").serialize(),
            async: true,
            success: function (result) {
                //拼接字符串
                var str = '';
                // 对数据做遍历，拼接到页面显示
                for(var i=0;i<result.length;i++){
                    str += '<tr>'+
                                '<td>'+ result[i].accountNo +'</td>'+
                                '<td>'+ result[i].userName +'</td>'+
                                '<td>'+ result[i].sex +'</td>'+
                                '<td>'+ result[i].phone +'</td>'+
                                '<td>'+ result[i].roleId +'</td>'+
                                '<td>'+ result[i].status +'</td>'+
                                '<td>'+ result[i].createTime +'</td>'+
                                '<td><a href="DeleteById?id='+ result[i].id + '">删除</a><a href="ViewUser?id=' + result[i].id +'">修改</a></td>'+
                            '</tr>';
                }
                $("#formHeader").after(str);
            },
            error: function (e) {
                alert("服务开小差了!");
            }
        })
    }

    $(function () {
        selectUser();
    });
</script>
    <form id="selectUser">
        <table>
            <tr>
                账号<input type="text" name="accountNo"/>
                用户名<input type="text" name="userName" />
                性别<input type="text" name="sex" />
                <input type="button" onclick="selectUser()" value="搜索">
            </tr>
            <tr>
                <td>
                    第
                    <c:forEach begin="1" end="${pageInfo.sumPages}" varStatus="num">
                    <button type="submit">${num.index}</button>
                    </c:forEach>
<%--                    ${pageInfo.pageCurrent}--%>
                    页
                </td>
                <td>共${pageInfo.sumPages}页</td>
                <td>共${pageInfo.sumCounts}条</td>
                <td>
                    <input type="text" list="pageSizeData" id="pageSize" value="${pageInfo.pageSize}">条/页
                    <datalist id="pageSizeData">
                        <option value="10">10</option>
                        <option value="20">20</option>
                        <option value="30">30</option>
                        <option value="40">40</option>
                    </datalist>
                    <select id="pageSize" name="pageSize" >
<%--                        <c:forEach items ="${roleList}" var="role">--%>
                            <c:if test="${UserVo.roleName == role.roleName}">
                                <option selected="selected" value="${role.id}">${role.roleName}</option>
                            </c:if>
                            <c:if test="${UserVo.roleName != role.roleName}">
                                <option value="${role.id}">${role.roleName}</option>
                            </c:if>
<%--                        </c:forEach>--%>
                    </select>
                </td>
            </tr>
        </table>
    </form>
    <table border="1">
        <tr id="formHeader">
            <td>账号</td>
            <td>用户名</td>
            <td>性别</td>
            <td>手机号</td>
            <td>角色</td>
            <td>状态</td>
            <td>创建时间</td>
            <td>操作</td>
        </tr>
    </table>
</body>

</html>