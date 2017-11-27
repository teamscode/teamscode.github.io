function check(input, correct) {
	var inputs = input.parentElement.parentElement.getElementsByTagName("input");
	input.parentElement.style.borderRadius = "15px";
	for (var i = 0; i < inputs.length; i++) {
		inputs[i].parentElement.style.backgroundColor = "white";

		if (inputs[i].value == correct) {
			input.parentElement.style.backgroundColor = "#29F463";
		}
	}

	if (input.value != correct) {
		input.parentElement.style.backgroundColor = "#FF828E";
	}
}