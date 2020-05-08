function donatePress(){
	var donateAmount= $("#donateFormID").val();
	
	var donateAmount = parseInt(donateAmount,10);
	
	if(Number.isInteger(donateAmount)&& donateAmount > 0){
		$.get("/donate_amount-" + donateAmount, function(data, status){
			alert("Your donation of £" + donateAmount + " has been received, thank you.");
			$("#donateFormID").val('');
		});	
	}
	else { 
		alert("Please enter a valid amount");
	}
}

function subscribePress(){
	var emailAddress = $("#emailFormID").val();
	
	alert("You will now receive updates at this email address : " + emailAddress);
	$("#emailFormID").val('');
}


