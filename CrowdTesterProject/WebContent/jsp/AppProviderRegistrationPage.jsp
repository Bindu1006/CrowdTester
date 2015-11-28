<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en_GB" lang="en_GB">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <head>
        <title>Mobile App Provider Registration Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="../css/Registration.css"/>
    </head>
    <body>    
        <form:form method="post" modelAttribute="appVendorDetails" action="registerAppProvider.do" class="register">
            <h1>Mobile App Provider Registration Form</h1>
            <fieldset class="row1">
                <legend>Account Details
                </legend>
                <div>
                    <label>Email *</label>
                    <form:input path="contactEmail" placeholder="EMAIL"/>
                    <form:errors path="contactEmail" cssStyle="color: #ff0000;"/>
                    
                  </div>
                  
                  <td><label>  </label></td>
                  
                  <div>  
                    <label>Username *</label>
                    <form:input path="userName" placeholder="Username"/>
                    <form:errors path="userName" cssStyle="color: #ff0000;"/>
                    
                    
               </div></fieldset>
               <br></br>
               <fieldset class="row1">
               	<div>
                    <label>Password *
                    </label>
                    <form:input path="password" placeholder="Password"/>
                    <form:errors path="password" cssStyle="color: #ff0000;"/>
                  </div>
                 <td><label>  </label></td>
                  <div>  
                    <label>Confirm Password *
                    </label>
                    <form:input path="confirmPassword" placeholder="Password"/>
                    <form:errors path="confirmPassword" cssStyle="color: #ff0000;"/>
                    <!-- <label class="obinfo">* obligatory fields -->
                    </label>
                    
                    
                   </div>
                
            </fieldset>
            
            
            
            
            
            
            
            <fieldset class="row2">
                <legend>Company Details
                </legend>
                <p>
                    <label>Company Name *
                    </label>
                    <form:input path="companyName" placeholder="Company"/>
                    <form:errors path="companyName" cssStyle="color: #ff0000;"/>
                    
                </p>
                 
                <p>
                    <label>Phone *
                    </label>
                    <form:input path="phoneNumber" placeholder="Phone Number"/>
                    <form:errors path="phoneNumber" cssStyle="color: #ff0000;"/>
                </p>
                <p>
                    <label class="optional">Registered Address
                    </label>
                    <form:input path="address" placeholder="Address"/>
                    <form:errors path="address" cssStyle="color: #ff0000;"/>
                </p>
                <p>
                    <label class="optional">Company Website
                    </label>
                    <form:input path="companyWebsite" placeholder="http://"/>
                    <form:errors path="companyWebsite" cssStyle="color: #ff0000;"/>

                </p>
            </fieldset>
                
            </fieldset>
            <fieldset class="row4">
                <legend>Terms and Mailing
                </legend>
                <p class="agreement">
                    <input type="checkbox" value=""/>
                    <label>*  I accept the <a href="SLA_AppProvider.txt">Terms and Conditions</a></label>
                </p>
            </fieldset>
            <div><button class="button">Register &raquo;</button></div>
        </form:form>
    </body>
</html>