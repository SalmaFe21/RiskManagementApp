const inputs = document.querySelectorAll(".input");


function addcl(){
	let parent = this.parentNode.parentNode;
	parent.classList.add("focus");
}

function remcl(){
	let parent = this.parentNode.parentNode;
	if(this.value == ""){
		parent.classList.remove("focus");
	}
}


inputs.forEach(input => {
	input.addEventListener("focus", addcl);
	input.addEventListener("blur", remcl);
});

//////

var state=false;
function toggle(){
	if (state){
		document.getElementById("password").setAttribute("type","password");
		document.getElementById('eye').style.color='#7a797e'
		state=false;
	}
	else{
		document.getElementById("password").setAttribute("type","text");
		document.getElementById('eye').style.color='orangered'

		state=true;
	}
}