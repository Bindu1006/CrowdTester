$(document).ready( function() {

	    jQuery('.tabs .tab-links a').on('click', function(e)  {
	        var currentAttrValue = jQuery(this).attr('href');
	 
	        // Show/Hide Tabs
	        jQuery('.tabs ' + currentAttrValue).show().siblings().hide();
	 
	        // Change/remove current tab to active
	        jQuery(this).parent('li').addClass('active').siblings().removeClass('active');
	 
	        e.preventDefault();
	    });
	    
//	    $('#editProfileData').click(function () {
//	    	alert("Success");
//	    $.ajax({
//	        url: 'editTesterProfile.do',
//	        data: {
//	        	Fname: $("#Fname").val(),
//	        	Lname: $("#Lname").val(),
//	        	Address: $("#Address").val(),
//	        	Age: $("#Age").val(),
//	        	Edu: $("#Edu").val(),
//	        	Occupation: $("#Occupation").val(),
//	        },
//	        type:'post', //either post or get
//	        dataType: 'json', //get response as json from server
//	        success:function(data){  //this function is called when the ajax function is successfully executed
//	              alert("Success");  OR  console.log(data);
//	         }
//	    });
//	    });
	    
	    $('#editProfileData').click(function () {
	    	$("#Fname").prop("disabled",false)
	    	$("#Lname").prop("disabled",false)
	    	$("#Address").prop("disabled",false)
	    	$("#Age").prop("disabled",false)
	    	$("#Edu").prop("disabled",false)
	    	$("#Occupation").prop("disabled",false)
	    	$("#saveProfileData").prop("disabled",false)
	    	
	    });
	    
	    
//	    $('a.editFname').click(function () {
//	    	$("#Fname").prop("disabled",false)
//	    	$('.editFname').hide();
//	    	$('.saveFname').show();
//	    });
//	    
//	    $('a.editLname').click(function () {
//	    	$("#Lname").prop("disabled",false)
//	    	$('.editLname').hide();
//	    	$('.saveLname').show();
//	    });
//	    
//	    $('a.editAddress').click(function () {
//	    	$("#Address").prop("disabled",false)
//	    	$('.editAddress').hide();
//	    	$('.saveAddress').show();
//	    });
//	    
//	    $('a.editAge').click(function () {
//	    	$("#Age").prop("disabled",false)
//	    	$('.editAge').hide();
//	    	$('.saveAge').show();
//	    });
//	    
//	    $('a.editEdu').click(function () {
//	    	$("#Edu").prop("disabled",false)
//	    	$('.editEdu').hide();
//	    	$('.saveEdu').show();
//	    });
//	    
//	    $('a.editOccupation').click(function () {
//	    	$("#Occupation").prop("disabled",false)
//	    	$('.editOccupation').hide();
//	    	$('.saveOccupation').show();
//	    });
//	    
//	    $('.saveFname').click(function(e) {
//	        $('#editTesterFormID').submit();
//	    });
	
	
	
/* Add support of border radius and box shadow to IE using PIE.js */
Modernizr.load({
	test: Modernizr.borderradius && Modernizr.boxshadow,
	nope: "js/PIE.js",
	complete: function(){
		if(window.PIE){
			$('.pie').each( function(){
				window.PIE.attach(this);
			});			
       	}
    }
});




     
			  			    
						 
/* responsive menu - Flaunt.js v1.0.0 - Copyright 2013 Todd Motto - https://github.com/toddmotto/flaunt-js */	

$('#hmenu').append($('<div id="hmenu-mobile"></div>'));

$('#hmenu ul li').has('ul').prepend('<span class="nav-click"><i class="nav-arrow"></i></span>');

$('#hmenu-mobile').click( function(){
});

$('#hmenu>ul').on('click', '.nav-click', function(){

	// Toggle the nested nav
	$(this).siblings('ul').toggle();
	
	// Toggle the arrow using CSS3 transforms
	$(this).children('.nav-arrow').toggleClass('nav-rotate');
	
});
			 
	
	$('#testDetails').click(function(event){
		var userName = $('#userName').val();
		$.ajax({
			url : 'ajaxShowTestDetails.do',
			type:'POST',
			data: 'userName='+userName,
			success : function(response) {
				
				var result = "<table width='100%'><tbody>";
				$( "#resultTable" ).empty();
				$.each(response, function(i) {
					result += "<tr>"
					result += "<td>" +response[i].appName + "</td>";
					result += "<td>" +response[i].description + "</td>";
					result += "<td>" +response[i].testType + "</td>";
					result += "<td>" +response[i].productOS + "</td>";
					result += "<td>" +response[i].testDeadline + "</td>";
					result += "<td><a href='#'>Send Query</a></td>";
					result += "</tr>";

		        });
				result += "</tbody></table>";
		$( "#resultTable" ).append(result);
			},
			error : function(xhr, status, error) {
				alert(xhr.responseText);
			}
		});
	});
	



});