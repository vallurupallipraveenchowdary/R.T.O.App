$(document).ready(function() {
 
$(function(){

$('form[id="OwnerForm"]').validate({
	  rules: {
	    firstName: 'required',
	    lastName: 'required',
	    
	    
	    email: {
	      required: true,
	      email: true,
	    },
	    phno: {
	      required: true,
	      minlength: 10,
	    }
	  },
	  messages: {
	    firstName: 'FirstName is required',
	    lastName: 'LastName is required',
	    email: 'Enter a valid email',
	    
	    
	    phno: {
	      
	      required: 'phno is mandatory',
	      minlength: 'Phno must be at least 10 characters long'
	      
	    }
	  },
	  submitHandler: function(form) {
	    form.submit();
	  }
	});
  });
});



  
