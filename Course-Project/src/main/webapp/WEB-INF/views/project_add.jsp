<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>

	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css" />" type="text/css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
</head>
<body>
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
		<div class="container">
			<div class="row">
				<form action="<spring:url value="/project/add"/>" method="post" class="col-md-8 col-md-offset-2">
				
					<div class="form-group">
						<label for="project-name">Name</label>
						<input type="text" id="project-name"
									class="form-control" name="name"/>
					</div>
					
					<div class="form-group">
						<label for="project-type">Type</label>
						<select name="type" class="selectpicker">
							<option>Nothing Selected</option>
							<option value="single">Single Year</option>
							<option value="mutli">Multi Year</option>
						</select>
					</div>
					<div class="form-group">
						<label for="sponsor">Sponsor</label>
						<input id="sponsor" type="text"
								class="form-control" name="sponsor"/>
					</div>
					
					<div class="form-group">
						<label for="funds">Authorized Funds</label>
						<input type="text" id="funds"
									class="form-control" name="authorizedFunds"/>
					</div>
					
					<div class="form-group">
						<label for="hours">Authorized Hours</label>
						<input type="text" id="hours"
									class="form-control" name="authorizedHours"/>
					</div>
					
					<div class="form-group">
						<label for="hours">Year</label>
						<input type="text" id="year"
									class="form-control" name="year"/>
					</div>
					
					<div class="form-group">
						<label for="project-name">Description</label>
						<textarea class="form-control" rows="3" name="description"></textarea>
					</div>
					
					<div class="form-group">
						<label for="special">special</label>
						<input type="checkbox" name="special"></input>
					</div>
					
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
</body>
</html>