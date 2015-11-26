<!DOCTYPE html>
<html >
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <head>
    <meta charset="UTF-8">
    <title>Forgot Password Page</title>
    
    
    <link rel="stylesheet" href="css/reset.css">

    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="css/style.css">
    
  </head>

  <body>
<!-- Form Mixin-->
<!-- Input Mixin-->
<!-- Button Mixin-->
<!-- Pen Title-->
<div class="pen-title">
  <h1>Forgot Password?</h1><span>
</div>
<!-- Form Module-->
<div class="module form-module">
  <div class="form">
    
  </div>
  <div class="form">
    <h2>Enter your Email Id below:</h2>
	<form:form method="post" modelAttribute="testerDetails" action="verifyEmail.do">
      <input type="text" placeholder="Email"/>
      <button>Submit</button>
    </form:form>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='js/da0415260bc83974687e3f9ae.js'></script>

        <script src="js/index.js"></script>
    
  </body>
</html>
