
var suivi = document.querySelector('#ficheSuivi');





const  generateFiche =  async () => {


    let risk = document.getElementById("risk").value
    let codeProcessus = document.getElementById("codeProcessus").value
    let processus = document.getElementById("processus").value
    let codeRisk = document.getElementById("codeRisk").value


    let xhr = new XMLHttpRequest();
    xhr.open('get', 'http://localhost:8080/risk/getRisk?code='+codeRisk);
    xhr.send();


    xhr.onload = async function() {
        console.log(xhr.response);
        let res =  JSON.parse(xhr.response);
        localStorage.setItem("owner",res.owner);
        localStorage.setItem("frequency",res.frequency);
        localStorage.setItem("riskName", JSON.stringify(risk));

        let xehr = new XMLHttpRequest();
        xehr.open('get', 'http://localhost:8080/impact/getImpact?id='+res.impact.id);
        xehr.send();
        xehr.onload = async function() {
            console.log(xehr.response);
            let rese =  JSON.parse(xehr.response);
            localStorage.setItem("legal",rese.legal);
            localStorage.setItem("image",rese.image);
            localStorage.setItem("performance",rese.performance);
            localStorage.setItem("financial",rese.financial);


        };
    };




    localStorage.setItem("codeRisk",JSON.stringify(codeRisk));
    localStorage.setItem("processusName",JSON.stringify(processus));
    localStorage.setItem("codeProcessus",JSON.stringify(codeProcessus));

    window.open("fiche_suivi.html", "_blank");
}
suivi.addEventListener('click',  generateFiche);

