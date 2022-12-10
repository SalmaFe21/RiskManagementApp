var nextRisk = document.querySelector('#nextRisk');



const  actionTreatement =  async () => {
    let codeAction = document.getElementById("codeAction").value
    let strategy = document.getElementById("strategy").value
    let cost = document.getElementById("cost").value
    
    let date= document.getElementById("dateLancement").value
    let delay= document.getElementById("delay").value
    let avancement= document.getElementById("avancemnet").value
    let actionResponsible =document.getElementById("actionResponsible").value
    let comment =document.getElementById("comment").value
    
    

    let response = await fetch('http://localhost:8080/action/traiterAction',{
        method : 'PUT',
        headers : {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body : JSON.stringify({
           codeAction : codeAction,
            strategy : strategy,
            cost : cost,
            date_action : date,
            delay : delay,
            avancement : avancement,
            responsable_action : actionResponsible,
            Comment : comment
        })  
    })


    nextRisk.value="";
    


}
nextRisk.addEventListener('click',actionTreatement);
