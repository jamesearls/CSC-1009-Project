var password = document.getElementById("password")
  , confirm_password = document.getElementById("confirmedpassword");

function validatePassword(){
  if(password.value != confirmedpasswordpassword.value) {
    confirmedpassword.setCustomValidity("Passwords Don't Match");
  } else {
    confirmedpassword.setCustomValidity('');
  }
}

password.onchange = validatePassword;
confirmedpassword.onkeyup = validatePassword;