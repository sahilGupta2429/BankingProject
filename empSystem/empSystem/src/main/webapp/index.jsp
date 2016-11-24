<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title>Welcome</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">
	<link rel="stylesheet" href="assets/css/font-awesome.min.css">

    <script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/modernizr.custom.js"></script>
	

	
    <link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=EB+Garamond' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="assets/js/html5shiv.js"></script>
      <script src="assets/js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body data-spy="scroll" data-offset="0" data-target="#theMenu">
		
	<!-- Menu -->
	<nav class="menu" id="theMenu">
		<div class="menu-wrap">
			<h1 class="logo" style="color:white";>&nbsp;&nbsp;Menu</h1>
			<i class="icon-remove menu-close"></i>
			<a href="#home" class="smoothScroll">Home</a>
			<a href="#about" class="smoothScroll">About Us</a>
			<a href="login.html#portfolio" class="smoothScroll">Login</a>
			<a href="http://www.facebook.com"><i class="icon-facebook"></i></a>
			<a href="http://www.twitter.com"><i class="icon-twitter"></i></a>
		</div>
		
		<!-- Menu button -->
		<div id="menuToggle" style="padding-top: 12px"><i class="icon-reorder"></i></div>
	</nav>


	
	<!-- ========== HEADER SECTION ========== -->
	<section id="home" name="home"></section>
	<div id="headerwrap">
		<div class="container">
			<div class="logo">
				<img src="assets/img/logo.png">
			</div>
			<br>
			<div class="row">
				<h1>Miami Collaborations Bank</h1>
				<br>
				<h3>Welcome </h3>
				<br>
				<h4 style="color:white";>${employeeId}</h4>
				<br>
				<div class="col-lg-6 col-lg-offset-3">
				</div>
			</div>
		</div><!-- /container -->
	</div><!-- /headerwrap -->
	
	
	
	<!-- ========== ABOUT SECTION ========== -->
	<section id="about" name="about"></section>
	<div id="f">
		<div class="container">
			<div class="row">
				<h3>About Us</h3>
				<p class="centered"><i class="icon icon-circle"></i><i class="icon icon-circle"></i><i class="icon icon-circle"></i></p>

				<div class="col-lg-6 col-lg-offset-3">
					<p>The Miami Collaborations Bank (MCB) may assume deposits<br> 
					 of banks or allow other banks to assume them. The largest<br> 
					banks to be acquired have been the presumed Merrill Lynch acquisition<br>
					by Bank of America, the Bear Stearns and Washington Mutual acquisitions<br>
					by JPMorgan Chase, and the Countrywide Financial acquisition also by<br>
					Bank of America.IndyMac Bank was also a large bank that was changed<br>
					into a bridge bank by the FDIC, after its failure, until the funds can<br>
					be disposed of. In addition, the investmentbank Lehman Brothers has filed
					for Chapter 11 bankruptcy protection.<br>
					</p>
				</div>								
			</div>
		</div><!-- /container -->
	</div><!-- /f -->
	

	<!-- ========== CONTACT SECTION ========== -->
	<section id="contact" name="contact"></section>
	<div id="f">
		<div class="container" style="margin-left: 30%; margin-right: 30%">
			<div class="row">
				<h3>CONTACT ME</h3>
				<p class="centered"><i class="icon icon-circle"></i><i class="icon icon-circle"></i><i class="icon icon-circle"></i></p>
				
				<div class="col-lg-6 col-lg-offset-3">
					<p>Miami Launge, 987<br/>Miami, Florida<br/>+34 8984-4343</p>
					<p>contact@mcb.com</p>
					<p><button type="button" class="btn btn-warning">YEAH! CONTACT ME NOW!</button></p>
				</div>
			</div>
		</div>
	</div>

	

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	<script src="assets/js/classie.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/smoothscroll.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>
