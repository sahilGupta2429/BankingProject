<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>COLLABORATIONS BANK</title>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery.layout-latest.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	$('body').layout({ applyDemoStyles: true });
});
</script>
	<link rel="stylesheet" href="../../jqwidgets/styles/jqx.base.css" type="text/css" />
    <script type="text/javascript" src="jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="jqxcore.js"></script>
    <script type="text/javascript" src="jqxsplitter.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="style.css"/>

</head>
<body>
<div class="row">
	<div class="ui-layout-north">
				<div class="col-md-3">
					<img alt="Bootstrap Image Preview" src="BankLogo.png" class="img-circle">
				</div>
				<div class="col-md-3">
					<h1>
						<STRONG>COLLABORATIONS<br>BANK</STRONG>
					</h1>
				</div>
				<div class="col-md-6">
					<div class="page-header">
						<h1>
							<small>PEOPLE Handled With Respect</small>
						</h1>
					</div>
				</div>
				</div>
</div>
<div class="formcontainer">
<div class="ui-layout-center">

<form:form class="well form-horizontal" action="EmployeeRegister.html" commandName="employee" >
<fieldset>
<legend>EMPLOYEE SIGN UP</legend>
	<div class="form-group">
		<label class="col-md-4 control-label">USERNAME</label>
		<div class="col-md-4 inputGroupContainer">
		<div class="input-group">
		<span class="input-group-addon"><i class = "glyphicon glyphicon-user"></i></span>
		<form:input path="username"/>
		</div>
		</div>
	</div>
	<div class="form-group">
  		<label class="col-md-4 control-label" >PASSWORD</label> 
    	<div class="col-md-4 inputGroupContainer">
    	<div class="input-group">
  		<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
  		<form:input path="password" type="password"/>
   		 </div>
  		</div>
	</div>
	<div class="form-group">
		<label class="col-md-4 control-label">NAME</label>
		<div class="col-md-4 inputGroupContainer">
		<div class="input-group">
		<span class="input-group-addon"><i class = "glyphicon glyphicon-user"></i></span>
		<form:input path="name" />
		</div>
		</div>
	</div>
	<div class="form-group">
  		<label class="col-md-4 control-label"></label>
  		<div class="col-md-4">
    	<button type="submit" class="btn btn-warning" >CREATE </button>
  		</div>
	</div>
	<h4>${employeeSignupError}</h4>
</fieldset>
</form:form>

</div>
</div>
<div class="ui-layout-south">
<div class="row2">
	<div>
		<div class="col-md-3">
			<h2>
				About Us :
			</h2>
			<p>
				This website was created by intelligent minds co.
				<br>
				@copyright
			</p>
			<p>
				<a class="btn" href="#">View details</a>
			</p>
		</div>
		<div class="col-md-4">
			<div class="carousel slide" id="carousel-752507">
				<ol class="carousel-indicators">
					<li data-slide-to="0" data-target="#carousel-752507">
					</li>
					<li data-slide-to="1" data-target="#carousel-752507" class="active">
					</li>
					<li data-slide-to="2" data-target="#carousel-752507">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item">
						<img alt="Carousel Bootstrap First" src="image1.jpg">
						<div class="carousel-caption">
							<h4>
								First Thumbnail label
							</h4>
						</div>
					</div>
					<div class="item active">
						<img alt="Carousel Bootstrap Second" src="image2.jpg"">
						<div class="carousel-caption">
							<h4>
								Second Thumbnail label
							</h4>
						</div>
					</div>
					<div class="item">
						<img alt="Carousel Bootstrap Third" src="image3.jpg">
						<div class="carousel-caption">
							<h4>
								Third Thumbnail label
							</h4>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-752507" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-752507" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
		<div class="col-md-5">
			 <a href="#" class="btn btn-lg active btn-link" type="button">Help Desk ?</a>
			<ul>
				<li>
					+91-7876107811
				</li>
				<li>
					sahil.5.gupta@niit-tech.com
				</li>
				<li>
					Collaboration bank , Tech -Zone 
					<br>
					Greater Noida
					<br>
					130120
					<br>
				</li>
			</ul>
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</body>
</html>