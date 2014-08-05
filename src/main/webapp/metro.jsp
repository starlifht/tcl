<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-5
  Time: 上午11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航</title>
    <style>
        body{font-family:"微软雅黑";}

        /*a:link,a:visited{text-decoration:none;color: black}*/
        /*a:hover{text-decoration:a  }*/
        .master{width: 900px;height: 800px;text-align: center; line-height:120px;margin-right: auto;margin-left: auto; margin-top: 200px; }
        .pan{cursor:pointer;font-size: 33px;}
        .pan:hover{opacity:0.8;-webkit-box-shadow:  5px 5px 20px #909090;}
        .pan1{background: red;width: 200px;float:left;}
        .pan2{background: dodgerblue;float: left;width: 700px}
        .pan3{background: orange;width: 300px;float: left}
        .pan4{background: gold;width: 150px;float: left}
        .pan5{background: hotpink;width: 450px;float: left}
    </style>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>

</head>
<body>
<div class ="master">
    <div class="pan pan1" onclick="window.open('http://maven.lab.tclclouds.com/nexus/#welcome');">MAVEN库</div>
    <div class="pan pan2"  onclick="window.open('http://121.40.71.149:7990');">GIT</div>
    <div class="pan pan3" onclick="window.open('http://121.40.71.149:7990');">新浪</div>
    <div class="pan pan4">阿里</div>
    <div class="pan pan5">腾讯</div>
</div>
</body>
</html>
