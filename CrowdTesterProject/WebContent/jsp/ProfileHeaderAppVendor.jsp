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
    <!-- Add your custom script here --> 
  </head>  
  <body> 
    <div class="tabs">
    <ul class="tab-links">
        <li class="active"><a href="#tab1">My Profile</a></li>
        <li><a href="#tab2">Personal</a></li>
        </ul>
     <form:form id="editAppVendorFormID" method="post" modelAttribute="appVendorDetails" action="editAppVendorProfile.do">
 
    <div class="tab-content">
        <div id="tab1" class="tab active">
            <div>
            	<label>USERNAME        : </label>
            	<c:out value="${appVendorDetails.userName}"></c:out>
            </div>
            <div>
             
             <br/><br/><br/>
             <table width=100%>
             <tr>
             <td><label>Your email        : </label></td>
             <td><label>LinkedIn url        : </label></td>
             </tr>
             <tr>
             <td><form:input path="contactEmail" /></td>
             <td><form:input path="contactEmail" /></td>
             </tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
             <tr>
             <td><label>Balance Payment        : </label></td>
             <td><label>Ranking        : </label></td>
             </tr>
             <tr>
             <td><form:input path="contactEmail" /></td>
             <td><form:input path="contactEmail" /></td>
             </tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
             <tr><td>&nbsp;</td></tr>
          <!--    <tr>
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
             </tr> -->
             </table>
       
            </div>
        </div>
 
        <div id="tab2" class="tab">
        
         <table width=100% align="center">
             <tr>
             <td><label>Company name        : </label></td>
             <td ><label>Company email         : </label></td>
             </tr>
             <tr>
             <td><form:input id="Name" path="companyName" cssStyle="width: 95%" disabled="true"/></td>
             <td><form:input id="email" path="contactEmail" cssStyle="width: 95%" disabled="true"/></td>
             </tr>
            
             <tr><td>&nbsp;</td></tr>
             <tr>
             <td><label>Your Website        : </label></td>
             <td><label>Your Phone Number        : </label></td>
             </tr>
             <tr>
             <td><form:input id="Address" path="companyWebsite" cssStyle="width: 95%" disabled="true"/></td>
             <td><form:input id="Age" path="phoneNumber" cssStyle="width: 95%" disabled="true"/></td>
             </tr>
             <tr>
            
             <tr><td>&nbsp;</td></tr>
             <tr>
             <td><label>Password        : </label></td>
             <td><label>Confirm Password       : </label></td>
             </tr>
             <tr>
             <td><form:input id="Edu" path="password" cssStyle="width: 95%" disabled="true"/></td>
             <td><form:input id="Occupation" path="confirmPassword" cssStyle="width: 95%" disabled="true"/></td>
             </tr>
             
             <tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
             
         </table>
        <button type="button" id="editAppVendorProfileData" value="EDIT">EDIT</button>
       <!--  <button type="button" id="saveProfileData" value="SAVE">SAVE</button> -->
        <form:button id="saveAppVendorProfileData" value="SAVE" disabled="true">SAVE</form:button>
        
        </div>
 
        <div id="tab3" class="tab">
            <p>Tab #3 content goes here!</p>
            <p>Donec pulvinar neque sed semper lacinia. Curabitur lacinia ullamcorper nibh; quis imperdiet velit eleifend ac. Donec blandit mauris eget aliquet lacinia! Donec pulvinar massa interdum ri.</p>
        </div>
 
        <div id="tab4" class="tab">
            <p>Tab #4 content goes here!</p>
            <p>Donec pulvinar neque sed semper lacinia. Curabitur lacinia ullamcorper nibh; quis imperdiet velit eleifend ac. Donec blandit mauris eget aliquet lacinia! Donec pulvinar massa interdum risus ornare mollis. In hac habitasse platea dictumst. Ut euismod tempus hendrerit. Morbi ut adipiscing nisi. Etiam rutrum sodales gravida! Aliquam tellus orci, iaculis vel.</p>
        </div>
         
    </div>
    </form:form>
</div>

  </body> 
</html>
