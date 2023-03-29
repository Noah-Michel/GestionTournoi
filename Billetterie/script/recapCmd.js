var prixAffiche = document.getElementById("prixAffiche");
var prix = document.getElementById("prix");
var nbBillet = document.getElementById("nbBillet");

nbBillet.addEventListener("change", function(){
    console.log('aa');
    prixAffiche.textContent = prixAffiche.textContent.substring(0,16) + prix.textContent.substring(35) * nbBillet.value;
});