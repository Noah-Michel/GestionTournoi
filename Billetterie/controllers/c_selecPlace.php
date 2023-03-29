<?php

$_SESSION['match']=$_SESSION['matchs'][$_GET['match']]['num_Match'];

require_once(PATH_MODELS.'DAO.php');

$querry = new TournoiDAO(null);
$stade = $querry->getStade($_SESSION['matchs'][$_GET['match']]['num_Stade']);
$places = $stade['nb_Places_Stade'];

$querry = new CategorieDAO(null);
$categories = $querry->getCategories();

$querry = new BilletDAO(null);
$billets = $querry->getBilletsMatch();
$bonBillets = ['nb_Billet' => 0, 'num_Match' => NULL];
print_r($bonBillets);

require_once(PATH_VIEWS."selecPlace.php");