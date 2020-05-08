 function validateForm() {
			      var email = document.forms["signup"]["email"].value;
			      if(email =="") {
			         alert("Cannot submit an empty form");
			         return false; 
			         }
				var username = document.forms["signup"]["username"].value;
			      if(username =="") {
			         alert("Cannot submit an empty form");
			         return false; 
			         }
				var password = document.forms["signup"]["password"].value;
			      if(password =="") {
			         alert("Cannot submit an empty form");
			         return false; 
			         }
				var confirmedpassword = document.forms["signup"]["confirmedpassword"].value;
			      if(confirmedpassword =="") {
			         alert("Cannot submit an empty form");
			         return false; 
			         } 
			      if(document.forms["signup"]["password"].value != document.forms["signup"]["confirmedpassword"].value){
					alert("Passwords must match!");
					return false;
				 }
			      return true;

			 }


