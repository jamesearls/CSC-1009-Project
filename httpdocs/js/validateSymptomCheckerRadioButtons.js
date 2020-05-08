function validateRadioButtons() {
	if($('[name=q1]:checked').length && $('[name=q2]:checked').length && $('[name=q3]:checked').length && $('[name=q4]:checked').length && $('[name=q5]:checked').length && $('[name=q6]:checked').length && $('[name=q7]:checked').length) {
		 return true;
	}
	else {
		alert('Please answer all of the symptom checker questions');
		return false;
	}
}