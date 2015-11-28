<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <head>
        <title>Tester Registration Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="../css/Registration.css"/>
    </head>
    <body>    
        <form:form method="post" modelAttribute="testerDetails" action="registerTester.do" class="register">
            <h1>Tester Registration Form</h1>
            <fieldset class="row1">
                <legend>Account Details
                </legend>
                <div>
                    <label>Email *
                    </label>
                    <form:input path="email" placeholder="EMAIL"/>
                    <form:errors path="email" cssStyle="color: #ff0000;"/>
                 </div>
                 <td><label>  </label></td>
                 <div>
                    <label>Username *
                    </label>
                    <form:input path="userName" placeholder="Username"/>
                    <form:errors path="userName" cssStyle="color: #ff0000;"/>
                </div>
                
                </fieldset>
               <br></br>
               <fieldset class="row1">
                <div>
                    <label>Password*
                    </label>
                    <form:input path="password" placeholder="Password"/>
                    <form:errors path="password" cssStyle="color: #ff0000;"/>
                 </div>
                 <td><label>  </label></td>
                 <div>
                    <label>Confirm Password*
                    </label>
                    <form:input path="confirmPassword" placeholder="Password"/>
                    <form:errors path="confirmPassword" cssStyle="color: #ff0000;"/>
                    
                    </label>
                </div>
            </fieldset>
            <br></br>
            
            <fieldset class="row2">
                <legend>Personal Details
                </legend>
                <p>
                    <label>First Name *
                    </label>
                    <form:input path="firstName" placeholder="First Name"/>
                    <form:errors path="firstName" cssStyle="color: #ff0000;"/>
                </p>
                  <p>
                    <label>Last Name *
                    </label>
                    <form:input path="lastName" placeholder="Last Name"/>
                    
                </p>
                <p>
                    <label>Phone *
                    </label>
                    <form:input path="phoneNumber" placeholder="Phone Number"/>
                    
                </p>
                <p>
                    <label class="optional">Address
                    </label>
                    <form:input path="address" placeholder="Address"/>
                    
                </p>
                 <p>
                    <label>Occupation *
                    </label>
                    <form:input path="occupation" placeholder="Work"/>
					<form:errors path="occupation" cssStyle="color: #ff0000;"/>

                </p>
            </fieldset>
            <fieldset class="row3">
                <legend>Further Information
                </legend>
                
                 <p>
                    <label>Gender *</label>
                    <form:radiobutton class="gender" path="gender" value="M" />
                    
                     <label class="gender">Male</label>    							
                    <form:radiobutton class="gender" path="gender" value="F"/>
                    
                     <label class="gender">Female</label>
                </p> 
                <p>
                    <label>Age *</label> 
                    <form:input path="age" placeholder="Age"/>
                    
                </p>
               
                 <p>
                    <label class="long">Testing Languages *
                    </label>
                    <form:input path="preferredTestLang" placeholder="Language" class="long"/>
                    <form:errors path="preferredTestLang" cssStyle="color: #ff0000;"/>
                </p>
                <p>
                    <label>Experience *
                    </label>
                    <form:input path="experience" placeholder="Experience" maxlength="2" />
                    <form:errors path="experience" cssStyle="color: #ff0000;"/>
                </p>
                 <p>
                    <label>Education *
                    </label>
                    <form:input path="education" placeholder="Education" maxlength="2" />
                    <form:errors path="education" cssStyle="color: #ff0000;"/>

                </p>
                
            </fieldset>
            <fieldset class="row4">
                <legend>Terms and Mailing
                </legend>
                <p class="agreement">
                    <input type="checkbox" value=""/>
                    <label>*  I accept the <a href="SLA_Tester.txt">Terms and Conditions</a></label>
                </p>
            </fieldset>
            <div><button class="button">Register &raquo;</button></div>
        </form:form>
    </body>
</html>