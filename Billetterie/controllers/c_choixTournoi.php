<?php

require_once(PATH_MODELS.'DAO.php');

$querry = new TournoiDAO(null);
$tournois = $querry->getTournois();

if(isset($_POST['tournoi'])){
    $_SESSION['tournoi']=$_POST['tournoi'];
}

require_once(PATH_VIEWS.$page.'.php');