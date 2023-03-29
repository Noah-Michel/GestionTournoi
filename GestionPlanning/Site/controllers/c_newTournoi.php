<?php
require_once(PATH_MODELS."DAO.php");
$querry = new TournoiDAO(null);

$joueurs1 = $querry->getJoueurs1();
$joueurs2 = $querry->getJoueurs2();

require_once(PATH_VIEWS."newTournoi.php");