<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-5
  Time: 下午4:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JMETER</title>
    <style>
        .table{ }
    </style>
</head>
<body>
<div class="table">
<table align=center>
    <tr>
        <td>服务地址:</td>
        <td><input type="text" required="required" id="url" placeholder="www.baidu.com"></td>
    </tr>
    <tr>
        <td>端口:</td>
        <td><input type="text"  required="required" id="port" placeholder="80"></td>
    </tr>
    <tr>
        <td>并发数:</td>
        <td> <input type="text"  required="required" id="projectname" placeholder="100"></td>
    </tr>

    <%--<tr>--%>
        <%--<td>serverlist:</td>--%>
        <%--<td><textarea id="slist" rows="10" cols="40"></textarea></td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>passcode:</td>--%>
        <%--<td><input type="text"  required="required" id="passcode"></td>--%>
    <%--</tr>--%>
    <tr>
        <td></td>
        <td> <button onclick=""  >开始</button></td></tr>
    <%--<tr>--%>
        <%--<td></td>--%>
        <%--<td> <button onclick="get_log_info()"  >一键停止</button></td></tr>--%>


</table>
</div>
</body>
</html>
