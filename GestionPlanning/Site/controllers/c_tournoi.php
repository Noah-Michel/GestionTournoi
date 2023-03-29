<?php
require_once(PATH_MODELS."DAO.php");

$querry = new TournoiDAO(null);
$seiziemes = $querry->getMatchs(tournoi, 1);
$huitiemes = $querry->getMatchs(tournoi, 2);
$quarts = $querry->getMatchs(tournoi, 3);
$demis = $querry->getMatchs(tournoi, 4);
$finals = $querry->getMatchs(tournoi, 5);

$gagnant16 = $querry->getGagnants(tournoi, 1);
$gagnant8 = $querry->getGagnants(tournoi, 2);
$gagnant4 = $querry->getGagnants(tournoi, 3);
$gagnant2 = $querry->getGagnants(tournoi, 4);
$gagnant1 = $querry->getGagnants(tournoi, 5);

$_SESSION['seiziemes']=$seiziemes;
$_SESSION['huitiemes']=$huitiemes;
$_SESSION['quarts']=$quarts;
$_SESSION['demis']=$demis;
$_SESSION['finals']=$finals;

$_SESSION['gagnant16'] = $gagnant16;
$_SESSION['gagnant8'] = $gagnant8;
$_SESSION['gagnant4'] = $gagnant4;
$_SESSION['gagnant2'] = $gagnant2;
$_SESSION['gagnant1'] = $gagnant1;

require_once(PATH_VIEWS."tournoi.php");