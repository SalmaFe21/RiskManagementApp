//////

function deletePost(id){
	var db_id = id.replace("post_", "");
	// Run Ajax request here to delete post from database
	document.body.removeChild(document.getElementById(id));
}
function CustomConfirm(){
	this.render = function(dialog,op,id){
		var winWe = window.innerWidth;
	    var winHe = window.innerHeight;
		var dialogoverlaye = document.getElementById('dialogoverlaye');
	    var dialogboxe = document.getElementById('dialogboxe');
		dialogoverlaye.style.display = "block";
	    dialogoverlaye.style.height = winHe+"px";
		dialogboxe.style.left = (winWe/3) - (550 * .5)+"px";
	    dialogboxe.style.top = "100px";
	    dialogboxe.style.display = "block";
		
		document.getElementById('dialogboxheade').innerHTML = "Attention !";
	    document.getElementById('dialogboxbodye').innerHTML = dialog;
		document.getElementById('dialogboxfoote').innerHTML = '<button class="btn" onclick="Confirm.yes(\''+op+'\',\''+id+'\')">Oui</button> <button class="btn" onclick="Confirm.no()">Non</button>';
	}
	this.no = function(){
		document.getElementById('dialogboxe').style.display = "none";
		document.getElementById('dialogoverlaye').style.display = "none";
	}
	this.yes = function(op,id){
		if(op == "delete__post"){
			deletePost(id);
		}
		document.getElementById('dialogbox').style.display = "none";
		document.getElementById('dialogoverlay').style.display = "none";
	}
}
var Confirm = new CustomConfirm();