<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>MyKart</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<spring:url value="/resources/css/main.css" var="mainCss" />
	
<link rel="stylesheet"
	href="${mainCss}">

</head>
<body>

	<header>
		<nav class="navbar navbar-expand-lg navbar-light">
			<a class="navbar-brand" href="#">MyKart</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item active"><a class="nav-link" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Product</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Categories</a></li>
					
				</ul>
				
				 <form class="form-inline my-2 my-lg-0 search">
				     <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				     <button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Search</button>
					 <a class="btn btn-link" href="<c:url value="/login" />">Login</a>
					 <a class="btn btn-link" href="<c:url value="/logout" />">Logout</a>
					<button type="button" class="btn btn-link  cart">
						<i class="fa fa-shopping-cart" aria-hidden="true"></i>
					</button>
				 </form>
				
				
			</div>
		</nav>

	</header>