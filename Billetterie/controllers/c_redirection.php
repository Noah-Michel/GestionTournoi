<?php
if(!$_SESSION['billets_Envoyes']){
    require_once(PATH_MODELS.'DAO.php');

    $query = new BilletDAO(null);
    for($i=0; $i<$_POST['nbBillet']; $i++){
        $billet = $query->ajoutBillet('B'.sprintf("%02d", count($query->getBillets())+1),$_SESSION['match'], $_SESSION['categorie']['num_Categorie']);
    }

    $query = new TournoiDAO(null);
    $maj = $query->ajoutCagnotte($_SESSION['tournoi'], $_SESSION['categorie']['prix_Categorie']*$_POST['nbBillet']);

    $_SESSION['billet_Envoyes'] = true;
}
require_once(PATH_VIEWS.$page.'.php');