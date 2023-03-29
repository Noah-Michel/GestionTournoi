<?php
require_once(PATH_MODELS."DAO.php");

$querry = new TournoiDAO(null);
$matchs = $querry->getMatchs($_SESSION['tournoi'], $_SESSION['tour'], $_POST['date']);
$_SESSION['matchs']=$matchs;

require_once(PATH_VIEWS."selecMatch.php");