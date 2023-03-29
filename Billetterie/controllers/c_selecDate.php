<?php
require_once(PATH_MODELS."DAO.php");

$_SESSION['tour'] = $_POST['tour'];

$querry = new TournoiDAO(null);
$dates = $querry->getDates($_SESSION['tournoi'], $_SESSION['tour']);

require_once(PATH_VIEWS."selecDate.php");