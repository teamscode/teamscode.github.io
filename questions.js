function check(input, correct) {
	var inputs = input.parentElement.parentElement.getElementsByTagName("input");
	for (var i = 0; i < inputs.length; i++) {
		inputs[i].parentElement.style.backgroundColor = "white";

		if (inputs[i].value == correct) {
			input.parentElement.style.backgroundColor = "#4CBB17";
		}
	}

	if (input.value != correct) {
		input.parentElement.style.backgroundColor = "#FF2400";
	}
}