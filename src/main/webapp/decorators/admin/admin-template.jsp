<%--
  Created by IntelliJ IDEA.
  User: anhtran
  Date: 6/3/20
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../tags/tagslib.jsp" %>

<html>
<head>
    <title>Template</title>
    <%@ include file="head.jsp" %>
    <dec:head />
</head>
<body class="hold-transition sidebar-mini layout-fixed layout-navbar-fixed layout-footer-fixed">
<div class="wrapper">
    <%@include file="navbar.jsp"%>
    <%@include file="sidebar.jsp"%>
    <dec:body />
    <%@ include file="footer.jsp"%>
</div>
</body>
<%@ include file="js.jsp"%>
</html>
