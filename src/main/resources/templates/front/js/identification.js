const inputText = document.querySelector('#txt');
const myButton = document.querySelector('.btn-list');
const list = document.querySelector('.container ul');
const liste = document.querySelector('.containerr ul');
const inputTexte = document.querySelector('#txte');
const myButtone = document.querySelector('.btn-liste');
var nextRisk = document.querySelector('#nextRisk');
var analyser = document.querySelector('#analyser');
var causeList= document.querySelector('#causeList');
var consequenceList= document.querySelector('#consequenceList');
var listOne = Array.from(document.querySelectorAll('#list1>causeList>li'));
var i = 1;


function createCauseList(){
    var causes = [];
  
    for (var j = 0; j < causeList.childNodes.length-1; ++j) {
        causes[j] =  {description : causeList.childNodes[j+1].textContent};
    }
    
    return causes;
    

  }

function createConsequenceList(){
    var consequences = [];
  
    for (var k = 0; k < consequenceList.childNodes.length-1; ++k) {
        consequences[k] = {infos : consequenceList.childNodes[k+1].textContent};
    }
  
    
    return consequences;
    

  }


  var  analyserRiskPage =  async () => {
    await saveRiskIdentification();

    let codeRisk = document.getElementById("codeRisk").value
    let risk = document.getElementById("risk").value
    
    let  processus = document.getElementById("processus").value
    let codeProcessus = document.getElementById("codeProcessus").value

    localStorage.setItem("riskName", JSON.stringify(risk));
    localStorage.setItem("codeRisk", JSON.stringify(codeRisk));
    localStorage.setItem("processus", JSON.stringify(processus));
    localStorage.setItem("codeProcessus", JSON.stringify(codeProcessus));

      window.open("analyse.html", "_self");





  }


const  saveRiskIdentification =  async () => {
    let codeRisk = document.getElementById("codeRisk").value
    let risk = document.getElementById("risk").value
    let  owner = document.getElementById("owner").value
    let  processus = document.getElementById("processus").value
    let codeProcessus = document.getElementById("codeProcessus").value
    let pilote = document.getElementById("pilote").value
    //let cause1 = document.getElementsByTagName(elementCause).value
    //let consequence1 = document.getElementsByName(elementConsequence).value

    //let elementCause = causeList.childNodes[i].textContent ;
    //let elementConsequence = consequenceList.childNodes[i].textContent ;


    
    
    let listCause = createCauseList();
    let listConsequence =createConsequenceList();
    
    console.log(JSON.stringify(listCause));
    console.log(JSON.stringify(listConsequence));


    let response = await fetch('http://localhost:8080/risk/saveidentification',{
        method : 'POST',
        headers : {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body : JSON.stringify({
            code : codeRisk,
            nature : risk,
            owner : owner,
            causeList : listCause ,
            consequenceList : listConsequence,
            processus : {processus : processus, code_processus : codeProcessus, pilote :pilote}
        })  
    })


    nextRisk.value="";
    console.log(response);
    console.log(causeList);
    console.log(consequenceList);


}
nextRisk.addEventListener('click',saveRiskIdentification);
analyser.addEventListener('click',analyserRiskPage);








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