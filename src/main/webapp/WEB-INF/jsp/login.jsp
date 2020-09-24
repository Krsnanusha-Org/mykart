<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value=""/>

<jsp:directive.include file="header.jsp" />

	<div class="container">

	<c:if test="${not empty error}">
		<div class="alert alert-danger">
			<spring:message
				code="AbstractUserDetailsAuthenticationProvider.badCredentials" />
			<br />
		</div>
	</c:if>

	<form method="POST" action="/doLogin" class="form-signin">
	        <h2 class="form-heading">Log in</h2>
	
	        <div class="form-group ">
	            <span></span>
	            <input name="username" type="text" class="form-control" placeholder="Username"
	                   autofocus="true"/>
	            <input name="password" type="password" class="form-control" placeholder="Password"/>
	            <span></span>
	
	            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
	        </div>
	
	    </form>
	
	</div>
<!-- /container -->
<jsp:directive.include file="footer.jsp" />