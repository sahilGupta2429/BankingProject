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
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<style>
	body
	{
		background-image: http://www.w3schools.com/css/trolltunga.jpg;
	}
	</style>
</head>
<body>
<div class="row" style="background-color : #F5FFFA">
	<div class="ui-layout-north">
				<div class="col-md-3">
					<img alt="Bootstrap Image Preview" src="BankLogo.png" class="img-circle">
				</div>
				<div class="col-md-3">
					<h3>
						<STRONG>COLLABORATIONS<br>BANK</STRONG>
					</h3>
				</div>
				<div class="col-md-6">
					<div class="page-header">
						<h1>
							<small>PEOPLE Handled With Respect</small>
						</h1>
					</div>
				</div>
					<ul class="nav nav-tabs">
						<li>
							<a href="newUser.html">Register New User</a>
						</li>
						<li>
							<a href="balanceEnquiry.html">Balance Enquiry</a>
						</li>
						<li>
							<a href="deposit.html">Deposit</a>
						</li>
						<li>
							<a href="withdraw.html">Withdraw</a>
						</li>
						<li>
							<a href="report.html">Report</a>
						</li>
						<li>
							<a href="useraccount.html">Home</a>
						</li>
						<li>
							<a href="logout.html">Logout</a>
						</li>
					</ul>
				</div>
</div>
<div class="formcontainer">
<div class="ui-layout-center">
<form:form class="well form-horizontal" action="withdrawRequest.html" method="get" commandName="transaction">
<fieldset>
<legend>WITHDRAW</legend>
	<div class="form-group">
		<label class="col-md-4 control-label">ACCOUNT ID</label>
		<div class="col-md-4 inputGroupContainer">
		<div class="input-group">
		<span class="input-group-addon"><i class = "glyphicon glyphicon-user"></i></span>
		<form:input path="accountId"/>
		</div>
		</div>
	</div>
	
<!-- <div class="form-group"> 
	<label class="col-md-4 control-label">ACCOUNT TYPE</label>
	<div class="col-md-4 selectContainer">
		<div class="input-group">
			<span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
			<select name="accountType" class="form-control selectpicker" >
				<option value="Savings">SAVINGS ACCOUNT</option>
				<option value="Current">CURRENT ACCOUNT</option>
			</select>
		</div>
	</div>
</div>
 -->	<div class="form-group">
		<label class="col-md-4 control-label">AMOUNT</label>
		<div class="col-md-4 inputGroupContainer">
		<div class="input-group">
		<span class="input-group-addon"><i class = "glyphicon glyphicon-euro"></i></span>
		<form:input path="amount" />		</div>
		</div>
	</div>
	<div class="form-group">
  		<label class="col-md-4 control-label"></label>
  		<div class="col-md-4">
    	<button type="submit" class="btn btn-warning" >WITHDRAW</button>
  		</div>
	</div>
		<label class="col-md-4 control-label"> <h5>${balance}</h5></label>
		<label class="col-md-4 control-label"> <h5>${authenticationMessage}</h5></label>
</fieldset>
</form:form>
</div>
</div>
<div class="ui-layout-south">
<div class="row2" style="background-color : #F5FFFA">
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