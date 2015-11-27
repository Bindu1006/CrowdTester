<!DOCTYPE html>
<html >
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    
    
    <link rel="stylesheet" href="../css/loginReset.css">

    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/print.css" media="print">
<script src="../javascript/jquery-1.6.4.min.js"></script>
<script src="../javascript/custom.js"></script>
        <link rel="stylesheet" href="../css/style.css">
    
  </head>

  <body>
  <header class="clearFix">
  <div class="wrap"> <a id="logo" href="#">CrowdTester</a>
    <hr>
    <nav>
      <div id="nav"> <strong>Navigation</strong>
        <ul>
          <li class="active"> <a href="showHomePage.do">Home</a> </li>
          <li class="parent"> <a href="#">For Clients</a>
          <ul>
              <li> <a href="#">Testing Services</a> </li>
              <li> <a href="#">How it Works</a> </li>
              <li> <a href="#">Pricing</a> </li>
              <li> <a href="#">FAQ</a> </li>
              <li> <a href="../register/showAppProviderRegistration.do">Sign up</a> </li>
            </ul>
          </li>
          <li class="parent"> <a href="#">For Testers</a>
            <ul>
              <li> <a href="../register/showTesterRegistration.do">Become a Tester</a> </li>
              <li> <a href="#">The Community</a> </li>
              <li> <a href="#">FAQ</a> </li>
            </ul>
          </li>
          <li> <a href="#">About us</a> </li>
          <li> <a href="#">Contact us</a> </li>
        </ul>
      </div>
    </nav>
  </div>
</header>

<!-- Form Mixin-->
<!-- Input Mixin-->
<!-- Button Mixin-->
<!-- Pen Title-->
<br>
<br>
<div class="pen-title">
  <h1>CrowdTester Login Form</h1>
</div>
<!-- Form Module-->
<div class="module form-module">
 <div class="form"> 
    
  </div>
  <div class="form">
    <h2>Login to your account</h2>

    <form:form method="post" modelAttribute="loginDetails" action="authenticate.do">
    <form:input path="userName" placeholder="Username"/>
    <form:input type="password" path="password" placeholder="Password"/>
      <!-- <input type="text" placeholder="Username"/>
      <input type="password" placeholder="Password"/> -->

      <button>Login</button>
      
      <br>
   	  <div align="center"><span class="error" style="color:red" >${ERROR}</span></div>
      
    </form:form>
  </div>
  <div class="cta"><a href="showForgotPasswordPage.do">Forgot Password?</a></div>

</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>


        <script src="../javascript/index.js"></script>
    <br>
<br>
  </body>
  <footer class="clearFix">
  <div class="wrap clearFix">
    <p class="floatRight"> Copyright &copy; 2012 <a href="#">Your Name</a> &ndash; All Rights Reserved<br>
      Template by <a target="_blank" href="http://www.templatestar.net">Templatestar</a> &amp; <a target="_blank" href="http://www.os-templates.com/">OS Templates</a></p>
    <p class="socialIcons"> <a href="#" class="rss">RSS</a> <a href="#" class="facebook">Facebook</a> <a href="#" class="twitter">Twitter</a> </p>
  </div>
</footer>
</html>