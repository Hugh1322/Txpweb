<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="rule" uri="http://demo.com/rule"%>
<%
    String path = request.getContextPath();
    //String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    String basePath = path;
%>
<link rel="Shortcut Icon" href="<%=basePath%>/images/favicon.ico"/>
<script type="text/javascript">
    var basePath = '<%=basePath%>';
</script>
