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
    <title>MIE内部导航</title>
    <style>
        body {
            font-family: "微软雅黑",sans-serif;
            background: black
        }

        /*a:link,a:visited{text-decoration:none;color: black}*/
        /*a:hover{text-decoration:a  }*/
        .logo {
            color: grey;
            font-size: 60px;
            font-weight: bold;
        }

        .master {
            width: 900px;
            height: 800px;
            text-align: center;
            line-height: 120px;
            margin-right: auto;
            margin-left: auto;
            margin-top: 100px;
        }

        .pan {
            cursor: pointer;
            font-size: 33px;
            color: whitesmoke;
            font-weight: bold;
            margin: 0 5px 5px 0
        }

        .pan:hover {
            opacity: 0.8;
            -webkit-box-shadow: 0 0 20px #909090;
            -moz-box-shadow: 0 0 20px 909090
        }

        .pan1 {
            background: red;
            width: 330px;
            float: left;
        }

        .pan2 {
            background: dodgerblue;
            float: left;
            width: 150px
        }

        .pan3 {
            background: orange;
            width: 405px;
            float: left
        }

        .pan4 {
            background: gold;
            width: 205px;
            float: left
        }

        .pan5 {
            background: hotpink;
            width: 385px;
            float: left;
        }
        .pan6 {
            background: greenyellow;
            width: 295px;
            float: left;
        }
    </style>
    <script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
    <link rel="Shortcut Icon" href="/img/logo.ico">
</head>
<body onload="if (window.navigator.userAgent.indexOf('MSIE') >= 0) {alert('Don\'t Support IE');}">
<div class="logo">
    TCL
</div>
<div class="master">
    <div class="pan pan1" onclick="window.open('http://maven.lab.tclclouds.com/nexus/#welcome');">MAVEN库</div>
    <div class="pan pan2" onclick="window.open('http://121.40.71.149:7990');">GIT</div>
    <div class="pan pan3" onclick="window.open('http://121.40.71.149:8090/dashboard.action');">WIKI文档</div>
    <div class="pan pan4" onclick="window.open('http://jira.lab.tclclouds.com/secure/Dashboard.jsp');">JIRA</div>
    <div class="pan pan5" onclick="window.open('https://mailsz.tct.tcl.com/owa');" >MAIL</div>
    <div class="pan pan6" onclick="window.open('http://ep.tclcom.com');">EP</div>
</div>
</body>
</html>
