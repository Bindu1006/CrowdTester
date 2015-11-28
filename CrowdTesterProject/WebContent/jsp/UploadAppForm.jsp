<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    <head>
        <title>Create new Task Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="../css/Registration.css"/>
    </head>
    <body>    
     <form:form method="post" modelAttribute="uploadAppBO" action="../saveAppDetails/showAppSaveform.do" class="register">
 
            <h1>Upload an Application</h1>
            <fieldset class="row1">
                <legend>App details
                </legend>
                <p>
                    <label>App Name *
                    </label>
                    <form:input path="App_Name" type="text"/>
                    <label>Description *
                    </label>
                    <form:input path="Description" type="text" class="long"/>
                </p>
                <p>
                    <label>Product OS*
                    </label>
                     <form:select path ="Product_Os">
                         <form:option value="iOS">iOS</form:option>
                         <form:option value="android">Android</form:option>
                         <form:option value="Windows">Windows</form:option>
                         <form:option value="blackberry">Blackberry</form:option>
                    </form:select>
                    <label class="obinfo">* obligatory fields
                    </label>
                </p>
            </fieldset>
            <fieldset class="row2">
                <legend>Further Information
                </legend>
                <p>
                    <label>App Size
                    </label>
                    <form:input path="App_Size" type="text" value="GB" />
                </p>
                <p>
                    <label>App Language *</label>
                    <form:select path="APP_Language">
                         <form:option value="english">English</form:option>
                         <form:option value="spanish">Spanish</form:option>
                         <form:option value="Mandarin Chinese">Mandarin Chinese</form:option>
                         <form:option value="hindi">Hindi</form:option>
                    </form:select>
                </p>
                <p>
                    <label>App Provider
                    </label>
                    <form:input path ="App_Provider" type="text" maxlength="10"/>
                </p>
                <p>
                    <label class="optional">App Vendor Username
                    </label>
                    <form:input path ="App_Vendor_Details_UserName" type="text" class="long"/>
                </p>
                <p>
                    <label>Upload app file
                    </label>
                    <form:input path="Download_Link" class="long" type="text" value="Copy the link here" />

                </p>
                 <p>
                    <label class="optional">Upload app document file
                    </label>
                    <form:input  path="App_Document" class="long" type="text"/>

                </p>

               
            </fieldset>
            <fieldset class="row3">
                <legend>Test Details
                </legend>
                
                <p>
                    <label>Test Type *</label> 
                    <form:input path="Test_Type" type="text" />
                </p>
                  <p>
                 
               <!--    <label>Deadline *
                    </label>
                    <select class="date">
                        <option value="1">01
                        </option>
                        <option value="2">02
                        </option>
                        <option value="3">03
                        </option>
                        <option value="4">04
                        </option>
                        <option value="5">05
                        </option>
                        <option value="6">06
                        </option>
                        <option value="7">07
                        </option>
                        <option value="8">08
                        </option>
                        <option value="9">09
                        </option>
                        <option value="10">10
                        </option>
                        <option value="11">11
                        </option>
                        <option value="12">12
                        </option>
                        <option value="13">13
                        </option>
                        <option value="14">14
                        </option>
                        <option value="15">15
                        </option>
                        <option value="16">16
                        </option>
                        <option value="17">17
                        </option>
                        <option value="18">18
                        </option>
                        <option value="19">19
                        </option>
                        <option value="20">20
                        </option>
                        <option value="21">21
                        </option>
                        <option value="22">22
                        </option>
                        <option value="23">23
                        </option>
                        <option value="24">24
                        </option>
                        <option value="25">25
                        </option>
                        <option value="26">26
                        </option>
                        <option value="27">27
                        </option>
                        <option value="28">28
                        </option>
                        <option value="29">29
                        </option>
                        <option value="30">30
                        </option>
                        <option value="31">31
                        </option>
                    </select>
                    <select>
                        <option value="1">January
                        </option>
                        <option value="2">February
                        </option>
                        <option value="3">March
                        </option>
                        <option value="4">April
                        </option>
                        <option value="5">May
                        </option>
                        <option value="6">June
                        </option>
                        <option value="7">July
                        </option>
                        <option value="8">August
                        </option>
                        <option value="9">September
                        </option>
                        <option value="10">October
                        </option>
                        <option value="11">November
                        </option>
                        <option value="12">December
                        </option>
                    </select>
                    <input class="year" type="text" size="4" maxlength="4"/>e.g 1976
                </input>
                </p>
                -->  
                  <label class="optional">Date sample
                    </label>
                    <form:input path ="Test_DeadLine" type="text" class="long"/>
                
                 <p>
                    <label class="long">Reporting Languages *
                    </label>
                     <form:select path="Reporting_Language">
                         <form:option value="english">English</form:option>
                         <form:option value="spanish">Spanish</form:option>
                         <form:option value="Mandarin Chinese">Mandarin Chinese</form:option>
                         <form:option value="hindi">Hindi</form:option>
                    </form:select>
                </p>
				
              <p>
             
                   
               
            </fieldset>
            <fieldset class="row4">
                <legend>Terms and Mailing
                </legend>
                <p class="agreement">
                    <input type="checkbox" value=""/>
                    <label>*  I accept the <a href="SLA_Tester.txt">Terms and Conditions</a></label>
                </p>
            </fieldset>
            <div><button class="button">Continue Uploading &raquo;</button></div>
        
           </form:form>
          
    </body>
</html>





