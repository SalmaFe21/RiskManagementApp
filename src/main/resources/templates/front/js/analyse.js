



const inputText = document.querySelector('#txt');
const myButton = document.querySelector('.btn-list');
const list = document.querySelector('.container ul');
const liste = document.querySelector('.containerr ul');
const inputTexte = document.querySelector('#txte');
const myButtone = document.querySelector('.btn-liste');
var image = document.querySelector('#image');
var financial = document.querySelector('#financial');
var performance = document.querySelector('#performance');
var legal = document.querySelector('#legal');



var nextRisk = document.querySelector('#nextRisk');
var actionList= document.querySelector('#actionList');
var effeciencyList = document.querySelector('#effeciencyList');
var riskName = document.querySelector('#risk');
console.log(actionList.childNodes);

var i = 1;


function createActionList(){
    var actions = [];
  
    for (var j = 0; j < actionList.childNodes.length-1; ++j) {
        actions[j] =  {actionMaitrise : actionList.childNodes[j+1].childNodes[0].nodeValue,
             effeciency : Number(effeciencyList.childNodes[j+1].childNodes[0].nodeValue)};
    }
    
    return actions;
  }






const  analyseRisk =  async () => {

    let codeRisk = document.getElementById("codeRisk").value

    let frequency = document.getElementById("frequency").value
    let  kriFormula = document.getElementById("kriFormula").value
    let impactList = {"image" :Number(image.value),"legal": Number(legal.value),"performance" :Number(performance.value),
        "financial": Number(financial.value)};
    console.log(JSON.stringify(impactList));



    //let cause1 = document.getElementsByTagName(elementCause).value
    //let consequence1 = document.getElementsByName(elementConsequence).value

    //let elementCause = causeList.childNodes[i].textContent ;
    //let elementConsequence = consequenceList.childNodes[i].textContent ;
    
    let listAction = createActionList();

    console.log(JSON.stringify(listAction));
    

    let response = await fetch('http://localhost:8080/risk/analyseRisk',{
        method : 'PUT',
        headers : {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body : JSON.stringify({
            code : codeRisk,
            frequency : frequency,
            KRI_formula : kriFormula,
            impact : impactList ,
            actionList : listAction
        })  
    })
    console.log(response);

    nextRisk.value="";
    


}
nextRisk.addEventListener('click',analyseRisk);





myButton.addEventListener('click', (e)=>{
    if(inputText.value !=""){
        e.preventDefault();
        const myLi = document.createElement('li');
        myLi.innerHTML = inputText.value;
        list.appendChild(myLi);

        const mySpan = document.createElement('span');
        mySpan.innerHTML = 'x';
        myLi.appendChild(mySpan);
    }
    const close = document.querySelectorAll('span');
    for(let i=0 ; i<close.length; i++){
        close[i].addEventListener('click', ()=>{
            close[i].parentElement.style.opacity = 0;
            setTimeout(()=>{
                close[i].parentElement.style.display = 'none';
                close[i].parentElement.remove();
            },500);
        })
    }
    inputText.value = ""; 
});

myButtone.addEventListener('click', (e)=>{
    if(inputTexte.value !=""){
        e.preventDefault();
        const myLie = document.createElement('li');
        myLie.innerHTML = inputTexte.value;
        liste.appendChild(myLie);

        const mySpane = document.createElement('span');
        mySpane.innerHTML = 'x';
        myLie.appendChild(mySpane);
    }
    const closee = document.querySelectorAll('span');
    for(let i=0 ; i<closee.length; i++){
        closee[i].addEventListener('click', ()=>{
            closee[i].parentElement.style.opacity = 0;
            setTimeout(()=>{
                closee[i].parentElement.style.display = 'none';
                closee[i].parentElement.remove();
            },500);
        })
    }
    inputTexte.value = ""; 
});