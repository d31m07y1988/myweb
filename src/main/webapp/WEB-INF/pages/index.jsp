<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title><c:out value="${page.name}"/></title>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
</head>
<body>
<div class="container">

    <jsp:include page="fragments/pageHeader.jsp"/>

    <div class="jumbotron row">
        <c:out value="${page.description}"/>
        <div class="text-muted small">Дата создания: <c:out value="${page.created}"/></div>
    </div>

    <div class="row">
        <c:if test="${not empty catalog}">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>id</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Picture</th>
                    <th>Count</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${catalog}" var="catal">
                    <tr>
                        <td><c:out value="${catal.id}"/></td>
                        <td><c:out value="${catal.name}"/></td>
                        <td><c:out value="${catal.description}"/></td>
                        <td><c:out value="${catal.price}"/></td>
                        <td><img src="<c:out value="${catal.pictureLink}"/>"></td>
                        <td><c:out value="${catal.count}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>

    <jsp:include page="fragments/pageFooter.jsp"/>

</div>
</body>
</html>
