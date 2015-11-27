<!DOCTYPE html>

<html lang="en"> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <head> 
    <meta charset="utf-8" />  
    <!-- Change for better search engine indexing -->  
    <title>Web Site</title>  
    <meta name="title" content="Web site" />  
    <meta name="description" content="Your Web site description here" />  
    <meta name="keywords" content="Your Web site keywords here" />  
    <meta name="subject" content="Your Web Site subject here" />  
    <meta name="copyright" content="Your company or organization" />  
    <meta name="robots" content="All" />  
    <meta name="abstract" content="Site description here" />  
    <meta name="MSSmartTagsPreventParsing" content="true" />  
    <link id="theme" rel="stylesheet" type="text/css" href="../css/profileHeaderStyle.css" title="theme" />  
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:300|Open+Sans:300|Open+Sans+Condensed:700|Open+Sans:300|Open+Sans:300|Open+Sans:300italic" type="text/css" />  
	<script type="text/javascript" language="javascript" src="../javascript/jquery-1.8.1.min.js"></script>  
	<script type="text/javascript" language="javascript" src="../javascript/scripts.js"></script>  
	<script type="text/javascript" language="javascript" src="../javascript/theme.js"></script>  
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	
    <!-- Add your custom script here --> 
  </head>  
  <body> 
    <div class="tabs">
    <ul class="tab-links">
        <li class="active"><a href="#tab1">My Profile</a></li>
        <li><a href="#tab2">Personal</a></li>
        <li><a id="testDetails" href="#tab3">Test Details</a></li>
        
    </ul>
     <form:form id="editTesterFormID" method="post" modelAttribute="testerDetails" action="editTesterProfile.do">
 
    <div class="tab-content">
        <div id="tab1" class="tab active">
            <div>
            	<label>USERNAME        : </label>
            	<c:out value="${testerDetails.userName}"></c:out></div>
            <form:hidden id="userName" path="userName" value="${testerDetails.userName}"/>
            <div>
             
             <br/><br/><br/>
             <table width=100%>
             <tr>
             <td><label>Your email        : </label></td>
             <td><label>LinkedIn url        : </label></td>
             </tr>
             <tr>
             <td><form:input path="email" /></td>
             <td><form:input path="email" /></td>
             </tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
             <tr>
             <td><label>Balance Payment        : </label></td>
             <td><label>Ranking        : </label></td>
             </tr>
             <tr>
             <td><form:input path="email" /></td>
             <td><form:input path="email" /></td>
             </tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
             <tr>
             <td colspan="2" align="center"><label>Password        : </label></td>
             </tr>
             <tr>
             <td colspan="2" align="center"><form:input path="password" /></td>
             </tr>
             <tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
             <tr>
             <td colspan="2" align="center"><label>Confirm Password        : </label></td>
             </tr>
             <tr>
             <td colspan="2" align="center"><form:input path="password" /></td>
             </tr>
             </table>
       
            </div>
        </div>
 
        <div id="tab2" class="tab">
        
         <table width=100% align="center">
             <tr>
             <td><label>Your first name        : </label></td>
             <td align="left"><label>Your last name         : </label></td>
             </tr>
             <tr>
             <td><form:input id="Fname" path="firstName" cssStyle="width: 95%" disabled="true"/></td>
             <td><form:input id="Lname" path="lastName" cssStyle="width: 95%" disabled="true"/></td>
             </tr>
            <!--  <tr>
             <td align="left"><a class="editFname" href="#" >change</a>
             <a hidden="true" class="saveFname" href="" >save</a></td>
             <td align="left"><a class="editLname" href="#" >change</a>
             <a hidden="true" class="saveLname" href="#" >save</a></td>
             </tr> -->
             <tr><td>&nbsp;</td></tr>
             <tr>
             <td><label>Your Address        : </label></td>
             <td><label>Your DOB        : </label></td>
             </tr>
             <tr>
             <td><form:input id="Address" path="address" cssStyle="width: 95%" disabled="true"/></td>
             <td><form:input id="Age" path="age" cssStyle="width: 95%" disabled="true"/></td>
             </tr>
             <!--  <tr>
             <td align="left"><a class="editAddress" href="#" >change</a>
             <a hidden="true" class="saveAddress" href="#" >save</a></td>
             <td align="left"><a class="editAge" href="#" >change</a>
             <a hidden="true" class="saveAge" href="#" >save</a></td>
             </tr> -->
             <tr><td>&nbsp;</td></tr>
             <tr>
             <td><label>Education        : </label></td>
             <td><label>Occupation        : </label></td>
             </tr>
             <tr>
             <td><form:input id="Edu" path="education" cssStyle="width: 95%" disabled="true"/></td>
             <td><form:input id="Occupation" path="occupation" cssStyle="width: 95%" disabled="true"/></td>
             </tr>
             <!--  <tr>
             <td align="left"><a class="editEdu" href="#" >change</a>
             <a hidden="true" class="saveEdu" href="#" >save</a></td>
             <td align="left"><a class="editOccupation" href="#" >change</a>
             <a hidden="true" class="saveOccupation" href="#" >save</a></td>
             </tr> -->
             
             <tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
             
         </table>
        <button type="button" id="editProfileData" value="EDIT">EDIT</button>
       <!--  <button type="button" id="saveProfileData" value="SAVE">SAVE</button> -->
        <form:button id="saveProfileData" value="SAVE" disabled="true">SAVE</form:button>
        
        </div>
 
        <div id="tab3" class="tab">
        	
        	
        </div>
 
      
         
    </div>
    </form:form>
</div>

  </body> 
</html>
