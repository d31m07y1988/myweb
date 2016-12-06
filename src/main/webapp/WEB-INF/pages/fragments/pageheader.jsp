<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="page-header row">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <div class="navbar-brand"><c:out value="${page.name}"/></div>
            </div>
            <ul class="nav navbar-nav pull-right">
                <li><a href="/">Home</a></li>
                <li><a href="about.html">About</a></li>
                <li><a href="catalog.html">Catalog</a></li>
            </ul>
        </div>
    </nav>
</div>