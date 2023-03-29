<?php require_once(PATH_VIEWS.$page.".php");


if (isset($_POST['nom']) && isset($_POST['prenom']) && isset($_POST['sexe']) && isset($_POST['pays'])){
    
    require_once(PATH_MODELS.'DAO.php');

    $query = new TournoiDAO(null);

    $nombreJoueur = sprintf("%02d", count($query->getJoueur())+1);
    $maxRang = $query->getMaxRang();

    $ajout = $query->addJoueur('J'.$nombreJoueur,stripslashes($_POST['nom']),stripslashes($_POST['prenom']),stripslashes($_POST['sexe']),stripslashes($_POST['pays']),$maxRang);
}
